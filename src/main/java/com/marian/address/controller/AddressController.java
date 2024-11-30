package com.marian.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marian.address.modal.AddressModal;
import com.marian.address.service.AddressService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AddressController {
    
    @Autowired
    public AddressService addressService;
    
    @GetMapping("/api/address")
    public List<AddressModal> showAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping("/api/address")
    public AddressModal addNewAddress(@RequestBody AddressModal address) {
        return addressService.saveAddress(address);
    }
}