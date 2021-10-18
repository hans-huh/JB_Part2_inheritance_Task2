package com.javabasics.inheritancehomework.notepad;

public final class NoteBookConsoleView extends NoteBook{
    private NoteBookConsoleView(){}

    public static void print(Note note){
        System.out.println(note.toString());
    }

    public static void print(NoteBook noteBook) {
        for(Note note : noteBook.getNotes()) System.out.println(note.toString());
    }

    public static void print(Note ... notes) {
        for(Note note : notes) System.out.println(note.toString());
    }
}
