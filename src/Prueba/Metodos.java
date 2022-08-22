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
//-------------------------------------------ARRAYS-------------------------------------------------------
	
	
	public static void imprimir(int[] a) {
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static double promedio(int[] a) {
		double contador=0;
		for(int i=0;i<a.length;i++) {
			contador=contador+a[i];
		}return contador/a.length;
	}
	
	public static int maximo(int[] a) {
		int maximo=0;
		for (int i=0;i<a.length;i++) {
			if(maximo<a[i]) {
				maximo=a[i];
			}
		}return maximo;
	}
	public static int[] reverso(int[] a) {
		int b[]= new int [a.length];
		int cont=0;
		for(int i =a.length-1 ; i>=0 ;i--) {						// funcion para imprimir otro array al inverso.
			b[cont]=a[i];
			cont=cont+1;
		}return b;
	}
	public static int[] pedirArreglo(int n) {
		int a[]=new int[n-1];
		Scanner sc=new Scanner(System.in);
		int cont =0;
		while(cont<a.length) {
			System.out.println("ingrese un valor a la posicion "+ cont);          // CREAR Y LLENAR UN ARRAY CON LO QUE ME PIDE EL USUARIO.
			int pedir= sc.nextInt();
			a[cont]=pedir;
			cont++;
		}
		
		return a;
	}
	
//-----------------------------------RECURSIVIDAD--------------------------------------------------------------------------------
	
	
	public static int sumaDesdeUnoHasta(int n) {
		if(n==1)
			return 1;
		return n + sumaDesdeUnoHasta(n-1);
	}
		
	public static void imprimirHasta(int n) {
			if(n>1)   
				imprimirHasta(n-1);
			System.out.println(n);
			
	} 
	 public static void imprimirDesde(int n) {
		 if(n>=1) {
			 System.out.println(n);
		 
		 		imprimirDesde(n-1);}
	 }
	 
	 public static int sumaDeCuadradosHasta(int n) {
		 if(n==1) 
			 return 1;
		 return n*n+sumaDeCuadradosHasta(n-1);
		 
	 }
	 public static int potencia(int base, int exp) {
		 if (exp>1) { 
			 potencia((base*base),(exp-1));
			 }								                         //REVISAR ESTE POR FAVORRR!!
		 	return base;
		 }
	 
	 
	 public static int potenciaConRecursion (int m, int n) {
	        if (n==0) { 
	        	return 1;										//resolucion https://www.youtube.com/watch?v=1T6w78H1_No&ab_channel=TutorialesdeProgramaci%C3%B3nExplicada
	        } 
	        else  { 
	        	return m * potenciaConRecursion (m, n-1); // potencia(m,n-1) es igual al caso base que es 'm' 
	        	}
	    }
	 
	 public static int sumaEntre(int n, int m) {
		 //Calcula la suma de los números que hay entre n y m. Incluyendo a n y a m. Asumir que m >= n. 
		 if (n==m)
			 return n;
		 
			return  m+sumaEntre(n,m-1); //preguntar por que esto no funciona.  16:30 ME SALIO DE RE OJETE.
		 	
	 }
	 
	public static boolean esPrimo(int n) {
		    for(int i= 2;  i<n  ;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}
	 
	 
	public static int cantidadPrimosEntre(int n, int m) {
		 if (n==m)
			 return 0;
		 else {
			 if (esPrimo(m)) {
				 return 1+cantidadPrimosEntre(n,m-1);
			 }
			 return cantidadPrimosEntre(n,m-1);
		 }
		 }
//--------RECURSION CON STRING------------------------------
	
	public static String resto(String s) {
		String n="";
		for (int i=1; i<s.length();i++) {
			n=n+s.charAt(i);
			
		}return n;
	}
	
	public static int longitud(String s) {
		if(s.equals(""))
			return 0;
		return 1+longitud(resto(s));
			
	}
	public static void imprimirEspaciado(String s) {
		if (s.length()<=0)
			System.out.println(s);
		else {
			System.out.println(s.charAt(0)+"");
			imprimirEspaciado(resto(s));
		}	
			}

	 public static String reverso(String s) {
		 if(s.length() == 0)
			 return "";
		 
		 return reverso(resto(s))+s.charAt(0);
			 
	 }
	 
}
	
	
	
	
	
