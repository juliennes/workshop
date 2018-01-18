package app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.service.CustomerService;
import app.web.dto.CustomerDto;

/**
 * <p>
 * author: julienne.schreiber
 * date: 18/01/18
 */
@CrossOrigin
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public CustomerDto findOne(@PathVariable("id") final Long id) {
        return customerService.findOne(id);
    }

}
