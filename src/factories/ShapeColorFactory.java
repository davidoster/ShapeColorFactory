/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import interfaces.Color;
import interfaces.Shape;
import interfaces.ShapeColor;
import models.Blue;
import models.Circle;
import models.CircleRed;
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
                    return new Circle();
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
        return(new CircleRed());
    }
}
