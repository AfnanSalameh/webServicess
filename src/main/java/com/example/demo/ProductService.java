package com.example.demo;

import com.example.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    @Autowired
    ProductRepository ProductRepository;
    ProductRepository ProductRepository;


    public List<product> getAllProduct()
    {
        List<product> product = new ArrayList<product>();
        ProductRepository.findAll().forEach(product1 -> supplier.add(product1));
        return product;
    }

    public product getProductById(int id)
    {
        return ProductRepository.findById(id).get();
    }

    public void saveOrUpdate(product product)
    {
        ProductRepository.save(product);
    }

    public void delete(int id)
    {
        ProductRepository.deleteById(id);
    }

    public void update(product pro, int prodectID)
    {
        ProductRepository.save(pro);
    }

}
