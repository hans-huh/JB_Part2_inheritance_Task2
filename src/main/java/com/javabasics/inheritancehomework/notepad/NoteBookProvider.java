package com.javabasics.inheritancehomework.notepad;

public final class NoteBookProvider {
    private NoteBook noteBook;
    private static NoteBookProvider noteBookProviderSingleton;

    private NoteBookProvider(){
        noteBook = new NoteBook();
    }

    public static NoteBookProvider getNoteBookProvider() {
        if(noteBookProviderSingleton == null){
            noteBookProviderSingleton = new NoteBookProvider();
        }
        return noteBookProviderSingleton;
    }

    public NoteBook getNoteBook(){
        return noteBook;
    }
}
