package Repository.custom;

import Dto.Customer;
import Repository.CrudRepository;
import entity.CustomerEntity;

public interface CustomerDao extends CrudRepository <CustomerEntity, String> {

}
