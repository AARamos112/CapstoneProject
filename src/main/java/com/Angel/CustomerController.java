package com.Angel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Angel.Customer;
import com.Angel.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // display list of customers
    @GetMapping("/customerHome")
    public String viewHomePage(Model model) {
        model.addAttribute("listCustomers", customerService.getAllCustomers());
        return "customerHome";
    }

    @GetMapping("/showNewCustomerForm")
    public String showNewCustomerForm(Model model) {
        // create model attribute to bind form data
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new_customer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        // save customer to database
        customerService.saveCustomer(customer);
        return "redirect:/customerHome";
    }

    @GetMapping("/showFormForCustUpdate/{id}")
    public String showFormForCustUpdate(@PathVariable(value = "id") long id, Model model) {

        // get customer from the service
        Customer customer = customerService.getCustomerById(id);

        // set customer as a model attribute to pre-populate the form
        model.addAttribute("customer", customer);
        return "update_customer";
    }

    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") long id) {

        // call delete customer method 
        this.customerService.deleteCustomerById(id);
        return "redirect:/customerHome";
    }
}
