package testng;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static testng.methods.d;

public class screenshots {
    void takescreenshot(String name) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) d);
        File SourceFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("C:\\Users\\ravikumaa\\Selenium_Main__Assignment\\successscreenshots\\"+name+".jpg");
        FileUtils.copyFile(SourceFile, DestFile);

    }
}