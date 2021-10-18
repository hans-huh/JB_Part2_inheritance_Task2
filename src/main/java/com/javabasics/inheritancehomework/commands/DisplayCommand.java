package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public class DisplayCommand extends Command{
    public DisplayCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public boolean execute(){
        return false;
    }
}
