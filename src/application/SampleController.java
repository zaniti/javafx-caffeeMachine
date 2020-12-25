package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


import java.util.ArrayList;

import com.coffeemachine.controllers.ClientController;
import com.coffeemachine.controllers.MachineController;
import com.coffeemachine.controllers.ProductController;
import com.coffeemachine.controllers.TechnicianController;

import com.coffeemachine.models.Client;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

public class SampleController {
	
	ArrayList<Technician> technicians = new ArrayList<Technician>();
	ArrayList<Client> clients = new ArrayList<Client>();
	ArrayList<Machine> machines = new ArrayList<Machine>();
	ArrayList<Product> products = new ArrayList<Product>();
	
	TechnicianController technicianController = new TechnicianController();
	ClientController clientController = new ClientController();
	MachineController machineController = new MachineController();
	ProductController productController = new ProductController();
		
		
	    @FXML
	    private TextField idT;

	    @FXML
	    private TextField nameT;

	    @FXML
	    private TextField phoneT;

	    @FXML
	    private TextField idRefT;

	    @FXML
	    private TextField accessCodeT;

	    @FXML
	    private Button addT;
	    
	    
	    @FXML
	    private TextField idC;

	    @FXML
	    private TextField nameC;

	    @FXML
	    private TextField phoneC;

	    @FXML
	    private TextField creditC;

	    @FXML
	    private TextField orderC;

	    @FXML
	    private Button addC;
	    
	    @FXML
	    private TextField idM;

	    @FXML
	    private Button addM;
	    
	    @FXML
	    private TextField idP;

	    @FXML
	    private TextField nameP;

	    @FXML
	    private TextField priceP;

	    @FXML
	    private Button addP;
	    
	    ObservableList<Technician> TechList = FXCollections.observableArrayList();

	    
	    public void addTech() throws Exception {
	    	Technician newTechnician = new Technician(Long.parseLong(String.valueOf(idT.getText())), nameT.getText(), phoneT.getText(), idRefT.getText(), accessCodeT.getText());
	    	technicianController.AddTechnician(technicians, newTechnician);
	    	TechList.setItems(technicians);
	    	System.out.println(technicians);
	    }
	    
	    public void addClient() throws Exception {
	    	Client newClient = new Client(Long.parseLong(String.valueOf(idC.getText())), nameC.getText(), phoneC.getText(), orderC.getText(), Double.parseDouble(String.valueOf(creditC.getText())));
	    	clientController.AddClient(clients, newClient);
	    	System.out.println(clients);
	    }
	    
	    public void addMachine() throws Exception {
	    	Machine newMachine = new Machine(Long.parseLong(String.valueOf(idM.getText())));
	    	machineController.AddMachine(machines, newMachine);
	    	System.out.println(machines);
	    }
	    
	    public void addProduct() throws Exception {
	    	Product newProduct = new Product(Long.parseLong(String.valueOf(idP.getText())), nameP.getText(), Double.parseDouble(String.valueOf(priceP.getText())));
	    	productController.AddProduct(products, newProduct);
	    	System.out.println(products);
	    }
	    
	    
}
