package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import metodos.MetodoPage;

public class FormularioStep {
	MetodoPage page = new MetodoPage();
	Elementos elemento = new Elementos();

	@Given("que esteja no site")
	public void que_esteja_no_site() throws IOException {
		page.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		page.print("home");
	}

	@Given("preencho enter vehicle data")
	public void preencho_enter_vehicle_data() throws IOException {
		page.validarTitle("Enter Vehicle Data");
		page.print("Vehicle");
		page.clicar(elemento.make);
		page.clicar(elemento.audi);
		page.clicar(elemento.model);
		page.clicar(elemento.scooter);
		page.escrever(elemento.cylinderCapacity, "1.0");
		page.escrever(elemento.enginePerformance, "1000");
		page.escrever(elemento.dateOfManufacture, "07/18/2022");
		page.clicar(elemento.numberOfseats);
		page.clicar(elemento.one);
		page.clicar(elemento.righthanddriveyes);
		page.clicar(elemento.numberOfseats);
		page.clicar(elemento.two);
		page.clicar(elemento.fuel);
		page.clicar(elemento.petrol);
		page.escrever(elemento.payload, "500");
		page.escrever(elemento.totalweight, "5000");
		page.escrever(elemento.listprice, "100000");
		page.escrever(elemento.licensePlatenumber, "1");
		page.escrever(elemento.annualMileage, "10000");
		page.clicar(elemento.nextenterinsurantdata);
		
	}

	@Given("preencho enter insurant data")
	public void preencho_enter_insurant_data() throws IOException {
		page.validarTitle("Enter Insurant Data");
		page.print("insurant");
		page.escrever(elemento.firstname,"fabio");
		page.escrever(elemento.lastname, "Oliveira");
		page.escrever(elemento.birthdate, "09/19/2002");
		page.clicar(elemento.male);
		page.escrever(elemento.streetaddress, "da ilha");
		page.escrever(elemento.country, "brazil");
		page.escrever(elemento.zipcode, "123456");
		page.escrever(elemento.city, "campogrande");
		page.escrever(elemento.occupation,"employee");
		page.clicar(elemento.hobbies);
		page.escrever(elemento.website, "www.com.br");
		page.clicar(elemento.nextenterproductdata);
	}

	@Given("preencho enter product data")
	public void preencho_enter_product_data() {
		page.validarTitle("Enter Product Data");
		page.escrever(elemento.startdate, "11/30/2022");
		page.escrever(elemento.insurancesum, "3.000.000.00");
		page.escrever(elemento.meritrating, "superbonus");
		page.escrever(elemento.damageinsurance, "fullcoverage");
		page.clicar(elemento.optionalproducts);
		page.escrever(elemento.courtesycar, "yes");
		page.clicar(elemento.nextselectpriceoption);
	}

	@Given("select price option")
	public void select_price_option() throws InterruptedException {
		page.validarTitle("Select Price Option");
		page.clicar(elemento.selectsilver);
		Thread.sleep(2000);
		page.clicar(elemento.nextsendquote);
	}
	@When("send quote")
	public void send_Quote() throws InterruptedException {
		page.validarTitle("Send Quote");
		//Thread.sleep(2000);
		page.escrever(elemento.email, "fabiovazz21@hotmail.com");
		page.escrever(elemento.phone, "67991707637");
		page.escrever(elemento.username, "fabiovaz");
		page.escrever(elemento.password, "Programacao1");
		page.escrever(elemento.confirmPassword, "Programacao1");
		page.escrever(elemento.Comments, "brasil");
		page.clicar(elemento.sendemail);
	}


}
