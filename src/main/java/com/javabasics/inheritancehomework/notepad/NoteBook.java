package com.javabasics.inheritancehomework.notepad;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notes;

    public NoteBook(){
        notes = new ArrayList<>();
    }

    public NoteBook(List<Note> notes){
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> noteBook) {
        this.notes = noteBook;
    }

    public void addNote(Note note) {

    }

    @Override
    public String toString() {
        StringBuilder tempString = new StringBuilder();
        for (Note n : notes) tempString.append(n.toString() + ", ");
        return tempString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        NoteBook anotherNotebook = (NoteBook) o;
        if(this.notes.size() != anotherNotebook.getNotes().size()) return false;
        for(int i = 0; i < this.notes.size(); i++) {
            if(this.notes.get(i).equals(anotherNotebook.getNotes().get(i))){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
       int hashCode = 0;
       for(Note note : this.notes) hashCode += note.hashCode();
       return hashCode;
    }
}
