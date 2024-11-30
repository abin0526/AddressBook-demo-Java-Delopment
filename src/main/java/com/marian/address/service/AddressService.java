package com.marian.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.address.repository.AddressRepository;
import com.marian.address.modal.AddressModal;

@Service
public class AddressService {
    
    @Autowired
    public AddressRepository addressRepo;
    
    public List<AddressModal> getAllAddresses() {
        return addressRepo.findAll();
    }

    public AddressModal saveAddress(AddressModal address) {
        return addressRepo.save(address);
    }
}