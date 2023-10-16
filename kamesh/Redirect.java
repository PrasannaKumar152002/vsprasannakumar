package Action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.InvoiceMaster;
import Database.ItemMaster;
import Services.ItemServiceImpl;

public class Redirect extends Action {
	HttpSession hs;
	ServletContext application;
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		hs=request.getSession();
		application=request.getServletContext();
		Enumeration<String> e = request.getParameterNames();
		ItemServiceImpl is=new ItemServiceImpl();
		List ls=new ArrayList<ItemMaster>();
		while(e.hasMoreElements())
		{
			String name = e.nextElement().toString().toLowerCase();
			String value = request.getParameter(name).toString();
			if (!name.equals("formid")) {
				ItemMaster ims=is.ItemData(name);
				System.out.println(ims.getItemName());
				ims.setValue(Integer.parseInt(value));
				is.Quantity(ims.getValue(), name);
				ls.add(ims);
			}		
		}
		InvoiceMaster im=new InvoiceMaster();
		Properties p=new Properties();
		String str = application.getRealPath("/WEB-INF/Inc.properties");
		try {
			p.load(new FileInputStream(str));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Integer n=Integer.parseInt(p.getProperty("Id"));
		im.setCustomerId(n);
		n+=1;
		p.setProperty("Id", (n).toString());
		Integer r=Integer.parseInt(p.getProperty("IId"));
		im.setInvoiceId(r);
		p.setProperty("IId", (++r).toString());
		try {
			p.store(new FileOutputStream(str), "Saved");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Database.CrudDAO cd=Database.CrudDAOImpl.getServiceImpl(); 
		try {
			Database.CrudDTO ct=cd.findByUser((String) hs.getAttribute("username"));
			im.setCustomerName(ct.getName());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		im.setItem(ls);
		hs.setAttribute("Items", im);
		return "val";
	}
}

