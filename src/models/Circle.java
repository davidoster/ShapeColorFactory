/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.Color;
import interfaces.Shape;

/**
 *
 * @author George.Pasparakis
 */
public class Circle implements Shape, Color {

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public void paint() {
        System.out.println("Circle with color");
    }
    
}
