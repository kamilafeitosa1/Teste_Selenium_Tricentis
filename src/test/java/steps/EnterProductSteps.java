package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import objects.DriverObject;

public class EnterProductSteps {

	WebDriver driver = new DriverObject().setup();

	@Quando("coloco uma data")
	public void coloco_uma_data() {
		driver.findElement(By.id("startdate")).sendKeys("09/09/2021");
	}

	@Quando("seleciono uma soma do seguro")
	public void seleciono_uma_soma_do_seguro() {
		driver.findElement(By.id("insuranancesum")).sendKeys("3000000");
	}

	@Quando("seleciono uma classificação de mérito")
	public void seleciono_uma_classificação_de_mérito() {
		driver.findElement(By.id("meritrating")).sendKeys("Bonus 1");
	}

	@Quando("seleciono um seguro de dados")
	public void seleciono_um_seguro_de_dados() {
		driver.findElement(By.id("demageinsurance")).sendKeys("No Coverage");
	}

	@Quando("seleciono um produto opcional")
	public void seleciono_um_produto_opcional() {
		driver.findElement(By.id("EuroProtection")).click();
	}

	@Quando("seleciono um carro de cortesia")
	public void seleciono_um_carro_de_cortesia() {
		driver.findElement(By.id("courtesycar")).sendKeys("No");
	}

	@Então("clico no next para aba select price option")
	public void clico_no_next_para_aba_select_price_option() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

}
