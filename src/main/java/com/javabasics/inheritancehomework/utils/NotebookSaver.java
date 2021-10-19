package com.javabasics.inheritancehomework.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class NotebookSaver {
    private final static String OUTPUT_FILE_NAME = "notebook.xml";

    public static void saveNotebookToFile(String xmlString)  {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE_NAME);
            fileOutputStream.write(xmlString.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
