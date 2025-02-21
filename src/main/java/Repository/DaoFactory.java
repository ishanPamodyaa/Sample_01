package Repository;

import Repository.custom.impl.CustomerDaoImpl;
import Repository.custom.impl.ItemDaoImpl;
import Repository.custom.impl.OrderDaoImpl;
import Service.SuperService;
import Service.custom.impl.CustomerServiceImpl;
import Service.custom.impl.ItemServiceImpl;
import Service.custom.impl.OrderServiceImpl;
import Utill.DaoType;
import Utill.ServiceType;

import static Utill.DaoType.*;

public class DaoFactory {

    private static DaoFactory instance;
    private  DaoFactory(){}

    public static  DaoFactory getInstance(){

        return instance==null? instance = new DaoFactory() : instance;


    }

    public <T extends SuperDao> T getDaoType(DaoType type){
        switch (type){

            case ITEM: return (T) new ItemDaoImpl();
            case ORDER: return  (T) new OrderDaoImpl();
            case CUSTOMER: return  (T) new CustomerDaoImpl();
        }
        return null;
    }

}
