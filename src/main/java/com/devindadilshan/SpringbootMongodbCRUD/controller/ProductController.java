package com.devindadilshan.SpringbootMongodbCRUD.controller;

import com.devindadilshan.SpringbootMongodbCRUD.entity.Product;
import com.devindadilshan.SpringbootMongodbCRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/create")
    public Product insert(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable int id ,@RequestBody  Product product) {
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/delete/{id}")
    public Product delete(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
