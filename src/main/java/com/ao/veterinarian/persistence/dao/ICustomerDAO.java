package com.ao.veterinarian.persistence.dao;

import com.ao.veterinarian.persistence.entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface ICustomerDAO {

    List<CustomerEntity> findAll();

    Optional<CustomerEntity> findById(Long id);

    CustomerEntity create(CustomerEntity customer);

    CustomerEntity update(CustomerEntity customer);

    CustomerEntity delete(CustomerEntity customer);

}
