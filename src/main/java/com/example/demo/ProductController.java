package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")

    private List<product> getAllProduct(){
        return ProductService.getAllProduct();
    }

    @DeleteMapping("/product/{productID}")
    private void deleteproduct(@PathVariable("productID") int productID)
    {
        supplierService.delete(productID);
    }
}
