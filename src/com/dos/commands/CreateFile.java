/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dos.commands;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author sharmila
 */
public class CreateFile extends DosCommands {

    @Override
    public void execute(String[] param) {
        if (param.length >= 2) {
            File file = new File(param[1]);
            try {
                if (file.isFile()) {
                    file.createNewFile();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
