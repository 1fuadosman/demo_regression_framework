package com.demo.framework.utilities;

import com.demo.framework.config.Settings;

public class EmailGeneratorUtil {

    public static String generateEmail() {
        int randomNumber = (int)(Math.random() * 999999999);
        String randomEmail = "wowcherautomation+" + randomNumber + "@gmail.com";
        Settings.Logs.write("Email generated is: " + randomEmail);
        return randomEmail;
    }

    public static String generateMailosaurEmail() {
        String emailServer = ".l76unasg";
        String emailDomain = "@mailosaur.io";
        long i = (long) Math.floor(Math.random() * 99999999);
        return "wowcherautomation" + "+" + i + emailServer + emailDomain;
    }
}

