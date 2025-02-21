package Config;

import Repository.custom.CustomerDao;
import Repository.custom.impl.CustomerDaoImpl;
import Service.custom.CustomService;
import Service.custom.impl.CustomerServiceImpl;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

    @Override
    protected  void configure(){
        bind(CustomService.class).to(CustomerServiceImpl.class);
        bind(CustomerDao.class).to(CustomerDaoImpl.class);

    }
}
