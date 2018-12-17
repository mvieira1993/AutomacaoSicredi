import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

class TestCasesJ extends Controller {
w
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        driver.quit();

    }

    @Test // @Cenário1
    void PerfilParavoce() {

        String vAplicar = "50000";
        String vInvestir = "2000";
        String tPoupar = "12";
        String vResultado = "768";
        login();

        WebElement elementoSimulador;

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        WebElement simular = driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button"));
        simular.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
    }

        WebElement resultadoPoupado = driver.findElement(By.className("valor"));
        String rPoupado = resultadoPoupado.getText();
        assertEquals(rPoupado.replace("R$ ", ""), vResultado);

        System.out.println("Dados validados com sucesso");

        }

    @Test //@Cenário2
    void PerfilempresaAgronegocio() {

        String vAplicar = "150000";
        String vInvestir = "12000";
        String tPoupar = "1";
        String vResultado = "1.626";
        login();

        WebElement elementoSimulador;
        elementoSimulador = driver.findElement(By.cssSelector("#formInvestimento > div:nth-child(1) > input[type=\"radio\"]:nth-child(4)"));
        elementoSimulador.click();

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        elementoSimulador = driver.findElement(By.cssSelector("#formInvestimento > div:nth-child(4) > div.blocoInputs.clearfix > div.blocoFormulario.blocoMeses.blocoSelect > a"));
        elementoSimulador.click();

        WebElement simular = driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button"));
        simular.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement resultadoPoupado = driver.findElement(By.className("valor"));
        String rPoupado = resultadoPoupado.getText();
        assertEquals(rPoupado.replace("R$ ", ""), vResultado);

        System.out.println("Dados validados com sucesso");

    }

    @Test // @Cenário4
    void RedirecionamentoUrl() {

        String vAplicar = "400000";
        String vInvestir = "6122";
        String tPoupar = "48";
        String vResultado = "7.990";
        login();

        WebElement elementoSimulador;

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        WebElement simular = driver.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button"));
        simular.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement resultadoPoupado = driver.findElement(By.className("valor"));
        String rPoupado = resultadoPoupado.getText();
        assertEquals(rPoupado.replace("R$ ", ""), vResultado);

        elementoSimulador = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/a"));
        elementoSimulador.click();

        elementoSimulador = driver.findElement(By.id("localAgtitulo"));
        assertEquals(elementoSimulador.getText(), "Localizar agência");

        elementoSimulador = driver.findElement(By.xpath("//*[@id=\'menu-scroll\']"));
        elementoSimulador.click();

        System.out.println("Redirecionamento da URL validada com sucesso");

    }

    @Test //@Cenário5
    void LimparFormulario() {

        String vAplicar = "81112222";
        String vInvestir = "7823333";
        String tPoupar = "32";

        login();

        WebElement elementoSimulador;

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        elementoSimulador = driver.findElement(By.xpath("//*[@id=\'formInvestimento\']/div[5]/ul/li[1]/a"));
        elementoSimulador.click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        assertEquals(elementoSimulador.getText(), "");

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        assertEquals(elementoSimulador.getText(), "");

        elementoSimulador = driver.findElement(By.id("tempo"));
        assertEquals(elementoSimulador.getText(), "");

        System.out.println("Dados do formulário limpos com sucesso");

    }

    @Test //@Cenário7
    void ValorMinimo() {

        String vAplicar = "19.99";
        String vInvestir = "19.99";
        String tPoupar = "12";

        login();

        WebElement elementoSimulador;

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        elementoSimulador = driver.findElement(By.xpath("//*[@id=\'formInvestimento\']/div[5]/ul/li[1]/a"));
        elementoSimulador.click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        WebElement erroA = driver.findElement(By.id("valorAplicar-error"));
        assertEquals(erroA.getText(), "Valor mínimo de 20.00");

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        WebElement erroI = driver.findElement(By.id("valorInvestir-error"));
        assertEquals(erroI.getText(), "Valor mínimo de 20.00");

        System.out.println("Mensagens de erro validados com sucesso");

    }

    @Test // @Cenário8
    void LimiteCaracter() {

        String vAplicar = "11111111111111111111";
        String vInvestir = "22222222222222222222";
        String tPoupar = "0.";

        login();

        WebElement elementoSimulador;

        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        elementoSimulador.sendKeys(vAplicar);

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        elementoSimulador.sendKeys(vInvestir);

        elementoSimulador = driver.findElement(By.id("tempo"));
        elementoSimulador.sendKeys(tPoupar);

        elementoSimulador = driver.findElement(By.xpath("//*[@id=\'formInvestimento\']/div[5]/ul/li[1]/a"));
        elementoSimulador.click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        elementoSimulador = driver.findElement(By.id("valorAplicar"));
        WebElement erroA = driver.findElement(By.id("valorAplicar-error"));
        assertEquals(erroA.getText(), "Máximo de 9999999.00");

        elementoSimulador = driver.findElement(By.id("valorInvestir"));
        WebElement erroI = driver.findElement(By.id("valorInvestir-error"));
        assertEquals(erroI.getText(), "Máximo de 9999999.00");

        elementoSimulador = driver.findElement(By.id("tempo"));
        WebElement erroT = driver.findElement(By.xpath("//*[@id=\"tempo-error\"]"));
        assertEquals(erroT.getText(), "Valor esperado não confere");

        System.out.println("Mensagens de erro validados com sucesso");


    }

}
