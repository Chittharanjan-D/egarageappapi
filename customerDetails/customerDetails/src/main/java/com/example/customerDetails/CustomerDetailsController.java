package com.example.customerDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {

    private final CustomerDetailsService customerService;

    @Autowired
    public CustomerDetailsController(CustomerDetailsService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDetails> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{key}")
    public CustomerDetails getCustomerById(@PathVariable Long key) {
        return customerService.getCustomerById(key);
    }

    @PostMapping
    public CustomerDetails createCustomer(@RequestBody CustomerDetails customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{key}")
    public CustomerDetails updateCustomer(@PathVariable Long key, @RequestBody CustomerDetails customer) {
        return customerService.updateCustomer(key, customer);
    }

    @DeleteMapping("/{key}")
    public void deleteCustomer(@PathVariable Long key) {
        customerService.deleteCustomer(key);
    }
}
