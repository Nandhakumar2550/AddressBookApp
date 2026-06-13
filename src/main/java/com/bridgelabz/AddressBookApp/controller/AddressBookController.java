package com.bridgelabz.AddressBookApp.controller;

import com.bridgelabz.AddressBookApp.service.IAddressBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final IAddressBookService addressBookService;

    public AddressBookController(IAddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    @GetMapping
    public String getAddressBookData() {
        return addressBookService.getAddressBookData();
    }
}