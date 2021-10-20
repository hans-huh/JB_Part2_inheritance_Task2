package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBook;


public abstract class Command {
    protected NoteBook notebook;

    public Command(NoteBook notebook){
        this.notebook = notebook;
    }

    public Command(){}

    public abstract Response execute(Request request);
}

