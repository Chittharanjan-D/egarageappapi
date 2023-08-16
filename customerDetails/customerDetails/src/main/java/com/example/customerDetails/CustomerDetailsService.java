package com.example.customerDetails;

import java.util.List;

public interface CustomerDetailsService {
    List<CustomerDetails> getAllCustomers();
    CustomerDetails getCustomerById(Long id);
    CustomerDetails createCustomer(CustomerDetails customer);
    CustomerDetails updateCustomer(Long id, CustomerDetails customer);
    void deleteCustomer(Long id);
}
