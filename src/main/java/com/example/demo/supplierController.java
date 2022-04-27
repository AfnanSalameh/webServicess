package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class supplierController {

    @Autowired
    supplierService supplierService;

    @GetMapping("/supplier")

    private List<supplier> getAllSupplier(){
        return supplierService.getAllSupplier();
    }

    @DeleteMapping("/supplier/{supplier_id}")
    private void deleteSupplier(@PathVariable("supplier_id") int supplier_id)
    {
        supplierService.delete(supplier_id);
    }
}
