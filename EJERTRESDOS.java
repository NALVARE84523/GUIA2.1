package EJERTRESDOS;

import java.util.Scanner;

public class EJERTRESDOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int valor_viaje = 10000;
	        int valor_conductor = 2000;
	        int capacidad;
	        int personas;
	        int viajes;
	        int pago_conductor;
	        int pago_turistas;

	        System.out.println("Determina el n�mero de personas que caben en el colectivo y el n�mero de turistas\n" +
	                "que van a un hotel, cu�ntos viajes debe realizar el colectivo de acuerdo a su capacidad, cu�nto dinero en total deber�n pagar los\n" +
	                "turistas al colectivo y cu�nto dinero deber� pagar el conductor al propietario");

	        Scanner entrada = new Scanner (System.in);

	        do{
	            System.out.println("Digita la capacidad de personas del Bus Colectivo");
	            capacidad = entrada.nextInt (); 
	        }while(capacidad <= 0);

	        do{
	            System.out.println("Digita el n�mero de pasajeros");
	            personas = entrada.nextInt (); 
	        }while(personas <= 0);

	   
	        if (personas > capacidad){
	            viajes = personas/capacidad;

	            float viajes2 = personas % capacidad;

	            if (viajes2 > 0){
	                viajes = viajes + 1;
	            }
	        }else{
	            viajes = 1;
	        }

	        if (viajes >1){
	            System.out.println("El conductor deber� realizar: " + viajes + " viajes");
	        }else{
	            System.out.println("El conductor deber� realizar: " + viajes + " viaje");
	        }

	      
	        pago_turistas = personas * valor_viaje;
	        System.out.println("Los turistas deberan pagar la suma de: " + pago_turistas);

	       
	        pago_conductor = viajes * valor_conductor;
	        System.out.println("El conductor deber� pagar la suma de: " + pago_conductor);
	}

}
