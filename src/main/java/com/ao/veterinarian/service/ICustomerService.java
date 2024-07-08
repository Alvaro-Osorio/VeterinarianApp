package com.ao.veterinarian.service;

import com.ao.veterinarian.controller.DTOs.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    Optional<CustomerDTO> findById(Long id);

    List<CustomerDTO> findAll();

    CustomerDTO create(CustomerDTO customerDTO);

    CustomerDTO update(CustomerDTO customerDTO, Long id);

    String delete(Long id);


}
