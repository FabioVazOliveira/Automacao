package automacao;

import org.junit.Test;

import elementos.Elementos;
import metodos.MetodoPage;

public class FormularioTeste {

	MetodoPage page = new MetodoPage();
	Elementos elemento = new Elementos();
	
	@Test
	public void test() {
		page.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		page.clicar(elemento.make);
		page.clicar(elemento.audi);
		page.clicar(elemento.model);
		page.clicar(elemento.scooter);
		page.escrever(elemento.cylinderCapacity,"1.0");
		page.escrever(elemento.enginePerformance,"1000");
		page.escrever(elemento.dateOfManufacture, "07/18/2022");
		page.clicar(elemento.numberOfseats);
		page.clicar(elemento.one);
		page.clicar(elemento.righthanddriveyes);
		page.clicar(elemento.numberOfseats);
		page.clicar(elemento.two);
		page.clicar(elemento.fuel);
		page.clicar(elemento.petrol);
		page.escrever(elemento.payload,"500");
		page.escrever(elemento.totalweight, "5000");
		page.escrever(elemento.listprice, "100000");
		page.escrever(elemento.licensePlatenumber, "1");
		page.escrever(elemento.annualMileage, "10000");
		page.clicar(elemento.nextenterinsurantdata);
		
		
		page.fecharNavegador();
	}
      
}
