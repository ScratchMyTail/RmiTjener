package no.hinesna;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
	    try{
            LocateRegistry.createRegistry(1099);
            Calculator calc = new CalculatorImpl();
            Naming.rebind("AddServer", calc);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
