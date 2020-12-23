/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.AbstractShapeColor;
import interfaces.ShapeColor;

/**
 *
 * @author George.Pasparakis
 */
public class Circle implements AbstractShapeColor, ShapeColor {
    String shapeType;
    String colorType;
    
    private Circle() {}
    
    public Circle(String shapeType, String colorType) {
        this.shapeType = shapeType;
        this.colorType = colorType;
        drawPaint();
    }
            
    @Override
    public void draw() {
        System.out.println(shapeType);
    }

    @Override
    public void paint() {
        System.out.println(colorType);
    }

    @Override
    public void drawPaint() {
        System.out.print("Combined: ");
        draw();
        System.out.print(" with ");
        paint();
        System.out.println("");
    }

    @Override
    public void redraw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
