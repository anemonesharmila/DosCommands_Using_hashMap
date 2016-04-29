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
public class RenameFile extends DosCommands{

    @Override
    public void execute(String[] param) {
        if(param.length>=3)
        {
            File file=new File(param[2]);
            //file.getName(param[1]).
            
        }
    }
    
}
