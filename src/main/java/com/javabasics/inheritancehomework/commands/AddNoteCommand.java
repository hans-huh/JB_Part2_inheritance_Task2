package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.Date;


public class AddNoteCommand extends Command{
    public AddNoteCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public Response execute(Request request){
        notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
        notebook.addNote(new Note(request.getRequestString(), new Date()));
        return new Response(true);
    }

}
