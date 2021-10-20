package com.javabasics.inheritancehomework.commands;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.calls.Response;
import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.ArrayList;
import java.util.List;

public class DisplayCommand extends Command{
    public DisplayCommand(NoteBook notebook){
        super(notebook);
    }

    @Override
    public Response execute(Request request){
        List<Note> output = new ArrayList<>();
        if(request.getTextToLookFor != null) {
            for(Note note : NoteBookProvider.getNoteBookProvider().getNoteBook().getNotes()){
                if(note.getText().contains(request.getTextToLookFor)){
                    output.add(note);
                }
            }
        }

        if(request.getDateToLookFor != null){
            for(Note note : NoteBookProvider.getNoteBookProvider().getNoteBook().getNotes()){
                if(note.getNoteCreatedDateTime().toString().equals(request.getDateToLookFor.toString)){
                    output.add(note);
                }
            }
        }
        return new Response();
    }
}
