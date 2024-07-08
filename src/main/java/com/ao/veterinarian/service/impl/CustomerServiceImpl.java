package com.ao.veterinarian.service.impl;

import com.ao.veterinarian.controller.DTOs.CustomerDTO;
import com.ao.veterinarian.persistence.dao.ICustomerDAO;
import com.ao.veterinarian.persistence.entity.CustomerEntity;
import com.ao.veterinarian.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public Optional<CustomerDTO> findById(Long id) {

        Optional<CustomerEntity> optionalCustomer = this.customerDAO.findById(id);
        if (optionalCustomer.isPresent()){
            CustomerEntity customerEntity = optionalCustomer.get();

            CustomerDTO customerDTO = CustomerDTO.builder()
                    .id(customerEntity.getId())
                    .name(customerEntity.getName())
                    .lastName(customerEntity.getLastName())
                    .address(customerEntity.getAddress())
                    .phone(customerEntity.getPhone())
                    .build();
        return Optional.of(customerDTO);
        }
        else {
            return Optional.of(new CustomerDTO());
        }
    }

    @Override
    public List<CustomerDTO> findAll() {

        List<CustomerEntity> customersList = this.customerDAO.findAll();

        if (!customersList.isEmpty()) {
            List<CustomerDTO> customerDTOList;
            customerDTOList = customersList.stream()
                    .map(customer -> CustomerDTO.builder()
                            .id(customer.getId())
                            .name(customer.getName())
                            .lastName(customer.getLastName())
                            .address(customer.getAddress())
                            .phone(customer.getPhone())
                            .build()
                    ).toList();
            return customerDTOList;
        }
        return null;
    }

    @Override
    public CustomerDTO create(CustomerDTO customerDTO) {

        try {
            this.customerDAO.create(CustomerEntity.builder()
                    .name(customerDTO.getName())
                    .lastName(customerDTO.getLastName())
                    .address(customerDTO.getAddress())
                    .phone(customerDTO.getPhone())
                    .build());
            return customerDTO;
        }catch (Exception e){
            throw  new UnsupportedOperationException("Error al guardar el registro");
        }
    }

    @Override
    public CustomerDTO update(CustomerDTO customerDTO, Long id) {
        Optional<CustomerEntity> optionalCustomer = this.customerDAO.findById(id);

        try {
            if (optionalCustomer.isPresent()) {
                CustomerEntity customer = optionalCustomer.get();
                customer.setName(customerDTO.getName());
                customer.setLastName(customerDTO.getLastName());
                customer.setAddress(customerDTO.getAddress());
                customer.setPhone(customerDTO.getPhone());
                this.customerDAO.update(customer);
            }
            return customerDTO;
        }catch (Exception e){
            throw  new UnsupportedOperationException("Error al actualizar el registro");
        }
    }

    @Override
    public String delete(Long id) {
        Optional<CustomerEntity> optionalCustomer = this.customerDAO.findById(id);
        if (optionalCustomer.isPresent()){
            CustomerEntity customerEntity = optionalCustomer.get();
            this.customerDAO.delete(customerEntity);
            return "El cliente ha sido eliminado";
        }else{
            return "El cliente no existe";
        }
    }
}
