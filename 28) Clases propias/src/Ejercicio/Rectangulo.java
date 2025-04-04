/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author juanp
 */
public class Rectangulo {
    
    private double base = 0.0;
    private double altura = 0.0;
    
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public double getArea(){
        return (base * altura);
    }
    
    public double getPerimetro(){
        return  2 * (base + altura);
    }
    
}
