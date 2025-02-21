package Service.custom;

import Dto.Customer;
import Service.SuperService;

import java.util.List;

public interface CustomService extends SuperService {

    boolean addCustomer(Customer customer);
    boolean updateCustomer(String id,Customer customer);

    boolean deleteCustomer(String id);

    Customer searchCustomer (String id);

    List<Customer> getAll();
}
