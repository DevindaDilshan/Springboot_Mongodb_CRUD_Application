package com.devindadilshan.SpringbootMongodbCRUD.service;

import com.devindadilshan.SpringbootMongodbCRUD.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();
    public Product addProduct(Product product);
    public Product deleteProduct(int id);
    public Product updateProduct(int id, Product product);

}
