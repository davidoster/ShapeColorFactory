/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.Color;

/**
 *
 * @author George.Pasparakis
 */
public class Red  implements Color{

    @Override
    public void paint() {
        System.out.println("RED");
    }
    
}
