package com.javabasics.inheritancehomework.utils;

import com.javabasics.inheritancehomework.notepad.Note;
import com.javabasics.inheritancehomework.notepad.NoteBook;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class XMLParser {
    private static final String NOTEBOOK = "notebook";
    private static final String NOTE = "note";
    private static final String DATE = "date";
    private static final String TEXT = "text";

    private boolean bDateElement = false;
    private boolean bTextElement = false;

    private StringBuilder elementValue;
    private NoteBook notebook;

    public XMLParser() {}

    public NoteBook parseFromFile(String path){
        try {
            File inputFile = new File(path);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            CustomHandler customHandler = new CustomHandler();
            saxParser.parse(inputFile, customHandler);
        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
        return notebook;
    }


    class CustomHandler extends DefaultHandler {
        public CustomHandler() {}

        @Override
        public void startDocument() throws SAXException {
            notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
        }

        @Override
        public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) throws SAXException {
            switch (qName) {
                case NOTEBOOK:
                    notebook = NoteBookProvider.getNoteBookProvider().getNoteBook();
                    break;
                case NOTE:
                    notebook.addNote(new Note());
                    break;
                case DATE:
                    elementValue = new StringBuilder();
                    break;
                case TEXT:
                    elementValue = new StringBuilder();
                    break;
            }
        }

        @Override
        public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
            switch (qName){
                case DATE:
                    getLastNote().setNoteCreatedDateTime(DateStringConverter.convertStringToDate(elementValue.toString()));
                    break;
                case TEXT:
                    getLastNote().setText(elementValue.toString());
                    break;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if(elementValue == null){
                elementValue = new StringBuilder();
            } else {
                elementValue.append(ch, start, length);
            }
        }

        private Note getLastNote() {
            int latestNoteIndex = notebook.getNotes().size() - 1;
            return notebook.getNotes().get(latestNoteIndex);
        }
    }

}
