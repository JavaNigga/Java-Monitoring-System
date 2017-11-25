/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javamonitoringsystem;

import clases.barraCircular;
import clases.obtenerDatos;
import formularios.main;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;



/**
 *
 * @author merli
 */
public class JavaMonitoringSystem {
    
    public static main form = new main();
    public static JProgressBar barra = new barraCircular().makeUI(form.intervalo, Color.DARK_GRAY, 0, 300, 200, 200);
    public static obtenerDatos datos = new obtenerDatos();
    
    public static void main(String[] args)
    {   
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.fondo.setLayout(null);
        form.fondo.add(barra); 
        form.setVisible(true);
        form.ramActiva.setVisible(false);
        form.ramInfo.setVisible(false);
        datos.CPU(form.intervalo);
    }
    
    public void run()
    {
        
    }


}