package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;

public abstract class Command {
    private NoteBook notebook;

    public Command(NoteBook notebook){
        this.notebook = notebook;
    }

    public abstract boolean execute();
}