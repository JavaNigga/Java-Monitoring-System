package clases;

import com.mycompany.javamonitoringsystem.JavaMonitoringSystem;
import formularios.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import oshi.SystemInfo;

public class obtenerDatos {

    static JavaMonitoringSystem jm = new JavaMonitoringSystem();
    static SystemInfo si = new SystemInfo();
    static JProgressBar barra = jm.barra;
    public static  Timer tiempo;
    
    
    public static void CPU(int intervalo)
    {
        jm.form.cpuNombre.setText(si.getHardware().getProcessor().getName());
        jm.form.cpuVendedor1.setText(si.getHardware().getProcessor().getVendor());
        jm.form.cpuLogicos.setText(Integer.toString(si.getHardware().getProcessor().getLogicalProcessorCount()));
        jm.form.cpuFisicos1.setText(Integer.toString(si.getHardware().getProcessor().getPhysicalProcessorCount()));
        
        tiempo = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double cpu = si.getHardware().getProcessor().getSystemCpuLoad() * 100;
                System.err.println(cpu);
                barra.setValue((int) cpu);
                
                tiempo.setDelay(JavaMonitoringSystem.form.intervalo);
                //System.err.println(si.getHardware().getProcessor().getSystemCpuLoad() * 100);
            }
        });
        tiempo.start();
    }
    
    public static void RAM(int intervalo)
    {
        Timer tiempo2 = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
              
                //libre:
              /*  float libreBytes = si.getHardware().getMemory().getAvailable();
                String libreString = Float.toString(libreBytes).substring(0, 3);
                float libreGb = Float.parseFloat(libreString);
                //*********************************************************************
                
                //Total:
                float total = si.getHardware().getMemory().getTotal();
                String totalString = Float.toString(total).substring(0,3);
                float totalGb = Float.parseFloat(totalString);
                //***********************************************************************
                
                float usada = totalGb - libreGb;
                String usadaString = Float.toString(usada).substring(0, 3);
                float usadaGb = Float.parseFloat(usadaString);
                
                
                float porcentaje = (totalGb * usadaGb) / (intervalo / 1000);
                
                System.out.println("Libre: " + libreGb + " Total: " + totalGb + " Usada: " + usadaGb + " Porcentaje: " + porcentaje);
                */
                
                double libre = (si.getHardware().getMemory().getAvailable() / 1024) / 1024;
                double total = (si.getHardware().getMemory().getTotal() / 1024) / 1024;
                double usada = (total - libre);
                
                //libre
                String libreString = Double.toString(libre).substring(0, 2);
                StringBuilder stb = new StringBuilder();
                for(int i = 0; i < libreString.length(); i++)
                {
                    if(i < 1)
                    {
                        stb.append(libreString.charAt(i) + ".");
                    }else
                    {
                        stb.append(libreString.charAt(i));
                    }
                    
                }
                String libreGb = stb.toString();
                
                //total
                String totalString = Double.toString(total).substring(0, 2);
                StringBuilder stb2 = new StringBuilder();
                for(int i = 0; i < totalString.length(); i++)
                {
                    if(i < 1)
                    {
                        stb2.append(totalString.charAt(i) + ".");
                    }else
                    {
                        stb2.append(totalString.charAt(i));
                    }
                    
                }
                String totalGb = stb2.toString();
                
                //usada
                String usadaString = Double.toString(usada).substring(0, 2);
                StringBuilder stb3 = new StringBuilder();
                for(int i = 0; i < usadaString.length(); i++)
                {
                    if(i < 1)
                    {
                        stb3.append(usadaString.charAt(i) + ".");
                    }else
                    {
                        stb3.append(usadaString.charAt(i));
                    }
                    
                }
                String usadaGb = stb3.toString();
                
                float porcentaje = (Float.parseFloat(usadaGb) * 100) / Float.parseFloat(totalGb);
                
                
                System.out.println("usada: " + usadaGb + " libre: " + libreGb + " tota: " + totalGb + " Porcentaje: " + porcentaje);
                main.barraRam.setValue((int) porcentaje);
                main.usoRam.setText(usadaGb);
                main.libreRam.setText(libreGb);
                main.totalRam.setText(totalGb);
                
            }
        });
        
        
        tiempo2.start();
    }
    
}
