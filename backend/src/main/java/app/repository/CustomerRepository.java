package app.repository;

import org.springframework.data.repository.CrudRepository;

import app.entity.Customer;

/**
 * <p>
 * author: julienne.schreiber
 * date: 18/01/18
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
