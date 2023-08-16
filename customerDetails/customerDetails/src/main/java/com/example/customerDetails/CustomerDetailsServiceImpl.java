package com.example.customerDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    private final CustomerDetailsRepository repository;

    @Autowired
    public CustomerDetailsServiceImpl(CustomerDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerDetails> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public CustomerDetails getCustomerById(Long key) {
        Optional<CustomerDetails> optionalCustomer = repository.findById(key);
        return optionalCustomer.orElse(null);
    }

    @Override
    public CustomerDetails createCustomer(CustomerDetails customer) {

        return repository.save(customer);
    }

    @Override
    public CustomerDetails updateCustomer(Long key, CustomerDetails customer) {
        if (repository.existsById(key)) {
            customer.setKey(key);
            return repository.save(customer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long key) {
        repository.deleteById(key);
    }
}
