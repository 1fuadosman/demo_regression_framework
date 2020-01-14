package com.demo.framework.steps;

import com.demo.framework.base.DriverContext;
import com.demo.framework.base.FrameworkInitialize;
import com.demo.framework.config.ConfigReader;
import com.demo.framework.config.Settings;
import com.demo.framework.utilities.ExcelUtil;
import com.demo.framework.utilities.LogUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class TestManager extends FrameworkInitialize {

    @Before
    public void initialize() throws Exception {


        //Initiliaze Config
        ConfigReader.PopulateSettings();

        //Logging
        Settings.Logs = new LogUtil();
        Settings.Logs.createLogFile();
        Settings.Logs.write("FrameWork initializer");


        //Settings.dev02DBConnectionString = DatabaseUtil.open(Settings.dev02DBUrl, Settings.dbUserName, Settings.dbPassword);
        //DatabaseUtil.executeQuery("select * from ORDER_LINE where product_order_id=25979200", Settings.dev02DBConnectionString);

        Settings.Logs.write("Test Cycle Created");
        initalizeBrowser(Settings.BrowserType);
        Settings.Logs.write("browser Initialized");
        DriverContext.browser.Maximize();



    }

    @After
    public void complete() throws Exception {
        DriverContext.browser.closeBrowser();

    }





}
