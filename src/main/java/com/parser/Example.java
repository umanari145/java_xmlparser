/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parser;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


    
 @Root
public class Example {

    @Element
    private String text;

    @Attribute
    private int index;

    public Example() {
       super();
    }  

    public Example(String text, int index) {
        this.text = text;
        this.index = index;
    }

    public String getMessage() {
        return text;
    }

    public int getId() {
        return index;
    }
}