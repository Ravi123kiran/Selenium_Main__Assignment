package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;



public class Withdraw_amount extends methods{
    int amount;
    Excel_data xls1;
    public void get_amount(){
        try {
            xls1 = new Excel_data("C:\\Users\\ravikumaa\\Selenium_Main__Assignment\\Main_data.xlsx");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        amount=xls1.getData1(2,0,0);
    }


    public void Withdraw_amount() throws InterruptedException{
        methods.d.findElement(By.xpath("//*[@ng-click='withdrawl()']")).click();
        Thread.sleep(2000);
        WebElement e3 = methods.d.findElement(By.xpath("//*[@ng-model='amount']"));
        e3.sendKeys(Integer.toString(amount));
        Thread.sleep(3000);
        WebElement e2=methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
        String s1=e2.getText();
        int initialbalance;
        initialbalance=Integer.parseInt(s1);
        if(amount<=0) {
            WebDriverWait wt = new WebDriverWait(methods.d, 5);
            wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default']")));
            System.out.println("amount should be greater than 0");
        }
        else {
            int balance,finalbalance;
            WebElement e4=methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
            String s2=e4.getText();
            balance=Integer.parseInt(s2);
            methods.d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
            WebElement e5=methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"));
            String s3=e5.getText();
            finalbalance=Integer.parseInt(s3);
            if(finalbalance==(balance-amount))
            {

                System.out.println("Balance updated successfulluy");
            }

            else
            {
                System.out.println("Balance not updated successfully");
            }
            Thread.sleep(3000);
            WebElement e1=methods.d.findElement(By.xpath("//*[@ng-show='message']"));
        }
    }
}
