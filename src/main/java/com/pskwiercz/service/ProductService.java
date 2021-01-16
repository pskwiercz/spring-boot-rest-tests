package com.pskwiercz.service;

import com.pskwiercz.model.Product;
import com.pskwiercz.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    void setProductRepository(ProductRepository productRepository);
    Product addProduct(Product product) throws ProductAlreadyExistsException;
    List<Product> getAllProducts();
    Product getProductByid(int id);
    Product deleteProductById(int id);
}
