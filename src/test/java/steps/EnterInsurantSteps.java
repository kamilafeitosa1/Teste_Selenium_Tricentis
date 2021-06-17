package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import objects.DriverObject;

public class EnterInsurantSteps {

	WebDriver driver = new DriverObject().setup();

	@Dado("que estou na aba do site")
	public void que_estou_na_aba_do_site() {
		driver.get("\"http://sampleapp.tricentis.com/101/app.php\"");
	}

	@Quando("que escrevo um nome")
	public void que_escrevo_um_nome() {
		driver.findElement(By.id("firstname")).sendKeys("Kamila");
	}

	@Quando("que escrevo um sobrenome")
	public void que_escrevo_um_sobrenome() {
		driver.findElement(By.id("lastname")).sendKeys("Feitosa");
	}

	@Quando("coloco uma data de nascimento")
	public void coloco_uma_data_de_nascimento() {
		driver.findElement(By.id("birthdate")).sendKeys("04/02/1995");
	}

	@Quando("seleciono um gênero")
	public void seleciono_um_gênero() {
		driver.findElement(By.id("genderfemale")).click();
	}

	@Quando("escrevo um endereço")
	public void escrevo_um_endereço() {
		driver.findElement(By.id("streetaddress")).sendKeys("Avenida Brasil");
	}

	@Quando("escrevo um país")
	public void escrevo_um_país() {
		driver.findElement(By.id("country")).sendKeys("Andorra");
	}

	@Quando("escrevo meu cep")
	public void escrevo_meu_cep() {
		driver.findElement(By.id("zipcode")).sendKeys("50000-100");
	}

	@Quando("escrevo uma cidade")
	public void escrevo_uma_cidade() {
		driver.findElement(By.id("city")).sendKeys("Manaus");
	}

	@Quando("seleciono uma ocupação")
	public void seleciono_uma_ocupação() {
		driver.findElement(By.id("occupation")).sendKeys("Employee");
	}

	@Quando("seleciono um hobbie")
	public void seleciono_um_hobbie() {
		driver.findElement(By.id("other")).click();
	}

	@Quando("escrevo  um website proprio")
	public void escrevo_um_website_proprio() {
		driver.findElement(By.id("website")).sendKeys("kamila.feitosa.com");
	}

	@Quando("anexo uma foto")
	public void anexo_uma_foto() {
		driver.findElement(By.id("open")).click();
	}

	@Então("clico no next para aba enter product data")
	public void clico_no_next_para_aba_enter_product_data() {
		driver.findElement(By.id("nextenterproductdata")).click();
		
		 String resultadoEsperado = "Enter Product Data| Tricentis";
	     Assert.assertEquals(resultadoEsperado,driver.getTitle());
	}
}
