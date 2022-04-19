package com.Angel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Angel.Item;
import com.Angel.ItemService;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    // display list of items
    @GetMapping("/itemHome")
    public String viewHomePage(Model model) {
        model.addAttribute("listItems", itemService.getAllItems());
        return "itemHome";
    }

    @GetMapping("/showNewItemForm")
    public String showNewItemForm(Model model) {
        // create model attribute to bind form data
        Item item = new Item();
        model.addAttribute("item", item);
        return "new_item";
    }

    @PostMapping("/saveItem")
    public String saveItem(@ModelAttribute("item") Item item) {
        // save item to database
        itemService.saveItem(item);
        return "redirect:/itemHome";
    }

    @GetMapping("/showFormForCustUpdate/{id}")
    public String showFormForCustUpdate(@PathVariable(value = "id") long id, Model model) {

        // get item from the service
        Item item = itemService.getItemById(id);

        // set item as a model attribute to pre-populate the form
        model.addAttribute("item", item);
        return "update_item";
    }

    @GetMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable(value = "id") long id) {

        // call delete item method 
        this.itemService.deleteItemById(id);
        return "redirect:/itemHome";
    }
}
