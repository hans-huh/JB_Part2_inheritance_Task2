package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class SaveToFileCommand extends Command{
    public SaveToFileCommand(NoteBook notebook){
        super(notebook);
    }

    public boolean execute(){
        return false;
    }
}
