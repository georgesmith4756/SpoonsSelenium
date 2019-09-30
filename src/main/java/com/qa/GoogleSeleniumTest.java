package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoogleSeleniumTest {

    private ChromeDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\georg\\Downloads\\seleniumtesting-master\\seleniumtesting-master\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }


    public void clickAddPubButton() throws InterruptedException {
        WebElement button = driver.findElementById("pub-add-button");
        button.click();
        Thread.sleep(2000);
    }


    public void closeAddPubModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"addPubModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }


    public void clickUpdatePubButton() throws InterruptedException {
        WebElement button = driver.findElementById("pub-update-button");
        button.click();
        Thread.sleep(2000);
    }

    public void closeUpdatePubModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"updatePubModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }

    public void clickDeletePubButton() throws InterruptedException {
        WebElement button = driver.findElementById("pub-delete-button");
        button.click();
        Thread.sleep(2000);
    }

    public void closeDeletePubModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"deletePubModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }

    public void clickAddVisitButton() throws InterruptedException {
        WebElement button = driver.findElementById("visit-add-button");
        button.click();
        Thread.sleep(2000);
    }

    public void closeAddVisitModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"addVisitModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }

    public void clickUpdateVisitButton() throws InterruptedException {
        WebElement button = driver.findElementById("visit-update-button");
        button.click();
        Thread.sleep(2000);
    }

    public void closeUpdateVisitModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"updateVisitModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }

    public void clickDeleteVisitButton() throws InterruptedException {
        WebElement button = driver.findElementById("visit-delete-button");
        button.click();
        Thread.sleep(2000);
    }

    public void closeDeleteVisitModal() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"deleteVisitModal\"]/div/div/div[3]/button[2]"));
        button.click();
        Thread.sleep(2000);
    }


    @Test
    public void buttonTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);
        WebElement addPubModal = driver.findElementById("addPubModal");
        assertFalse(addPubModal.isDisplayed());
        clickAddPubButton();
        assertTrue(addPubModal.isDisplayed());
        Thread.sleep(3000);
        closeAddPubModal();

        WebElement updatePubModal = driver.findElementById("updatePubModal");
        assertFalse(updatePubModal.isDisplayed());
        clickUpdatePubButton();
        assertTrue(updatePubModal.isDisplayed());
        Thread.sleep(3000);
        closeUpdatePubModal();

        WebElement deletePubModal = driver.findElementById("deletePubModal");
        assertFalse(deletePubModal.isDisplayed());
        clickDeletePubButton();
        assertTrue(deletePubModal.isDisplayed());
        Thread.sleep(3000);
        closeDeletePubModal();


        WebElement addVisitModal = driver.findElementById("addVisitModal");
        assertFalse(addVisitModal.isDisplayed());
        clickAddVisitButton();
        assertTrue(addVisitModal.isDisplayed());
        Thread.sleep(3000);
        closeAddVisitModal();

        WebElement updateVisitModal = driver.findElementById("updateVisitModal");
        assertFalse(updateVisitModal.isDisplayed());
        clickUpdateVisitButton();
        assertTrue(updateVisitModal.isDisplayed());
        Thread.sleep(3000);
        closeUpdateVisitModal();

        WebElement deleteVisitModal = driver.findElementById("deleteVisitModal");
        assertFalse(deleteVisitModal.isDisplayed());
        clickDeleteVisitButton();
        assertTrue(deleteVisitModal.isDisplayed());
        Thread.sleep(3000);
        closeDeleteVisitModal();


    }

    @Test
    public void addPubTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);

        clickAddPubButton();
        Thread.sleep(3000);
        WebElement addPubField = driver.findElementById("modalPubText");
        addPubField.sendKeys("SeleniumPub");
        Thread.sleep(3000);
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"addPubModal\"]/div/div/div[3]/button[1]"));
        addButton.click();
    }

    @Test
    public void updatePubTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);

        clickUpdatePubButton();
        Thread.sleep(3000);
        WebElement oldPubField = driver.findElementById("modalOldPubID");
        oldPubField.sendKeys("1020");
        Thread.sleep(3000);
        WebElement newPubField = driver.findElementById("modalNewPubName");
        newPubField.sendKeys("SelTester");

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"updatePubModal\"]/div/div/div[3]/button[1]"));
        deleteButton.click();
    }

    @Test
    public void deletePubTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);

        clickDeletePubButton();
        Thread.sleep(3000);
        WebElement deletePubField = driver.findElement(By.xpath("//*[@id=\"pubUpdateID\"]"));
        deletePubField.sendKeys("1005");

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"deletePubModal\"]/div/div/div[3]/button[1]"));
        deleteButton.click();
    }

    @Test
    public void addVisitTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);

        clickAddVisitButton();
        Thread.sleep(3000);

        WebElement PubField = driver.findElementById("modalEntryPubName");
        PubField.sendKeys("SeleniumPub");

        WebElement PostcodeField = driver.findElementById("modalEntryPostcode");
        PostcodeField.sendKeys("BR13BE");

        WebElement UsernameField = driver.findElementById("modalEntryUsername");
        UsernameField.sendKeys("testuser");

        WebElement OrderTotalField = driver.findElementById("modalEntryOrderTotal");
        OrderTotalField.sendKeys("6.89");

        WebElement DateField = driver.findElementById("modalEntryDate");
        DateField.sendKeys("5th October 2018");


        Thread.sleep(3000);
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"addVisitModal\"]/div/div/div[3]/button[1]"));
        addButton.click();
    }



    @Test
    public void deleteVisitTest() throws InterruptedException {
        driver.manage().window().maximize();//max screen
        driver.get("http://127.0.0.1:5500/");
        Thread.sleep(3000);

        clickDeleteVisitButton();
        Thread.sleep(3000);
        WebElement deleteVisitField = driver.findElementById("modalVisitID");

        deleteVisitField.sendKeys("685");

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"deleteVisitModal\"]/div/div/div[3]/button[1]"));
        deleteButton.click();
    }

}
