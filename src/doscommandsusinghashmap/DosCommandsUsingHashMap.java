/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doscommandsusinghashmap;

import com.dos.Factory.CommandFactory;
import com.dos.commands.DosCommands;
import java.util.Scanner;

/**
 *
 * @author sharmila
 */
public class DosCommandsUsingHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String param="";
        Scanner input =new Scanner(System.in);
        
        while(!(param.equalsIgnoreCase("exit"))){
            param=input.nextLine();
            
            String[] data=param.split(" ");
            
            DosCommands cmd=CommandFactory.get(data[0]);
            if(cmd!=null)
            {
                cmd.execute(data);
            }
        }
    }
    
}
