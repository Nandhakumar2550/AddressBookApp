package com.bridgelabz.AddressBookApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping
    public String getAddressBookData() {
        return "Get Address Book Data";
    }

    @GetMapping("/{id}")
    public String getAddressBookDataById(@PathVariable int id) {
        return "Get Address Book Data By Id : " + id;
    }

    @PostMapping
    public String addAddressBookData() {
        return "Create Address Book Data";
    }

    @PutMapping("/{id}")
    public String updateAddressBookData(@PathVariable int id) {
        return "Update Address Book Data For Id : " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteAddressBookData(@PathVariable int id) {
        return "Delete Address Book Data For Id : " + id;
    }
}