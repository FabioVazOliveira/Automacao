package elementos;

import org.openqa.selenium.By;

public class Elementos {
	public By make = By.id("make");
	public By audi = By.xpath("//*[@id=\"make\"]/option[2]");
	public By model = By.id("model");
	public By scooter = By.xpath("//*[@id=\"model\"]/option[2]");
	public By cylinderCapacity = By.id("cylindercapacity");
	public By enginePerformance = By.id("engineperformance");
	public By dateOfManufacture = By.id("dateofmanufacture");
	public By numberOfseats = By.id("numberofseats");
	public By one = By.xpath("//*[@id=\"numberofseats\"]/option[2]");
	public By righthanddriveyes = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");
	public By numberOfSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	public By two = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[2]");
	public By fuel = By.id("fuel");
	public By petrol = By.xpath("//*[@id=\"fuel\"]/option[2]");
	public By payload = By.id("payload");
	public By totalweight = By.id("totalweight");
	public By listprice = By.id("listprice");
	public By licensePlatenumber = By.id("licenseplatenumber");
	public By annualMileage = By.id("annualmileage");
	public By nextenterinsurantdata = By.id("nextenterinsurantdata");
	public By firstname = By.id("firstname");
	public By lastname = By.id("lastname");
	public By birthdate = By.id("birthdate");
	public By male = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	public By streetaddress = By.id("streetaddress");
	public By country = By.id("country");
	public By zipcode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	public By website = By.id("website");
	public By nextenterproductdata = By.id("nextenterproductdata");
	public By startdate = By.id("startdate");
	public By insurancesum = By.id("insurancesum");
	public By meritrating = By.id("meritrating");
	public By damageinsurance = By.id("damageinsurance");
	public By optionalproducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	public By courtesycar = By.id("courtesycar");
	public By nextselectpriceoption = By.id("nextselectpriceoption");
}
