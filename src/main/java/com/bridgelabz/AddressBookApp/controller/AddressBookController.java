package com.bridgelabz.AddressBookApp.controller;

import com.bridgelabz.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.AddressBookApp.model.AddressBookData;
import com.bridgelabz.AddressBookApp.service.IAddressBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final IAddressBookService addressBookService;

    public AddressBookController(IAddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    @GetMapping
public List<AddressBookData> getAllContacts() {

        return addressBookService.getAddressBookData();
}

@GetMapping("/{id}")
public AddressBookData getContactById(@PathVariable int id) {

        return addressBookService.getAddressBookDataById(id);
}

@PostMapping
public AddressBookData addContact(
        @RequestBody AddressBookDTO dto) {
    return addressBookService.createAddressBookData(dto);
    }
    @PutMapping("/{id}")
    public AddressBookData updateContact(
            @PathVariable int id,
            @RequestBody AddressBookDTO dto) {

        return addressBookService
                .updateAddressBookData(id, dto);
    }
    @DeleteMapping("/{id}")
    public String deleteContact(
            @PathVariable int id) {

        addressBookService.deleteAddressBookData(id);

        return "Deleted Contact Id : " + id;
    }

}