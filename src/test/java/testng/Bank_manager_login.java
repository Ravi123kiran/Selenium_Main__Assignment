package testng;
import org.openqa.selenium.By;

public class Bank_manager_login extends methods {

    public void click_Bank_manager_login() throws InterruptedException {
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@ng-click='manager()']")).click();
    }

    public void click_Add_customer() throws InterruptedException {
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@ng-class='btnClass1']")).click();
    }
}
