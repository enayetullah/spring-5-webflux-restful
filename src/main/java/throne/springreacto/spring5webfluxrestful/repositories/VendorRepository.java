package throne.springreacto.spring5webfluxrestful.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import throne.springreacto.spring5webfluxrestful.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
