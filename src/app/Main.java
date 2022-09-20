/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import Clases.empleado;
import Clases.empresa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        empresa conf = new empresa(1000000,117172);
        
        ArrayList<empleado> emp = new ArrayList<empleado>();
        
        int resp  = 2, n = 1;
        //JOptionPane.showMessageDialog(null, "Bienvenido al nuestro sistema de nomina, payroll system");
        
        do {
            JOptionPane.showMessageDialog(null, "Empleado n" + n);
            
            String nombres = JOptionPane.showInputDialog("Digite nombre completo");
            Double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario basico"));
            int diasTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Digite dias trabajados"));
            
            empleado persona = new empleado(nombres, salarioBasico, diasTrabajados);
            persona.calcSalarioDevengado();
            persona.calcAuxilioTrasporte(conf.getSalarioMinimo(), conf.getAuxilioTrasporte());
            persona.calcTotalDesvengado();
            persona.calcValorSalud();
            persona.calcValorPension();
            persona.calcTotalNeto();
            
            //Calcular Salario desvengado
            
            if (!emp.contains(persona)) {
                emp.add(persona);
                n++;
            }else{
                JOptionPane.showMessageDialog(null, "Esta persona ya fue agregada!!","ERROR",JOptionPane.ERROR);
            }
            
            resp = JOptionPane.showConfirmDialog(null, "Desea seguir agregando","CONFIRMACION",JOptionPane.YES_NO_OPTION);
            
        } while (resp!=1);
        
        int nemp = 1;
        double netopagado = 0;
        for (empleado object : emp) {
            System.out.println("");
            System.out.println("Empleado "+nemp);
            System.out.println("Nombre Empleado: "+object.getNombreCompleto());
            System.out.println("Salario Basico : "+object.getSalarioBasico());
            System.out.println("Dias trabajados : "+object.getDiasTrabajados());
            System.out.println("salario Devengado : "+(int)object.getSalarioDevengado());
            System.out.println("Auxilio de trasporte : "+(int)object.getAuxilioDeTrasporte());
            System.out.println("Total devengado : "+(int)object.getTotalDevengado());
            System.out.println("Salud : "+(int)object.getSalud());
            System.out.println("Pension : "+(int)object.getPrension());
            System.out.println("Total a pagar : "+(int)object.getTotalNetoPagado());
            
            netopagado+= object.getTotalNetoPagado();
        }
        conf.setNetoPagado(Math.round(netopagado));
        
        System.out.println("");
        
        System.out.println("INFORMACION PARA LA EMPRESA");
        System.out.println("NETO PAGADO : "+conf.getNetoPagado());
        System.out.println("Comprobante de Nomina a la fecha "+conf.getFechaActual()+ ", Muchas gracias por elegirnos .");
        
        
        System.out.println("Good Bye!");
    }
    
}
