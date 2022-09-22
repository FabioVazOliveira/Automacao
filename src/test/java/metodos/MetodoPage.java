package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodoPage {

	WebDriver webDriver;
	
	public void abrirNavegador(String site) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get(site);
	
	}
	
	public void clicar(By elemento) {
		webDriver.findElement(elemento).click();
	}
	
	public void escrever(By elemento, String texto) {
		webDriver.findElement(elemento).sendKeys(texto);
	}
	public void fecharNavegador() {
		webDriver.close();
	}
}
