package com.javabasics.inheritancehomework.request;

import com.javabasics.inheritancehomework.commands.Command;

public class Request {
    private Command requestedCommand;

    public Request(Command requestedCommand){
        this.requestedCommand = requestedCommand;
    }

    public Command getRequestedCommand(){
        return requestedCommand;
    }
}
