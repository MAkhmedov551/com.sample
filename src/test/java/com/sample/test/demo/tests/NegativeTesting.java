package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NegativeTesting extends TestBase {

    // "Pizza 1". Get selected and not selected options and print them in the console
    @Test
    public void test_1() {
        Select select = new Select(driver.findElement(By.id("pizza1Pizza")));
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {
            if(eachOption.isSelected()){
                System.out.println("Selected: " + eachOption.getText());
            }else {
                System.out.println("Is not Selected: " + eachOption.getText());
            }
        }
    }
    //Verify default option is "Choose Pizza"
    @Test
    public void test_2(){
        Select select = new Select(driver.findElement(By.id("pizza1Pizza")));
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {
            if(eachOption.isSelected()) {
                System.out.println("Selected: " + eachOption.getText());
                break;
            }
            Assert.assertTrue(eachOption.isSelected(),"Verification "+eachOption.getText()+" is failed");
        }
    }
    // Verify is not selected options as isSelected
    //Ex.: For negative testing
    @Test
    public void test_3(){

        Select select = new Select(driver.findElement(By.id("pizza1Pizza")));
        List<WebElement> allOptions = select.getOptions();
        for(WebElement eachOption:allOptions){
            if(eachOption.getText().equals("Choose Pizza")){
                continue;
            }
            System.out.println("Is not Selected: "+eachOption.getText());
            Assert.assertFalse(eachOption.isSelected(),"Verification is failed");
        }

    }

}
