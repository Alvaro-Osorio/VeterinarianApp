package com.ao.veterinarian.service;

import com.ao.veterinarian.controller.DTOs.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    Optional<CustomerDTO> findById();

    List<CustomerDTO> findAll();

    void create(CustomerDTO customerDTO);

    void delete(Long id);


}
