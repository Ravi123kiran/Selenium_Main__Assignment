package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Open_account extends methods {


    public void select_customer() throws InterruptedException {
        Thread.sleep(3000);
        methods.d.findElement(By.xpath("//*[@ng-click='openAccount()']")).click();
        Thread.sleep(3000);
        Select se = new Select(d.findElement(By.xpath("//*[@id='userSelect']")));
        List<WebElement> l = se.getOptions();
        int n = l.size() - 1;
        se.selectByIndex(n);
        Thread.sleep(3000);

    }

    public void select_currency() throws InterruptedException {
        WebElement e2 = methods.d.findElement(By.xpath("//*[@id='currency']"));
        Select select = new Select(e2);
        select.selectByIndex(3);
        Thread.sleep(3000);
        WebElement e3 = methods.d.findElement(By.xpath("//*[@type='submit']"));
        e3.click();
        Thread.sleep(3000);
    }

    public void alert() throws InterruptedException {
        d.switchTo().alert().accept();
        Thread.sleep(3000);


    }
}
