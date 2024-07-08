package com.ao.veterinarian.persistence.dao.impl;

import com.ao.veterinarian.persistence.dao.ICustomerDAO;
import com.ao.veterinarian.persistence.entity.CustomerEntity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

    private EntityManager entityManager;
    @Override
    public List<CustomerEntity> findAll() {
        return null;
    }

    @Override
    public Optional<CustomerEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public CustomerEntity create(CustomerEntity customer) {
        return null;
    }

    @Override
    public CustomerEntity update(CustomerEntity customer) {
        return null;
    }

    @Override
    public CustomerEntity delete(CustomerEntity customer) {
        return null;
    }
}
