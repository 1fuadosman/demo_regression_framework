package com.demo.framework.config;

import com.demo.framework.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {



    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }


    private void ReadProperty() throws IOException {

        Properties property = new Properties();
        InputStream inputStream = new FileInputStream("src/test/resources/GlobalConfig.properties");
        property.load(inputStream);

        Settings.dev02DBUrl = overridePropertyIfExistsAsEnvParameter(property, "dev02DBUrl");
        Settings.dbUserName = overridePropertyIfExistsAsEnvParameter(property, "dbUserName");
        Settings.dbPassword = overridePropertyIfExistsAsEnvParameter(property, "dbPassword");
        Settings.logPath = overridePropertyIfExistsAsEnvParameter(property, "logPath");
        Settings.excelSheetPath = overridePropertyIfExistsAsEnvParameter(property, "excelSheetPath");
        Settings.dbDriverType = overridePropertyIfExistsAsEnvParameter(property, "dbDriverType");
        Settings.AUT = overridePropertyIfExistsAsEnvParameter(property, "AUT");
        //cast browser type to convert string parameter to BrowserType
        Settings.BrowserType = BrowserType.valueOf(overridePropertyIfExistsAsEnvParameter(property, "BrowserType"));
    }

    private String overridePropertyIfExistsAsEnvParameter(final Properties property, final String propertyKey) {

        if (System.getProperty(propertyKey) != null) {
            return System.getProperty(propertyKey);
        }
        return property.getProperty(propertyKey);
    }

}