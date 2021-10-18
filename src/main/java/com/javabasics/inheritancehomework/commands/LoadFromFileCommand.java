package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class LoadFromFileCommand extends Command{
    public LoadFromFileCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public boolean execute(){
        return false;
    }
}
