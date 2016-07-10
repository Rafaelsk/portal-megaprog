package org.megaprog.controller;

import org.megaprog.model.dao.Customer;
import org.megaprog.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Rafael R. S. Robles
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * Get a full list of all customers
     * @return A list of the customers
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    /**
     * Get a single customer
     * @param id The customer's id
     * @return A customer
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getCustomer(@PathVariable String id) {
        return customerRepository.findOne(id).toString();
    }

    /**
     * Saves a new customer
     * @param customer The new customer
     * @return The saved customer
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String newCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer).toString();
    }
}
