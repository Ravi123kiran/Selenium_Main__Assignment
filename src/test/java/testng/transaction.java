package testng;

        import org.openqa.selenium.By;
        import java.io.IOException;
public class transaction extends methods{
    public void transaction() throws InterruptedException, IOException {
        Thread.sleep(2000);
        methods.d.findElement(By.xpath("//*[@ng-click='transactions()']")).click();
        Thread.sleep(2000);
        screenshots sc =new screenshots();
        sc.takescreenshot("Transactions");
    }
}
