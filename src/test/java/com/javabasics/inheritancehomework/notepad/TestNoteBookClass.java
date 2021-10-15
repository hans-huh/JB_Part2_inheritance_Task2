package com.javabasics.inheritancehomework.notepad;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TestNoteBookClass {
    private String VALUE_TO_STORE_IN_NOTE = "TEST_STRING";

    @Test
    public void notebookCreateObjectWithNotParameterizedConstructor(){
        NoteBook noteBook = new NoteBook();
        Assert.assertNotNull("Instance not created!", noteBook);
    }

    @Test
    public void notebookCreateObjectWithParameterizedConstructor(){
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        NoteBook noteBook = new NoteBook(notes);
        Assert.assertNotNull("Instance not created!", noteBook);
        List<Note> anotherNotes = new ArrayList<>();
        anotherNotes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        Assert.assertEquals("Comparison of two identical arraylists returns FALSE, expected TRUE", anotherNotes, noteBook.getNotes());
    }

    @Test
    public void notebookTestOverriddenToStringMethod(){
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        StringBuilder tempTestString = new StringBuilder();
        for(Note note: notes) tempTestString.append(note.toString() + ", ");

        NoteBook noteBook = new NoteBook(notes);
        Assert.assertTrue("String comparison returns FALSE, expected TRUE!",
                tempTestString.toString().equals(noteBook.toString()));
    }

    @Test
    public void notebookTestOverriddenHashCodeMethod(){
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        int hashCode = notes.stream().mapToInt(Objects::hashCode).sum();
        NoteBook noteBook = new NoteBook(notes);
        Assert.assertEquals("Hash comparison returns FALSE, expected TRUE",
                hashCode, noteBook.hashCode());
    }

    @Test
    public void notebookTestOverriddenEqualsMethod(){
        List<Note> notes = new ArrayList<>();
        List<Note> differentNotes = new ArrayList<>();

        notes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        differentNotes.add(new Note(VALUE_TO_STORE_IN_NOTE));
        differentNotes.add(new Note(VALUE_TO_STORE_IN_NOTE + VALUE_TO_STORE_IN_NOTE));
        NoteBook noteBook = new NoteBook(notes);
        NoteBook differentNoteBook = new NoteBook(differentNotes);
        NoteBook sameNoteBook = noteBook;

        Assert.assertFalse("Comparing to another instance returns TRUE, expected FALSE!",
                noteBook.equals(differentNoteBook));
        Assert.assertFalse("Comparing to null returns TRUE, expected FALSE", noteBook.equals(null));
        Assert.assertFalse("Comparing to instance of another class returns TRUE, expected FALSE",
                noteBook.equals(new Date()));
        Assert.assertTrue("Comparing to the same instance returns FALSE, expected TRUE", noteBook.equals(sameNoteBook));
        Assert.assertTrue("Comparing two identical objects returns FALSE, expected TRUE",
                noteBook.equals(new NoteBook(noteBook.getNotes())));
    }
}
