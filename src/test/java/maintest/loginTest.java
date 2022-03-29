package maintest;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import testng.Bank_manager_login;
import testng.Open_account;
import testng.methods;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import testng.*;
@Listeners(TestNGListener.class)

public class loginTest extends methods {
    private static Logger log = Logger.getLogger("loginTest");
    private static methods setup;

    @Test(priority = 1)
    private static void Bank_manager_login() throws InterruptedException {
      /*  Thread.sleep(3000);
        methods setup;
        WebElement e1 = methods.d.findElement(By.xpath("//*[@ng-click='manager()']"));
        e1.click();
        log.error("Bank manager Login Success");
        log.info("Bank Manager Login");
        System.out.println("BML LOGIN");
        Thread.sleep(3000);
        WebElement e2 = methods.d.findElement(By.xpath("//*[@ng-class='btnClass1']"));
        e2.click();
        log.info("Add customer method");
        Thread.sleep(3000);*/

        //Bank manager login
        Bank_manager_login lg = new Bank_manager_login();
        lg.click_Bank_manager_login();
        lg.click_Add_customer();

    }

    @Test(priority = 2)
    private static void Add_customer() throws InterruptedException, IOException {
     /*   String excelPath = "Data.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row = null;
        XSSFCell cell = null;
        String firstname = null;
        String lastname = null;
        int zip = 0;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    firstname = cell.getStringCellValue();
                }
                if (j == 1) {
                    lastname = cell.getStringCellValue();
                }
                if (j == 2) {
                    zip = (int) cell.getNumericCellValue();
                }
            }
        }
        methods.d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(firstname);
        methods.d.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(lastname);
        methods.d.findElement(By.xpath("//*[@placeholder='Post Code']")).sendKeys(Integer.toString(zip));
        Thread.sleep(4000);
        methods.d.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(4000);*/

        //Adding customer
        Add_customer ad = new Add_customer();
        ad.get_details();
        ad.add_details();


    }

    @Test(priority = 3)
    private static void Open_account() throws InterruptedException {
       /* d.switchTo().alert().accept();
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
        Thread.sleep(2000);
        Select se = new Select(d.findElement(By.xpath("//*[@id=\"userSelect\"]")));
        List<WebElement> l = se.getOptions();
        se.selectByIndex(l.size() - 1);
        Thread.sleep(2000);
        Select sel = new Select(d.findElement(By.xpath("//*[@id=\"currency\"]")));
        List<WebElement> l1 = sel.getOptions();
        sel.selectByIndex(3);
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
        Thread.sleep(4000);
        d.switchTo().alert().accept();
        Thread.sleep(2000);*/

        //Account opening
        Open_account oa = new Open_account();
        oa.select_customer();
        oa.select_currency();
        oa.alert();


    }


    @Test(priority = 4)
    private static void Customer_login() throws InterruptedException, IOException {
      /*  Thread.sleep(2000);
        WebElement e1 = methods.d.findElement(By.xpath("//*[@ng-click='home()']"));
        e1.click();
        Thread.sleep(3000);
        WebElement e2 = methods.d.findElement(By.xpath("//*[@ng-click='customer()']"));
        e2.click();
        Thread.sleep(3000);
        Select se = new Select(d.findElement(By.xpath("//*[@id='userSelect']")));
        List<WebElement> l = se.getOptions();
        int n = l.size() - 1;
        se.selectByIndex(n);
        Thread.sleep(3000);
        methods.d.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        Thread.sleep(3000);
        methods.d.findElement(By.xpath("//*[@ng-click='deposit()']")).click();
        Thread.sleep(2000);
        WebElement e3 = d.findElement(By.xpath("//*[@ng-model='amount']"));
        String excelPath = "Data.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(1);
        XSSFRow row = null;
        XSSFCell cell = null;
        int amount = 0;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    amount = (int) cell.getNumericCellValue();
                }
            }
        }
        e3.sendKeys(Integer.toString(amount));
        Thread.sleep(3000);
        d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(3000);*/

        //Customer login
        Customer_login cl = new Customer_login();
        cl.click_Customer_login();
        cl.select_Customer();
        cl.get_amount();
        cl.depoist();

    }

    @Test(priority = 5)
    private static void Withdraw_account() throws InterruptedException, IOException {
       /*d.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
        Thread.sleep(2000);
        WebElement e3 = d.findElement(By.xpath("//*[@ng-model='amount']"));
        String excelPath = "Data.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(2);
        XSSFRow row = null;
        XSSFCell cell = null;
        int amount = 0;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    amount = (int) cell.getNumericCellValue();
                }
            }
        }
        e3.sendKeys(Integer.toString(amount));
        Thread.sleep(3000);
        d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(3000);*/

        //Withdraw amount
        Withdraw_amount wa = new Withdraw_amount();
        wa.get_amount();
        wa.Withdraw_amount();

    }

       //trancations
    @Test(priority = 6)
    private static void transaction()throws InterruptedException, IOException {
        transaction tr = new transaction();
        tr.transaction();
    }
}

