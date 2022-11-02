package com.hms.address;

import com.hms.address.Address;
import com.hms.address.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        List<Address> addresses = new ArrayList<>();
        addressRepository.findAll().forEach(addresses::add);
        return addresses;
    }

    public Optional<Address> getAddress(int id){
        Optional<Address> byId = addressRepository.findById(id);
        return byId;
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void updateAddress(int id, Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}
