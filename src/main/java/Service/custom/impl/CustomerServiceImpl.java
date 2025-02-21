package Service.custom.impl;

import Dto.Customer;
import Repository.DaoFactory;
import Repository.custom.CustomerDao;
import Service.custom.CustomService;
import Utill.DaoType;
import entity.CustomerEntity;
import org.modelmapper.ModelMapper;

import java.util.List;

public class CustomerServiceImpl implements CustomService {

    CustomerDao customerDao = DaoFactory.getInstance().getDaoType(DaoType.CUSTOMER);

    @Override
    public boolean addCustomer(Customer customer) {

        System.out.println("Service "+ customer);


        // Replace this part using model mapper
//        CustomerEntity customerEntity = new CustomerEntity();
//
//        customerEntity.setId(customer.getId());
//        customerEntity.setName(customer.getName());
//        customerEntity.setAddress(customer.getAddress());
//        customerEntity.setSalary(customer.getSalary());


        CustomerEntity mapedCustomer = new ModelMapper().map(customer,CustomerEntity.class);

        customerDao.save(mapedCustomer);

        return false;
    }

    @Override
    public boolean updateCustomer(String id, Customer customer) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public Customer searchCustomer(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }
}
