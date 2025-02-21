package Repository.custom.impl;

import Dto.Customer;
import Repository.custom.CustomerDao;
import entity.CustomerEntity;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {

        System.out.println("Repocitory : " + entity);
        return false;
    }

    @Override
    public boolean update(String s, CustomerEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public CustomerEntity search(String s) {
        return null;
    }

    @Override
    public List<CustomerEntity> getAll() {
        return List.of();
    }
}
