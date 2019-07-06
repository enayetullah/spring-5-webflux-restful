package throne.springreacto.spring5webfluxrestful.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import throne.springreacto.spring5webfluxrestful.domain.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
