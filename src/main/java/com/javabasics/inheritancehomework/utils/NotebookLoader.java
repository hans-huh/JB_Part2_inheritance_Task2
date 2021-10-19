package com.javabasics.inheritancehomework.utils;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class NotebookLoader {
    public static NoteBook loadNotebook(String path){
        return new XMLParser().parseFromFile(path);
    }
}
