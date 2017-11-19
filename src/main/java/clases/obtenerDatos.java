package clases;

import static com.mycompany.javamonitoringsystem.JavaMonitoringSystem.barra;
import static com.mycompany.javamonitoringsystem.JavaMonitoringSystem.valor;
import com.mycompany.javamonitoringsystem.JavaMonitoringSystem;
import oshi.SystemInfo;

public class obtenerDatos {
    
    JavaMonitoringSystem principal = new JavaMonitoringSystem();
    SystemInfo si = new SystemInfo();
    
    public void CPU()
    {
        
        principal.cpuNombre = si.getHardware().getProcessor().getName();
        principal.cpuVendedor = si.getHardware().getProcessor().getVendor();
        principal.cpuLogicos = si.getHardware().getProcessor().getLogicalProcessorCount();
        principal.cpuFisicos = si.getHardware().getProcessor().getPhysicalProcessorCount();
        
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while(true)
                {
                    
                    valor = (int) (si.getHardware().getProcessor().getSystemCpuLoad() * 100);
                    //System.out.println("valor: " + valor);
                    barra.setValue(valor);
                }
               
            }
        };
        
        Thread hiloCPU = new Thread(run);
        hiloCPU.start();
    }
    
}
