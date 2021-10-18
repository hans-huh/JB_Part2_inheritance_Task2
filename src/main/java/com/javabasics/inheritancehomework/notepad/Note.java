package com.javabasics.inheritancehomework.notepad;

import java.util.Date;
import java.util.Objects;

public class Note {
    private Date noteCreatedDateTime;
    private String text;

    public Note() {
        noteCreatedDateTime = new Date();
    }

    public Note(String text) {
        noteCreatedDateTime = new Date();
        this.text = text;
    }

    public Note(String text, Date noteCreatedDateTime){
        this.noteCreatedDateTime = noteCreatedDateTime;
        this.text = text;
    }

    public Date getNoteCreatedDateTime(){
        return noteCreatedDateTime;
    }

    public void setNoteCreatedDateTime(Date date) {
        this.noteCreatedDateTime = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(noteCreatedDateTime, note.getNoteCreatedDateTime()) && text.equals(note.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteCreatedDateTime, text);
    }

    @Override
    public String toString() {
        return "\"" + text + "\"" +
                ", created on " + noteCreatedDateTime;
    }
}
