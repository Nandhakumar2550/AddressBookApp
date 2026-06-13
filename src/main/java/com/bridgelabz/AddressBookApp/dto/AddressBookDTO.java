package com.bridgelabz.AddressBookApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {

    @NotBlank(message = "Name cannot be empty")
private String name;

@NotBlank(message = "City cannot be empty")
private String city;

@NotBlank(message = "State cannot be empty")
private String state;
}