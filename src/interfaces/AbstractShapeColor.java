/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import factories.AbstractShapeColorFactory;

/**
 *
 * @author George.Pasparakis
 */
public interface AbstractShapeColor extends AbstractShapeColorFactory {
    void redraw();
}
