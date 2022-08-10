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
		 double promedio = Metodos.Promedio(a,b);							//METODO PROMEDIO CON PARAMETROS INT Y RETORNO STRING									
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
	
	public static void imprimirFecha(int dia,int mes, int anio) {
		
		String mespalabra;
		
		if (mes == 1) {
			mespalabra="Enero";
		} 
		else if (mes == 2) {
			mespalabra="Febrero";
		} 
		else if (mes == 3) {
			mespalabra="Marzo";
		} 
		else if (mes == 4) {
			mespalabra="Junio";
		}	
		else{
			mespalabra="Julio";
		}
		System.out.println(dia + " de " +  mespalabra + " de "+ anio);
		
	}
	public static int sumatoria(int n) {
		int suma=0;											//ejercisio 10
		for(int i=0; i<=n; i++ ) {
			suma=suma+i;
			
		}return suma;
		
	}
	
	public static int sumatoriaPares(int n) {
        int suma=0;
        for(int i=0; i<=n; i++ ) {
            if (i%2==0) {
                suma=suma+i;
            }

        } return suma;
        
		}
	
	//Hacer una función que devuelva true si el String está compuesto solamente 
	//por letras 'e', y false en caso contrario.
	
	public static  boolean todasE(String palabra) {
		char e='e';	
		for(int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)!= e )
				return false;
			}return true;
		}
	public static void canteE(String palabras) {
		int conte=0;
		int contE=0;
		for(int i=0;i<palabras.length();i++) {
			if(palabras.charAt(i)=='e') {
				conte=conte+1;
			}
			else if(palabras.charAt(i)=='E') {
				contE=contE+1;
			}
		}
		System.out.println(conte);
		System.out.println(contE);
	}
	

}