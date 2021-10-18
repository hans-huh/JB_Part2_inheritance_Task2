package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class AddCommand extends Command{
    public AddCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public boolean execute(){

        return false;
    }
}
