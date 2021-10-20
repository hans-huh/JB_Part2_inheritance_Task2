package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;


public class CreateCommand extends Command{
    public CreateCommand(){
        super();
    }

    @Override
    public Response execute(Request request){
        NoteBookProvider.getNoteBookProvider().getNoteBook();
        return new Response(true);
    }
}
