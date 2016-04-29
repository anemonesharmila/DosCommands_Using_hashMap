/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dos.commands;

import java.io.File;

/**
 *
 * @author sharmila
 */
public class MdCommands extends DosCommands {

    @Override
    public void execute(String[] param) {

        if (param.length >= 2) {
            String fileName = param[1];
            File file = new File(fileName);
            if (!file.isDirectory()) {
                file.mkdir();
            }
            else
            {
                System.out.println("The file already exits \n");
            }
        }
    }

}
