package com.bridgelabz.AddressBookApp.service;

import com.bridgelabz.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.AddressBookApp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int id);

    AddressBookData createAddressBookData(AddressBookDTO dto);

    AddressBookData updateAddressBookData(int id, AddressBookDTO dto);

    void deleteAddressBookData(int id);
}