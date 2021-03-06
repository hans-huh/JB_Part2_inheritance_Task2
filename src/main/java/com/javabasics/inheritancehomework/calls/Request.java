package com.javabasics.inheritancehomework.calls;

import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

public class Request {
    private String requestString;
    private NoteBook notebook;

    public Request(String requestString) {
        this.requestString = requestString;
        notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
    }

    public String getRequestString() {
        return requestString;
    }

    public NoteBook getNotebook(){
        return notebook;
    }
}
