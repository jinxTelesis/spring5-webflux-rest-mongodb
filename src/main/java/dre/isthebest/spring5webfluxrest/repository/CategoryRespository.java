package dre.isthebest.spring5webfluxrest.repository;

import dre.isthebest.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRespository extends ReactiveMongoRepository<Category, Long> {
    
}
