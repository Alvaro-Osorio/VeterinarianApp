package com.ao.veterinarian.service.impl;

import com.ao.veterinarian.controller.DTOs.CustomerDTO;
import com.ao.veterinarian.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {



    @Override
    public Optional<CustomerDTO> findById() {
        return Optional.empty();
    }

    @Override
    public List<CustomerDTO> findAll() {
        return null;
    }

    @Override
    public void create(CustomerDTO customerDTO) {

    }

    @Override
    public void delete(Long id) {

    }
}
