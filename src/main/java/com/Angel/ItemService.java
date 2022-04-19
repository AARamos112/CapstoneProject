package com.Angel;

import java.util.List;

import com.Angel.Item;

public interface ItemService {
    List < Item > getAllItems();
    void saveItem(Item item);
    Item getItemById(long id);
    void deleteItemById(long id);
}
