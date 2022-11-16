package com.product.service;

import com.product.pojo.Product;
import com.product.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getALLProduct(){
        return productRepo.findAll();
    }
    public Optional<Product> getProductById(int id){
        return productRepo.findById(id);
    }

    public Optional<Product> getProductByName(String name){
        return productRepo.findByName(name);
    }

    public Product addNewProduct(Product product){
        return productRepo.save(product);
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }
}
