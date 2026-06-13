package com.bridgelabz.AddressBookApp.repository;

import com.bridgelabz.AddressBookApp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository
        extends JpaRepository<AddressBookData, Integer> {
}