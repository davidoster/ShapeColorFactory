/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.ShapeColor;

/**
 *
 * @author George.Pasparakis
 */
public class CircleRed implements ShapeColor {

    @Override
    public void draw() {
        System.out.print("Circle");
    }

    @Override
    public void paint() {
        System.out.print("Red");
    }

    @Override
    public void drawPaint() {
        System.out.print("Combined: ");
        draw();
        System.out.print(" with ");
        paint();
        System.out.println("");
    }
    
}
