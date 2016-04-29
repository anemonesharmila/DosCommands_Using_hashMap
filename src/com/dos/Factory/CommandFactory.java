/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dos.Factory;

import com.dos.commands.CreateFile;
import com.dos.commands.DirCommand;
import com.dos.commands.DosCommands;
import com.dos.commands.MdCommands;
import com.dos.commands.RdCommands;
import java.util.HashMap;

/**
 *
 * @author sharmila
 */
public class CommandFactory {

    private static HashMap<String, DosCommands> commands = getCommand();

    public static HashMap<String, DosCommands> getCommand() {
        HashMap<String, DosCommands> cmd = new HashMap<>();
        cmd.put("md", new MdCommands());
        cmd.put("rd", new RdCommands());
        cmd.put("file", new CreateFile() );
        cmd.put("dir", new DirCommand());

        return cmd;

    }

    public static DosCommands get(String key) {
        if (isExits(key)) {
            return commands.get(key);
        }
        return null;

    }

    public static Boolean isExits(String key) {
        return commands.containsKey(key);
    }
}
