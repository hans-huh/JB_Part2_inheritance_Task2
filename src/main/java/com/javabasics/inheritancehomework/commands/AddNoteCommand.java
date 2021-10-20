package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.Date;


public class AddNoteCommand extends Command{
    public AddNoteCommand(Request request){
        super(request);
    }

    @Override
    public Response execute(){
        NoteBookProvider.getNoteBookProvider().getNoteBook().addNote(new Note(super.getRequest().getRequestString(),
                new Date()));
        return new Response(true);
    }

}
