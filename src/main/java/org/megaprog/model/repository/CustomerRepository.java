package org.megaprog.model.repository;

import org.megaprog.model.dao.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Rafael R. S. Robles
 */
@Component
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
