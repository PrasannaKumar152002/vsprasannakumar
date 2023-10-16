package Services;

import Database.ConnectionUtility;
import Database.ItemMaster;
import Database.ItemMasterDAOImpl;

public class ItemServiceImpl implements ItemService {
	@Override
	public ItemMaster ItemData(String name) {
		try {
			ItemMasterDAOImpl imp = new ItemMasterDAOImpl(ConnectionUtility.getConnection());
			ItemMaster im = imp.findByName(name);
			return im;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int Quantity(int num, String name) {
		// TODO Auto-generated method stub
		try {
			ItemMasterDAOImpl imp = new ItemMasterDAOImpl(ConnectionUtility.getConnection());
			ItemMaster im = imp.findByName(name);
			im.setQuantity(im.getQuantity() - num);
			System.out.println(im.getQuantity());
			return imp.updateItemByID(im);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
