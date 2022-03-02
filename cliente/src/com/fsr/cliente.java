

package com.fsr;
import java.util.Scanner;
public class cliente extends Persona {
	
	String nombre;
	int edad;
	String sexo;
	static int i=0;
	static String alta[][]=new String [3][i];
	
	 cliente(String nombrecliente,int edadcliente,String sexocliente) {
		 nombre="juan";
		 edad= 19;
		 sexo= "M";
		 
		 
		 
		 
		 
		 
		String tipoEmpleado;
		do {
            tipoEmpleado = pedirCadena("Introduce el tipo de empleado que es : ");
            if(tipoEmpleado.equalsIgnoreCase("potencial")||tipoEmpleado.equalsIgnoreCase("nuevo")||tipoEmpleado.equalsIgnoreCase("vip")||tipoEmpleado.equalsIgnoreCase("moroso"))
                break;
            System.out.println("Error, no se ha encontrado");
        }while(true);
		
		
	}
	 public static String pedirCadena(String texto) {
		 int numCont=0;
	        int aux, controlador;
	        String cadena;
	        Scanner sc = new Scanner(System.in);
	        do {//si hay un error a la hora de meter un numero, se asegura de que no acaba el programa.
	            controlador = 0;
	            try {
	                System.out.print(texto);
	                cadena = sc.nextLine();

	                for (int x = 0; x < cadena.length(); x++) {
	                    char c = cadena.charAt(x);
	                    // Si no está entre a y z, ni entre A y Z
	                    if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
	                        controlador++;
	                    }
	                }
	                if (controlador == 0) {
	                    return cadena;
	                } else {
	                    System.out.println("LA CADENA INTRODUCIDA TIENE CARACTERES NO PERMITIDOS");
	                }
	            } catch (Exception e) {
	                System.out.println("ERROR, EL DATO QUE SE PIDE ES UNA CADENA DE TEXTO");
	            }
	        } while (true);
	        
	    }
	 public static String pedirEntero(String texto) {
		 while(true) {
			 try {
				 int controlador=0,ascii;
				 String cadena;
				 Scanner sc =new Scanner(System.in);
				 System.out.print(texto);
				 cadena=sc.nextLine();
				 for (int x = 0; x < cadena.length(); x++) {
					 ascii = cadena.charAt(x);
					 // Si no está entre a y z, ni entre A y Z, ni es un espacio, ni es un numero
					 if ((ascii >= 48 && ascii <= 57)) {
						 controlador++;
					 }
				 }
				 if (controlador == cadena.length()) {
					 return cadena;
				 } else {
					 System.out.println("LA CADENA INTRODUCIDA TIENE CARACTERES NO PERMITIDOS O SOBREPASA EL LIMITE");
				 }
			 }catch(Exception e) {
			 }
		 }
	 }
	
	 
	 public static void clienteAlta() {
		 i++;
		 String nombre=pedirCadena("Introduce el nombre: ");
		 String edad=pedirEntero("introduce la edad: ");
		 String sexo=pedirCadena("Introduce el sexo del cliente: ");
		 
		 for(int p=0;p<alta.length;p++) {
			 alta[0][p]=nombre;
			 alta[1][p]=edad;
			 alta[2][p]= sexo;
		 }
		 
	 }
	

}
