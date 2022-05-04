package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    @Test
    public void verifyPageNavigation(){
        String expactedText="Electronics";
        String actualText=topMenuPage.gettingTextFromElectronicField();
        Assert.assertEquals(actualText,expactedText,"verify Text");
    }
}
