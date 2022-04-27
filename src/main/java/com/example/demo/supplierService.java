package com.example.demo;

import com.example.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class supplierService {
    @Autowired
    SupplierRepository SupplierRepository;




    public List<supplier> getAllSupplier()
    {
        List<supplier> supplier = new ArrayList<supplier>();
        SupplierRepository.findAll().forEach(supplier1 -> supplier.add(supplier1));
        return supplier;
    }

    public supplier getSupplierById(int id)
    {
        return SupplierRepository.findById(id).get();
    }

    public void saveOrUpdate(supplier supplier)
    {
        SupplierRepository.save(supplier);
    }

    public void delete(int id)
    {
        SupplierRepository.deleteById(id);
    }

    public void update(supplier sup, int supplierid)
    {
        SupplierRepository.save(sup);
    }

}
