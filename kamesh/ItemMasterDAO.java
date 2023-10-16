package Database;

import java.sql.Savepoint;
import java.util.List;

public interface ItemMasterDAO {
	public ItemMaster findByID(int eno);
	public ItemMaster findByName(String name);
	public List<ItemMaster> findAll();
	public int createItem(ItemMaster im);
	public int updateItemByID(ItemMaster im);
	public int deleteItemByID(int eno);
	public void closeconnection(Exception e, Savepoint s);

}
