package Service;

import Service.custom.impl.CustomerServiceImpl;
import Service.custom.impl.ItemServiceImpl;
import Service.custom.impl.OrderServiceImpl;
import Utill.ServiceType;

public class ServiceFactory {

    private static ServiceFactory instance;
    private  ServiceFactory(){

    }

    public static ServiceFactory getInstance(){
      return  instance==null ? instance = new ServiceFactory() : instance;
    }

    public <T extends SuperService> T getServiceType(ServiceType type){
        switch (type){

            case ITEM: return (T) new ItemServiceImpl();
            case ORDER: return  (T) new OrderServiceImpl();
            case CUSTOMER: return  (T) new CustomerServiceImpl();
        }
        return null;
    }


}
