/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parser;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author donow01
 */
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.action();
    }
    
    public void action() {

        Serializer serializer = new Persister();
        File source = new File("example.xml");
        
        try {
            Example example = serializer.read(Example.class, source);
        System.out.print("aaaa");
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
