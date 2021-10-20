package com.javabasics.inheritancehomework.runner;

import com.javabasics.inheritancehomework.calls.Request;
import com.javabasics.inheritancehomework.commands.*;
import com.javabasics.inheritancehomework.notepad.NoteBookProvider;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        commands.add(new CreateNotebookCommand());
        commands.add(new AddNoteCommand(new Request("myCustomNote")));
        commands.add(new SearchByDateCommand(new Request("19/10/2021 23:47:43")));
        commands.add(new SearchByTextCommand(new Request("ustomN")));
        commands.add(new SaveToFileCommand(new Request("output.xml")));

        for(Command command : commands){
            command.execute();
        }

        commands = new ArrayList<>();
        commands.add(new LoadFromFileCommand(new Request("output.xml")));
        commands.add(new SearchByTextCommand(new Request("ustomN")));
    }
}
