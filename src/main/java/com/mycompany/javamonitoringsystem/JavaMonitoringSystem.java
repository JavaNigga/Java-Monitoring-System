/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javamonitoringsystem;

import clases.barraCircular;
import clases.obtenerDatos;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import formularios.main;
import javax.swing.JProgressBar;

/**
 *
 * @author merli
 */
public class JavaMonitoringSystem {
    
    static main main = new main();
    public static int valor;
    public static JProgressBar barra = new barraCircular().makeUI(valor, Color.DARK_GRAY, 0, 300, 200, 200);
    public static JPanel cpuInfo = main.procesadorInfo;
    public static String cpuNombre;
    public static String cpuVendedor;
    public static int cpuLogicos;
    public static int cpuFisicos;

    public static void main(String[] args)
    {
        
        EventQueue.invokeLater(() ->
        {
            new obtenerDatos().CPU();
            System.out.println("nombre: " + cpuNombre + "\n" + 
                    "vendedor: " + cpuVendedor + "\n" + 
                    "cpu logicos: " + cpuLogicos + "\n" + 
                    "cpu fisicos: " + cpuFisicos);
            JFrame form = new JFrame();
            form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            form.setSize(main.getSize());
            form.getContentPane().setBackground(Color.white);
            form.getContentPane().add(main.cabezera);
            form.getContentPane().add(main.menuProcesador);
            form.getContentPane().add(barra);
            main.cpuNombre.setText(cpuNombre);
            main.cpuVendedor1.setText(cpuVendedor);
            main.cpuLogicos.setText(Integer.toString(cpuLogicos));
            main.cpuFisicos1.setText(Integer.toString(cpuFisicos));
            form.getContentPane().add(cpuInfo);
            form.setLocationRelativeTo(null);
            form.setLayout(null);
            form.setResizable(false);
            form.setVisible(true);
        });
        
        
    }
    
}
