package com.hms.address;

import com.hms.address.Address;
import com.hms.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/address")
    public List<Address> getAllAddress() {
        return addressService.getAllAddresses();
    }

    @RequestMapping("/address/{id}")
    public Optional<Address> getAddress(@PathVariable int id) {
        return addressService.getAddress(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/address")
    public void addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/address/{id}")
    public void updateAddress(@PathVariable int id, @RequestBody Address address) {
        addressService.updateAddress(id, address);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/address/{id}")
    public void deleteAddress(@PathVariable int id) {
        addressService.deleteAddress(id);
    }
}
