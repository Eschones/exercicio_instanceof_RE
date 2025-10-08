package br.com.exemplo;

import br.com.exemplo.heranca.Employee;
import br.com.exemplo.heranca.Manager;

/*
 * esta classe implementa o conceito de verificacao de instancias de classe
 * atraves do metodo instanceof
 */
public class TestarInstanceOf {
    
    public static void main(String[] args) {

        Employee a = new Employee();
        Manager m1 = new Manager("Manager");
        Manager m2= new Manager("Manager 1");
        
        if (a instanceof Employee){
        
            System.out.println("Empregado");
            
        }
        
        if(m1 instanceof Employee){
        
            System.out.println("m1");
            
        }
        
        if (m2 instanceof Manager){
        
            System.out.println("m2");
            
        }
        
        a = m2;
        
    }
}
