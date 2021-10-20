package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBook;


public abstract class Command {
    private Request request;
    public Command(Request request){
        this.request = request;
    }

    public Command(){}

    public Request getRequest(){
        return request;
    }

    public abstract Response execute();
}

