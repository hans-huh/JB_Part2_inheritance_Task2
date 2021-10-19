package com.javabasics.inheritancehomework.utils;

import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.StringWriter;

public class XMLGenerator {
    private NoteBook notebook;
    private String outputString;

    public XMLGenerator(NoteBook notebook) {
        this.notebook = notebook;
    }

    public String generateXml() {
        try {
            StringWriter stringWriter = new StringWriter();
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);

            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement(notebook.getClass().getSimpleName().toLowerCase());
            for(Note note : notebook.getNotes()) {
                xmlStreamWriter.writeStartElement(note.getClass().getSimpleName().toLowerCase());
                xmlStreamWriter.writeStartElement(note.getNoteCreatedDateTime().getClass().getSimpleName().toLowerCase());
                xmlStreamWriter.writeCharacters(DateStringConverter.convertDateToString(note.getNoteCreatedDateTime()));
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeStartElement("text");
                xmlStreamWriter.writeCharacters(note.getText());
                xmlStreamWriter.writeEndElement();
                xmlStreamWriter.writeEndElement();
            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            outputString = stringWriter.getBuffer().toString();
            stringWriter.close();
            return outputString;
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputString;
    }
}
