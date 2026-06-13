package com.bridgelabz.AddressBookApp.service;

import com.bridgelabz.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.AddressBookApp.model.AddressBookData;
import com.bridgelabz.AddressBookApp.repository.AddressBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private final AddressBookRepository repository;

    public AddressBookService(AddressBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AddressBookData> getAddressBookData() {
        return repository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO dto) {

        AddressBookData data =
                new AddressBookData(
                        0,
                        dto.getName(),
                        dto.getCity(),
                        dto.getState()
                );

        return repository.save(data);
    }
    @Override
  public AddressBookData updateAddressBookData(int id,
                                             AddressBookDTO dto) {

    AddressBookData data =
            repository.findById(id).orElse(null);

    if(data != null){
        data.setName(dto.getName());
        data.setCity(dto.getCity());
        data.setState(dto.getState());

        return repository.save(data);
    }

    return null;
    }
}