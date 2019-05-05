package com.demo.framework.utilities;

import com.demo.framework.config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    //File format for the log name
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH:mm:ss");
    String fileNameFormat = date.format(formatter);

    private BufferedWriter bufferedWriter = null;

    //Create log file
    public void createLogFile() throws IOException {
        try {
            File dir = new File(Settings.logPath);
            if (!dir.exists())
                dir.mkdir();
            //Create file
            File logFile = new File(dir + "/" + fileNameFormat + ".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch (Exception e)
        {

        }
    }
    //write message within the log
    public void write(String message)
    {
        try
        {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH:mm:ss");
            String dateFormat = date.format(formatter);
            bufferedWriter.write("["+dateFormat + "]"+ message);
            bufferedWriter.newLine();
            bufferedWriter.flush(); //handles multiple log messages
        } catch(Exception e)
        {

        }
    }

}
