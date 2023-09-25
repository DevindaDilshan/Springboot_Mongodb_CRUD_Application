package com.devindadilshan.SpringbootMongodbCRUD.repo;

import com.devindadilshan.SpringbootMongodbCRUD.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {
}
