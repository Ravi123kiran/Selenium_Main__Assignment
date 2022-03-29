package testng;
import org.openqa.selenium.By;
import java.io.IOException;
public class Add_customer {

    String firstname = "";
    String lastname = "";
    int zip = 0;
    Excel_data xls1;

    public void get_details() throws InterruptedException {
        try {
            xls1 = new Excel_data("C:\\Users\\ravikumaa\\Selenium_Main__Assignment\\Main_data.xlsx");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        firstname = xls1.getData(0, 0, 0);
        lastname = xls1.getData(0, 0, 1);
        zip = xls1.getData1(0, 0, 2);

    }


    public void add_details() throws InterruptedException {
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(firstname);
        methods.d.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(lastname);
        methods.d.findElement(By.xpath("//*[@placeholder='Post Code']")).sendKeys(Integer.toString(zip));
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(2000);
        methods.d.switchTo().alert().accept();
    }


}