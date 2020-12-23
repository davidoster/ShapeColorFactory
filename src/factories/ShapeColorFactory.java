/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.AbstractShapeColor;
import interfaces.Color;
import interfaces.Shape;
import interfaces.ShapeColor;
import models.Blue;
import models.Circle;
import models.Green;
import models.Rectangle;
import models.Red;
import models.Square;

/**
 *
 * @author George.Pasparakis
 */
public class ShapeColorFactory {
    
    public Shape getShape(String shapeType) {
        switch(shapeType) {
                case "CIRCLE":
                    return new Circle("CIRCLE","");
//                    break;
                case "RECTANGLE":
                    return new Rectangle();
                case "SQUARE":
                    return new Square();
        }
        return(null);
    }
    
    public Color getColor(String colorType) {
        switch(colorType) {
                case "RED":
                    return new Red();
                case "GREEN":
                    return new Green();
                case "BLUE":
                    return new Blue();
        }
        return(null);
    }
    
    public ShapeColor getShapeColor(String shapeType, String colorType) {
        return(new Circle(shapeType, colorType));
    }
    
    
    // CORRECT because it gives an itermediate level of needed
    // implementations that ARE NOT RELATED TO Shape or Color!!!!!
    public AbstractShapeColor getAbstractShapeColor(String shapeType, String colorType) {
        return(new Circle(shapeType, colorType));
    }
}
