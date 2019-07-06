package throne.springreacto.spring5webfluxrestful.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import throne.springreacto.spring5webfluxrestful.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
