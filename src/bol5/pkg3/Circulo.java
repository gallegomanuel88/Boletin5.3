/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg3;

/**
 *
 * @author galle
 */
public class Circulo {
    
    //Atributos
    private double radio;
    private final static double pi = 3.14;
    
    //Constructor
    public Circulo (){    
    }
    public Circulo (double r){
        r = radio;
    }
    
    //metodos
    public void radio (double r){
        r = radio;
    }
    public double getArea (){
        double area = (pi*Math.pow(radio, 2));
        return area;
    }
    public double getLongitud (){
        double longitud = 2*radio*pi;
        return longitud;
    }
}
