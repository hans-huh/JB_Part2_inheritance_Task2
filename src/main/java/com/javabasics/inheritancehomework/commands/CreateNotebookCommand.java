package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;


public class CreateNotebookCommand extends Command{
    public CreateNotebookCommand(){
        super();
    }

    @Override
    public Response execute(){
        NoteBookProvider.getNoteBookProvider().getNoteBook();
        return new Response(true);
    }
}
