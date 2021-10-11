package com.javabasics.inheritancehomework.notepad;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.Objects;

public class TestNoteClass {
    private Note note;
    private String VALUE_TO_STORE_IN_NOTE = "TEST_STRING";

    /* testing object created with constructor with no parameters */
    @Test
    public void createObjectWithNotParameterizedConstructor(){
        note = new Note();
        Assert.assertNotNull("Instance not created! ", note);
        note.setNoteContent(VALUE_TO_STORE_IN_NOTE);
        Assert.assertEquals("Unexpected note content!", VALUE_TO_STORE_IN_NOTE, note.getNoteContent());
        Assert.assertNotNull("Date not created!", note.getNoteCreatedDateTime());
    }

    @Test
    public void createObjectWithParameterizedConstructor(){
        note = new Note(VALUE_TO_STORE_IN_NOTE);
        Assert.assertNotNull("Instance not created! ", note);
        Assert.assertEquals("Unexpected note content!", VALUE_TO_STORE_IN_NOTE, note.getNoteContent());
        Assert.assertNotNull("Date not created!", note.getNoteCreatedDateTime());
    }

    @Test
    public void testOverriddenToStringMethod(){
        note = new Note(VALUE_TO_STORE_IN_NOTE);

        Assert.assertEquals("Unexpected note content!","\""
                + VALUE_TO_STORE_IN_NOTE + "\"" + ", created on " + note.getNoteCreatedDateTime(), note.toString());
    }

    @Test
    public void testOverriddenHashMethod(){
        note = new Note(VALUE_TO_STORE_IN_NOTE);
        Assert.assertEquals("Unexpected hash value!",
                Objects.hash(note.getNoteCreatedDateTime(), note.getNoteContent()), note.hashCode());
    }

    @Test
    public void testOverriddenEqualsMethod(){
        note = new Note(VALUE_TO_STORE_IN_NOTE);
        Note sameNote = note;
        Note differentNote = new Note(VALUE_TO_STORE_IN_NOTE + VALUE_TO_STORE_IN_NOTE);

        Assert.assertFalse("Comparing to another instance returns TRUE, expected FALSE!",
                note.equals(differentNote));
        Assert.assertFalse("Comparing to null returns TRUE, expected FALSE", note.equals(null));
        Assert.assertFalse("Comparing to instance of another class returns TRUE, expected FALSE", note.equals(new Date()));
        Assert.assertTrue("Comparing to the same instance returns FALSE, expected TRUE", note.equals(sameNote));
        Assert.assertTrue("Comparing two identical objects returns FALSE, expected TRUE",
                note.equals(new Note(note.getNoteContent(), note.getNoteCreatedDateTime())));
    }
}
