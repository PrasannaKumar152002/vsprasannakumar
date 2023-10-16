package Database;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemMasterDAOImpl implements ItemMasterDAO {
	Connection con = null;
	List<ItemMaster> lt;

	public ItemMasterDAOImpl(Connection con) {
		this.con = con;
	}

	@Override
	public ItemMaster findByID(int eno) {
		String sql = "select * from ItemMaster where itemid=?";
		PreparedStatement pr;
		try {
			pr = con.prepareStatement(sql);
			pr.setInt(1, eno);
			ResultSet r = pr.executeQuery();
			ItemMaster it = new ItemMaster();
			if (r.next()) {
				it.setItemId(r.getInt(1));
				it.setItemName(r.getString(2));
				it.setQuantity(r.getLong(4));
				it.setPrice(r.getFloat(3));
				it.setCategory(r.getString(5));
				// it.setImage(r.getBytes(5));
			}
			return it;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			closeconnection(e, null);
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public ItemMaster findByName(String name) {
		try {
			String sql = "select * from ItemMaster where itemname=?";
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setString(1, name);
			ResultSet r = pr.executeQuery();
			//System.out.println(r);
			ItemMaster it = new ItemMaster();
			if (r.next()) {
				it.setItemId(r.getInt(1));
				System.out.println(it.getItemId());
				it.setItemName(r.getString(2));
				System.out.println(it.getItemName());
				it.setQuantity(r.getLong(4));
				System.out.println(it.getQuantity());
				it.setPrice(r.getFloat(3));
				System.out.println(it.getPrice());
				it.setCategory(r.getString(5));
				// it.setImage(r.getBytes(5));
			}
			return it;
		} catch (Exception e) {
			closeconnection(e, null);
			//System.out.println(r.getLong);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ItemMaster> findAll() {
		try {
			String sql = "select * from ItemMaster";
			Statement pr = con.createStatement();
			// pr.setInt(1, eno);
			ResultSet r = pr.executeQuery(sql);
			ItemMaster it;
			lt = new ArrayList<ItemMaster>();
			while (r.next()) {
				it = new ItemMaster();
				it.setItemId(r.getInt(1));
				it.setItemName(r.getString(2));
				it.setQuantity(r.getLong(4));
				it.setPrice(r.getFloat(3));
				it.setCategory(r.getString(5));
				// it.setImage(r.getBytes(5));
				lt.add(it);
			}
			return lt;
		} catch (Exception e) {
			closeconnection(e, null);
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int createItem(ItemMaster im) {
		try {
			String sql = "insert into ItemMaster values(?,?,?,?,?)";
			PreparedStatement pd = con.prepareStatement(sql);
			pd.setInt(1, im.getItemId());
			pd.setString(2, im.getItemName());
			pd.setLong(4, im.getQuantity());
			pd.setFloat(3, im.getPrice());
			pd.setString(5, im.getCategory());
			// pd.setBytes(5, im.getQuantity());
			int n = pd.executeUpdate();
			return n;
		} catch (Exception e) {
			closeconnection(e, null);
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateItemByID(ItemMaster im) {
		try {
			System.out.println(im);
			String sql = "update ItemMaster set itemname=?,quantity=?,price=?,category=? where itemid=?";
			PreparedStatement pd = con.prepareStatement(sql);
			pd.setInt(4, im.getItemId());
			pd.setString(1, im.getItemName());
			pd.setLong(2, im.getQuantity());
			pd.setFloat(3, im.getPrice());
			pd.setString(5, im.getCategory());
			// pd.setBytes(4, im.getImage());
			int n = pd.executeUpdate();
			System.out.println("result-"+n);
			closeconnection(null, null);
			return n;
		} catch (Exception e) {
			closeconnection(e, null);
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteItemByID(int eno) {
		try {
			String sql = "delete from ItemMaster where itemid=?";
			PreparedStatement pd = con.prepareStatement(sql);
			pd.setInt(1, eno);
			int n = pd.executeUpdate();
			return n;
		} catch (Exception e) {
			closeconnection(e, null);
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void closeconnection(Exception e, Savepoint s) {
		ConnectionUtility.closeConnection(e, s);

	}
}
