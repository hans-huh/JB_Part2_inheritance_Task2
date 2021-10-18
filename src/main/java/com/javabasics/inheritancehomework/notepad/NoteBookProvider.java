package com.javabasics.inheritancehomework.notepad;

public final class NoteBookProvider {
    private static NoteBook noteBook;
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

    public static NoteBook getNoteBook(){
        return noteBook;
    }
}
