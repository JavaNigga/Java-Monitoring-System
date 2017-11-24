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
    
}
