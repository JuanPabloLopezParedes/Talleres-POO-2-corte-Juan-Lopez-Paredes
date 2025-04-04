/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Main {
    public static void main(String[] args) {
        
        Rectangulo suelo = new Rectangulo();
        double area;
        double perimetro;
        
        
        suelo.setBase(5);
        suelo.setAltura(20);
        
        area = suelo.getArea();
        perimetro = suelo.getPerimetro();
        
        JOptionPane.showMessageDialog(null, "Base: " + suelo.getBase());
        JOptionPane.showMessageDialog(null, "Altura: " + suelo.getAltura());
        JOptionPane.showMessageDialog(null, "Area: " + suelo.getArea());
        JOptionPane.showMessageDialog(null, "Perimetro: " + suelo.getPerimetro());
        
        
        
    }
    
}
