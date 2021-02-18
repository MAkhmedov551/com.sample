package com.sample.test.demo.tests;


import com.sample.test.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Happy_Path extends TestBase {
    @Test
    public void test2() {

        //1.Print all selected values of "Pizza 1", and verify isSelected.
        // Example for happy path.

        Select select = new Select(driver.findElement(By.id("pizza1Pizza")));
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {
            eachOption.click();
            System.out.println("Selected: " + eachOption.getText());
            Assert.assertTrue(eachOption.isSelected(), "The option " + eachOption.getText() + " is not selected");

        }
    }
    @Test
    public void test_3(){
        //  1.Print all selected values of "Toppings 1", and verify isSelected.
        //  Example for happy path.
        Select select = new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']")));
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {
            eachOption.click();
            System.out.println("Selected: " + eachOption.getText());
            Assert.assertTrue(eachOption.isSelected(), "The option " + eachOption.getText() + " is not selected");

        }
    }

}
