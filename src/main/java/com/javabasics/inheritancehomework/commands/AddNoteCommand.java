package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.Date;

/*
public class AddCommand extends Command{
    public AddCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public Response execute(Request request){
        notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
        notebook.addNote(request.getTextToStoreInNote, new Date());
        return new Response();
    }

}
*/