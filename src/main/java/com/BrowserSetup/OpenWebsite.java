package com.BrowserSetup;

import com.Base.TestBase;

public class OpenWebsite extends TestBase
{
    public static void main(String[] args) {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        chrome_close();
        firefox_launch();
        openUrl("https://demo.opencart.com/");
        firefox_close();
        //edge_launch();
    }

//    public static void openUrl()
//    {
//        driver.get("https://google.com");
//    }


}
