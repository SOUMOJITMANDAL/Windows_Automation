package org.NotePadAuto;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class NotePad {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Set the path to WinAppDriver and Notepad
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        // Create a new instance of WindowsDriver
        WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
        WebElement textArea=driver.findElement(By.name("Untitled - Notepad"));
        textArea.sendKeys("How are you?");
        Thread.sleep(5000l);
        // driver.findElement(By.className("Edit")).sendKeys("Hello, Notepad!");
        // Close Notepad
        driver.quit();
    }
}