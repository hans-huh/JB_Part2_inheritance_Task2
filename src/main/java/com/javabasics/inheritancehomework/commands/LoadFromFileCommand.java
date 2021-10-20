package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;
import com.javabasics.inheritancehomework.utils.NotebookLoader;

public class LoadFromFileCommand extends Command{
    public LoadFromFileCommand(Request request){
        super(request);
    }

    @Override
    public Response execute(){
        NoteBookProvider.getNoteBookProvider().setNoteBook(NotebookLoader.
                loadNotebook(super.getRequest().getRequestString()));
        return new Response(true);
    }
}