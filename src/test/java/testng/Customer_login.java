package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class Customer_login {
    int amount;
    Excel_data xls1;

    public void click_Customer_login() throws InterruptedException {
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@ng-click='home()']")).click();
        Thread.sleep(3000);
        methods.d.findElement(By.xpath("//*[@ng-click='customer()']")).click();
        Thread.sleep(3000);
    }

    public void select_Customer() throws InterruptedException {
        Select se = new Select(methods.d.findElement(By.xpath("//*[@id='userSelect']")));
        List<WebElement> l = se.getOptions();
        int n = l.size() - 1;
        se.selectByIndex(n);
        Thread.sleep(3000);
        methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        Thread.sleep(3000);
    }

    public void get_amount() {
        try {
            xls1 = new Excel_data("C:\\Users\\ravikumaa\\Selenium_Main__Assignment\\Main_data.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        amount = xls1.getData1(1, 0, 0);
    }

    public void depoist() throws InterruptedException, IOException {
        methods.d.findElement(By.xpath("//*[@ng-click='deposit()']")).click();
        Thread.sleep(2000);
        WebElement e3 = methods.d.findElement(By.xpath("//*[@ng-model='amount']"));
        e3.sendKeys(Integer.toString(amount));
        Thread.sleep(3000);
        if (amount <= 0) {
            WebDriverWait wt = new WebDriverWait(methods.d, 5);
            wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default']")));
            System.out.println("amount should be greater than 0");
        } else {
            int initialbalance, finalbalance;
            WebElement e2 = methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
            String s1 = e2.getText();
            initialbalance = Integer.parseInt(s1);
            // System.out.println(s1);
            methods.d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
            WebElement e4 = methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
            String s2 = e4.getText();
            finalbalance = Integer.parseInt(s2);
            if (finalbalance == amount) {
                System.out.println("Balance updated successfulluy");
            } else {
                System.out.println("Balance not updated successfully");
            }
            Thread.sleep(3000);
            WebElement e1 = methods.d.findElement(By.xpath("//*[@ng-show='message']"));
            screenshots sc =new screenshots();
            sc.takescreenshot("deposit");
        }
    }
}

