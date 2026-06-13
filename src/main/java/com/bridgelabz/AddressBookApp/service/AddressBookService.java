package com.bridgelabz.AddressBookApp.service;

import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public String getAddressBookData() {
        return "Address Book Service Called";
    }
}