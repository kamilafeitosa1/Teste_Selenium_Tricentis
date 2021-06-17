package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import objects.DriverObject;

public class EnterVehicleSteps {

	WebDriver driver = new DriverObject().setup();

	@Dado("que estou no site")
	public void que_estou_no_site() {
		driver.get("https://www.sampleapp.tricentis.com/101/app.php");
	}

	@Quando("seleciono uma marca")
	public void seleciono_uma_marca() {
		driver.findElement(By.id("make")).click();
	}

	@Quando("escrevo o desempenho do motor")
	public void escrevo_o_desempenho_do_motor() {
		driver.findElement(By.id("engineperformance")).sendKeys("alto");
		;
	}

	@Quando("coloco a data da fabricação")
	public void coloco_a_data_da_fabricação() {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("03/03/2019");
	}

	@Quando("seleciono número de assentos")
	public void seleciono_número_de_assentos() {
		driver.findElement(By.id("numberofseats")).click();
	}

	@Quando("seleciono tipo de combustível")
	public void seleciono_tipo_de_combustível() {
		driver.findElement(By.id("fuel")).click();
	}

	@Quando("escrevo no preço de tabela")
	public void escrevo_no_preço_de_tabela() {
		driver.findElement(By.id("listprice")).sendKeys("150,00");
		;
	}

	@Quando("escrevo número da matrícula")
	public void escrevo_número_da_matrícula() {
		driver.findElement(By.id("licenseplatenumber")).sendKeys("23465789");
		;
	}

	@Quando("escrevo milhagem anual")
	public void escrevo_milhagem_anual() {
		driver.findElement(By.id("annualmileage")).sendKeys("2000");
	}

	@Então("clico no next para aba enter insurant data")
	public void clico_no_next_para_aba_enter_insurant_data() {
		driver.findElement(By.id("nexttenterinsurantdata")).click();
		
		 String resultadoEsperado = "Enter Insurant Data| Tricentis";
	     Assert.assertEquals(resultadoEsperado,driver.getTitle());
	}

}
