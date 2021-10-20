package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.ArrayList;
import java.util.List;

public class SearchByTextCommand extends Command{
    public SearchByTextCommand(Request request){
        super(request);
    }

    @Override
    public Response execute(){
        List<Note> output = new ArrayList<>();
            for(Note note : NoteBookProvider.getNoteBookProvider().getNoteBook().getNotes()){
                if(note.getText().contains(super.getRequest().getRequestString())){
                    output.add(note);
                }
            }
        return new Response(true);
    }
}
