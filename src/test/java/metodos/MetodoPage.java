package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public  void validarTitle(String titleEsperado) {
		String textTitle = webDriver.getTitle();
		assertEquals(textTitle, titleEsperado);
	}
	
	public void  print(String  nome) throws IOException {
		TakesScreenshot sch = ((TakesScreenshot)webDriver);
		File srcFile = sch.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/"+nome+"./png");
		FileUtils.copyFile(srcFile, destFile);
	}
    public void  validarMensagem(By elemento, String msgEsperado) {
    	String msg = webDriver.findElement(elemento).getText();
    	assertEquals(msg, msgEsperado);
    }
}
