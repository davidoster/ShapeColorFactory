/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import factories.AbstractShapeColorFactory;
import factories.ShapeColorFactory;
import interfaces.AbstractShapeColor;

/**
 *
 * @author George.Pasparakis
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ShapeColorFactory shapeColorFactory = new ShapeColorFactory();
  
//
//      //get an object of Circle and call its draw method.
//      Shape circle = shapeColorFactory.getShape("CIRCLE");
//
//      //call draw method of Circle
//      circle.draw();
//
//      //get an object of Rectangle and call its draw method.
//      Shape rectangle = shapeColorFactory.getShape("RECTANGLE");
//
//      //call draw method of Rectangle
//      rectangle.draw();
//
//      //get an object of Square and call its draw method.
//      Shape square = shapeColorFactory.getShape("SQUARE");
//
//      //call draw method of square
//      square.draw();
//      
//      Color red = shapeColorFactory.getColor("RED");
//      red.paint();
//      
//      ShapeColor circleRed = shapeColorFactory.getShapeColor("CIRCLE", "RED");
//      circleRed.drawPaint();

//    ShapeColor circle = shapeColorFactory.getShapeColor("CIRCLE", "");
    AbstractShapeColorFactory k = shapeColorFactory.getAbstractShapeColor("", "");
    AbstractShapeColor circleRed2 = shapeColorFactory.getAbstractShapeColor("CIRCLE", "RED");
    circleRed2 = (AbstractShapeColor) shapeColorFactory.getShapeColor("", "");
              
    }
    
}
