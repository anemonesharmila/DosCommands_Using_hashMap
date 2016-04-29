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
public class DirCommand extends DosCommands {

    @Override
    public void execute(String[] param) {
        String path = "";
        if (param.length == 1) {
            path = ".";
        }
        File file = new File(path);
        for (File f : file.listFiles()) {
            //System.out.println(f.toString());
            System.out.println("File name:"+f.getName() +"  ");
            System.out.println("AbsolutePath"+f.getAbsolutePath() +" ");
            System.out.println(f.getTotalSpace()+" ");
            System.out.println(f.getUsableSpace());
        }
        

    }

}
