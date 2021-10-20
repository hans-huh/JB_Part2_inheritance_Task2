package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;
import com.javabasics.inheritancehomework.utils.DateStringConverter;

import java.util.ArrayList;
import java.util.List;

public class SearchByDateCommand extends Command {
    public SearchByDateCommand(Request request){
        super(request);
    }

    @Override
    public Response execute(){
        List<Note> output = new ArrayList<>();
        for(Note note : NoteBookProvider.getNoteBookProvider().getNoteBook().getNotes()){
            if(DateStringConverter.convertDateToString(note.getNoteCreatedDateTime())
                    .contains(super.getRequest().getRequestString())){
                output.add(note);
            }
        }
        return new Response(true);
    }

}
