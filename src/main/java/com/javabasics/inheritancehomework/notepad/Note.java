package com.javabasics.inheritancehomework.notepad;

import java.util.Date;
import java.util.Objects;

public class Note {
    private Date noteCreatedDateTime;
    private String noteContent;

    public Note() {
        noteCreatedDateTime = new Date();
    }

    public Note(String noteContent) {
        noteCreatedDateTime = new Date();
        this.noteContent = noteContent;
    }

    public Note(String noteContent, Date noteCreatedDateTime){
        this.noteCreatedDateTime = noteCreatedDateTime;
        this.noteContent = noteContent;
    }

    public Date getNoteCreatedDateTime(){
        return noteCreatedDateTime;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteContent(){
        return noteContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(noteCreatedDateTime, note.getNoteCreatedDateTime()) && noteContent.equals(note.getNoteContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteCreatedDateTime, noteContent);
    }

    @Override
    public String toString() {
        return "\"" + noteContent + "\"" +
                ", created on " + noteCreatedDateTime;
    }
}
