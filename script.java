# ccicecektest
package bankofworld.TI;



import com.codeborne.selenide.Condition;

import com.codeborne.selenide.Configuration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



//Threat Intel POC



    public void login() throws InterruptedException 

{



        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("pageLoadStrategy", "none");



        Configuration.timeout = 60000;

        Configuration.browser = "chrome";

        Configuration.browserSize = "1366x768";

        Configuration.startMaximized = true;

        Configuration.holdBrowserOpen = true;

        Configuration.browserCapabilities = capabilities;



        //open("https://bow.my.salesforce.com");

        //$("input#username").shouldBe(Condition.visible).sendKeys(“pocgith28@bog.gov.gh.qa88");

        //$("input#password").shouldBe(Condition.visible).sendKeys("09112022_1849”);

        open("https://cocacolaice.my.salesforce.com");

        $("input#username").shouldBe(Condition.visible).sendKeys(“peter.england@ccinext.tr.sf.pre1");

        $("input#password").shouldBe(Condition.visible).sendKeys("09112022_1855”);

        $("input#Login").shouldBe(Condition.visible).click();

        waitForSecond(10);



}
