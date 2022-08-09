package Prueba;
import java.util.Scanner;
public class Metodos {
	
	public static void Saludar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("introdusca su nombre");
		String nombre= sc.nextLine();
		System.out.println("bienvenido "+ nombre +" sos hermoso LPM");
	}

	public static int suma(int n, int m) {   //METODO SUMA
		return  n+m;
	}
	
	
	public static double Promedio(double n , double m ) {	
		double promedio = (n+m)/2;									//METODO PROMEDIO  CON RETORNO
		return promedio;
	}
	public static void promiedos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("introdusca 2 numeros");					//METODO PROMEDIO SIN RETORNO
		int numero1= sc.nextInt();
		int numero2= sc.nextInt();
		System.out.println("el promedio entre" + numero1 + " y "+ numero2 + " es " + ((numero1+numero2)/2));
	}
	public static String PonerNota(double a, double b) { 				
		String Resultado="";									
		 double promedio = (a+b)/2;									//METODO PROMEDIO CON PARAMETROS INT Y RETORNO STRING									
		 if (promedio>=7) {
			 Resultado="promociona";
		 }
		 else if(promedio>=4) {
			 Resultado="aprueba pero va a final";
		 }
		 else {
			 Resultado="recursa";
		 }
		
		 
		return Resultado;
	}
	
	
	
	
	
	
}
