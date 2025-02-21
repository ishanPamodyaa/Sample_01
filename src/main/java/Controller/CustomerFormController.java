package Controller;

import Dto.Customer;
import Service.ServiceFactory;
import Service.custom.CustomService;
import Utill.ServiceType;
import jakarta.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CustomerFormController {

    @FXML
    private TableColumn<?, ?> ColAddress;

    @FXML
    private Button btnAddCustomer;

    @FXML
    private Button btnDeleteCustomer1;

    @FXML
    private Button btnReload;

    @FXML
    private Button btnSearchCustomer;

    @FXML
    private Button btnUpdateCustomer;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableView<?> tblCustDetail;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

//    CustomService customService = ServiceFactory.getInstance().getServiceType(ServiceType.CUSTOMER);


    @Inject
    CustomService customService;

    @FXML
    void btnOnActionAddCustomer(ActionEvent event) {

        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        Double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id,name,address,salary);

        customService.addCustomer(customer);
    }

    @FXML
    void btnOnActionDeleteCustomer(ActionEvent event) {

    }

    @FXML
    void btnOnActionReload(ActionEvent event) {

    }

    @FXML
    void btnOnActionSearchCustomer(ActionEvent event) {

    }

    @FXML
    void btnOnActionUpaterCustomer(ActionEvent event) {

    }

}
