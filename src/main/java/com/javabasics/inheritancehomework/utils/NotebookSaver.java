package com.javabasics.inheritancehomework.utils;

import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class NotebookSaver {
    public static void saveNotebookToFile(String outputFileName)  {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);
            fileOutputStream.write(new XMLGenerator(NoteBookProvider.getNoteBookProvider().getNoteBook())
                    .generateXml().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
