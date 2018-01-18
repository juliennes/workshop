package app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Customer;
import app.repository.CustomerRepository;
import app.web.dto.CustomerDto;

/**
 * <p>
 * author: julienne.schreiber
 * date: 18/01/18
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDto findOne(final Long id) {
        return Optional.ofNullable(customerRepository.findOne(id))
                       .map(this::toDto)
                       .orElse(null);
    }

    private CustomerDto toDto(final Customer customer) {
        return new CustomerDto(customer.getId(), customer.getFirstName(), customer.getLastName());
    }
}
