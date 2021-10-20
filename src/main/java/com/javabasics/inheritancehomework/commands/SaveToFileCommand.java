package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.utils.NotebookSaver;


public class SaveToFileCommand extends Command{
    public SaveToFileCommand(NoteBook notebook){
        super(notebook);
    }

    public Response execute(Request request){
        NotebookSaver.saveNotebookToFile(request.getRequestString());
        return new Response(true);
    }
}

