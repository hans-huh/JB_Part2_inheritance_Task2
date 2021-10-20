package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.utils.NotebookSaver;


public class SaveToFileCommand extends Command{
    public SaveToFileCommand(Request request){
        super(request);
    }

    public Response execute(){
        NotebookSaver.saveNotebookToFile(super.getRequest().getRequestString());
        return new Response(true);
    }
}

