package com.javabasics.inheritancehomework.calls;

import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

public class Response {
    private boolean result;
    private NoteBook notebook;

    public Response(boolean result) {
        this.result = result;
        notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
    }

    public boolean getResponseResult(){
        return result;
    }

    public NoteBook getResponseNotebook(){
        return notebook;
    }
}
