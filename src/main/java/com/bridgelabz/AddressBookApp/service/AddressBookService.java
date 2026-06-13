package com.bridgelabz.AddressBookApp.service;

import com.bridgelabz.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.AddressBookApp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private final List<AddressBookData> addressBookList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return addressBookList.stream()
                .filter(contact -> contact.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO dto) {

        AddressBookData data =
                new AddressBookData(
                        addressBookList.size() + 1,
                        dto.getName(),
                        dto.getCity(),
                        dto.getState()
                );

        addressBookList.add(data);

        return data;
    }

    @Override
    public AddressBookData updateAddressBookData(int id,
                                                 AddressBookDTO dto) {

        AddressBookData data = getAddressBookDataById(id);

        if (data != null) {
            data.setName(dto.getName());
            data.setCity(dto.getCity());
            data.setState(dto.getState());
        }

        return data;
    }

    @Override
    public void deleteAddressBookData(int id) {
        addressBookList.removeIf(contact -> contact.getId() == id);
    }
}