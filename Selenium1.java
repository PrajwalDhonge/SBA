package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.moneycontrol.com/");
       
        Actions act =new Actions(driver);
        WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Personal Finance')])[2]"));
        act.moveToElement(element).perform();
        
        driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator']")).click();
        driver.findElement(By.xpath("//input[@value='without']")).click();
        driver.findElement(By.xpath("//input[@value='with']")).click();
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("21");
        
        Select s=new Select(driver.findElement(By.xpath("//select[@class='custselect']")));
        s.selectByValue("Stay in Non Metro city");
        driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']"));
        driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("15000");
        driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("15000");
        driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
        driver.findElement(By.xpath("//input[@id='tax_saving_investment']")).sendKeys("2000");
        driver.findElement(By.xpath("(//a[@class='btn_common nextfrm calculateTax'])[1]")).click();
        
        WebElement print=driver.findElement(By.xpath("//span[@id='display_tax']"));
        String Out=print.getText();
        System.out.println(Out);
        
        Actions act2 =new Actions(driver);
        WebElement element2 = driver.findElement(By.xpath("(//a[@href='https://www.moneycontrol.com/mutualfundindia/'])[1]"));
        act.moveToElement(element2).perform();
       
        driver.findElement(By.xpath("(//a[@title='Top Ranked Funds'])[1]")).click();
        driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com/mutual-funds/nav/idfc-tax-advantage-elss-fund-direct-plan-growth/MAG741']")).click();
        
        WebElement print1=driver.findElement(By.xpath("//span[contains(text(),'₹ 3569.52 Cr')]"));
        String Fund= print1.getText();
        System.out.println(Fund);
        
        
	}

}
