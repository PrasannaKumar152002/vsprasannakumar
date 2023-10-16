package Services;

import Database.ItemMaster;

public interface ItemService {
	public int Quantity(int num,String name);
	public ItemMaster ItemData(String name);
}
