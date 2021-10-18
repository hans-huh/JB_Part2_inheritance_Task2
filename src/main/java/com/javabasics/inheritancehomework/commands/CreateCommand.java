package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class CreateCommand extends Command{
    public CreateCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public boolean execute(){
        return false;
    }
}
