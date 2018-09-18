package proyecto;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.JTextField;

public class usuario {
	//funciones del codigo completo 
	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static String [] telefono = new String[30];
	private static String [] cedula = new String[30];
	 private static String [] nombre = new String[30];
	 private static String [] salas = new String[30];
	 private static String [] nombre1 = new String[30];
	 private static String []nombre_pelicula = new String[30];
	 private static String [] peliculas = new String[30];
	public usuario() {
		nombre[0] = "";
		nombre1[0] = "";
		nombre_pelicula[0]="";
		telefono[0] = "";
		cedula[0] = "";
		salas[0]="";
		peliculas[0]=""; 
		n=1;
		usuario.menu_principal();
	}
	//menu 
	public static void menu_principal(){
		
	teclado = new Scanner(System.in);
	System.out.println("1.Crear usuario ");
	System.out.println("2.Listar usuario ");
	System.out.println("3.Editar usuario ");
	System.out.println("4.Eliminar usuario ");
	System.out.println("5.Crear salas ");
	System.out.println("6.Listar salas ");
	System.out.println("7.Editar salas ");
	System.out.println("8.Eliminar salas ");
	System.out.println("9.Crear peliculas ");
	System.out.println("10.Listar peliculas ");
	System.out.println("11.Editar peliculas ");
	System.out.println("12.Eliminar peliculas ");
	System.out.println("Opcion: ");
	opcion = teclado.nextInt();
	//funciones
	switch(opcion) {
	case 1:
		
		crear_usuario();
		break;
	case 2:
		listar_usuarios();
		break;
	case 3:
		editar_usuario();
		break;
	case 4:
		eliminar_usuario();
		break;
	case 5:
		crear_salas();
		break;
	case 6:
		listar_salas();
		break;
	case 7:
		editar_salas();
		break;
	case 8:
		eliminar_salas();
		break;
	case 9:
		crear_peliculas();
		break;
	case 10:
		listar_peliculas();
		break;
	case 11:
		editar_peliculas();
		break;
	case 12:
		eliminar_peliculas();
		break;
		default: System.out.println("Suministre una opcion correcta, vuelve a intentarlo");
	}
	usuario.menu_principal();
	}

	public static void crear_usuario() {
		teclado = new Scanner(System.in);
		System.out.println("SUMINISTRE LA CANTIDAD DE CLIENTES A REGISTRAR: ");
		num = teclado.nextInt();
		System.out.println("\n");
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println(n+" Suministre Cedula: ");
			cedula[n] = teclado.nextLine();
			System.out.println(n+" Suministre Nombre: ");
			nombre[n] = teclado.nextLine();
			System.out.println(n+"Suministre Telefono: ");
			telefono[n] = teclado.nextLine();
			System.out.println("\n");
		}
		
	}
	public static void listar_usuarios() {
		for(n=cont;n<cont+num;n++){
			teclado.nextLine();
			System.out.println("cliente numero:  "+(n));
			System.out.println("Cedula: "+cedula[n]);
			System.out.println("Nombre: "+nombre[n]);
			System.out.println("Telefono: "+telefono[n]);
			System.out.println("\n");
		}
	}
	
	

	public static void editar_usuario() {
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println("cliente numero:  "+(n));
			System.out.println("Cedula: "+cedula[n]);
			System.out.println("Nombre: "+nombre[n]);
			System.out.println("Telefono: "+telefono[n]);
		
		}	
		teclado.nextLine();
		System.out.println("Suministre el id del cliente a modificar ");
		n = teclado.nextInt();
	
			teclado.nextLine();
			System.out.println("Usuario numero:  "+(n));
			
			System.out.println("Suministre Cedula: ");
			cedula[n] = teclado.nextLine();
			System.out.println("Suministre Nombre: ");
			nombre[n] = teclado.nextLine();
			System.out.println("Suministre Telefono: ");
			telefono[n] = teclado.nextLine();
			System.out.println("\n");
		menu_principal();
	}
public static void eliminar_usuario() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usuario usuario=new usuario();

	}
	public static void crear_salas() {
		teclado = new Scanner(System.in);
		System.out.println("SUMINISTRE LA CANTIDAD DE SALAS A REGISTRAR: ");
		num = teclado.nextInt();
		System.out.println("\n");
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println(n+" Suministre sala: ");
			salas[n] = teclado.nextLine();
			System.out.println(n+" Suministre Nombre de sala: ");
			nombre1[n] = teclado.nextLine();
			System.out.println("\n");
		}
		
	}
	public static void listar_salas() {
		for(n=cont;n<cont+num;n++){
			teclado.nextLine();
			System.out.println("numero de sala:  "+(n));
			System.out.println("Nombre1: "+nombre1[n]);
			System.out.println("\n");
		}
	}
	public static void editar_salas() {
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println("cliente numero:  "+(n));
        	System.out.println("Nombre1: "+nombre1[n]);
			
		
		}	
		teclado.nextLine();
		System.out.println("Suministre el id del cliente a modificar ");
		n = teclado.nextInt();
	
			teclado.nextLine();
			System.out.println("sala numero:  "+(n));
			
			System.out.println("Suministre salas: ");
			salas[n] = teclado.nextLine();
			System.out.println("Suministre Nombre de salas: ");
			nombre1[n] = teclado.nextLine();
			
			System.out.println("\n");
		menu_principal();
	}
public static void eliminar_salas() {
		
		
	}
public static void crear_peliculas() {
	teclado = new Scanner(System.in);
	System.out.println("SUMINISTRE LA CANTIDAD DE PELICULAS A REGISTRAR: ");
	num = teclado.nextInt();
	System.out.println("\n");
	for(n=1;n<=num;n++){
		teclado.nextLine();
		System.out.println(n+" Suministre peliculas: ");
		peliculas[n] = teclado.nextLine();
		System.out.println(n+" Suministre Nombre de pelicula: ");
		nombre_pelicula[n] = teclado.nextLine();
		System.out.println("\n");
	}
	
 }
public static void listar_peliculas() {
	for(n=cont;n<cont+num;n++){
		teclado.nextLine();
		System.out.println("numero de peliculas:  "+(n));
		System.out.println("Nombre: "+peliculas[n]);
		System.out.println("nombre de pelicula:  "+(n));
		System.out.println("Nombre: "+nombre_pelicula[n]);
		System.out.println("\n");
	}
 }

public static void editar_peliculas() {
	for(n=1;n<=num;n++){
		teclado.nextLine();
		System.out.println("cliente numero:  "+(n));
    	System.out.println("Nombre1: "+nombre1[n]);
		
	
	}	
	teclado.nextLine();
	System.out.println("Suministre el id de la pelicula a modificar ");
	n = teclado.nextInt();

		teclado.nextLine();
		System.out.println(" pelicula numero:  "+(n));
		
		System.out.println("Suministre peliculas: ");
		peliculas[n] = teclado.nextLine();
		System.out.println("Suministre Nombre de pelicula: ");
		nombre_pelicula[n] = teclado.nextLine();
		
		System.out.println("\n");
	menu_principal();
}
public static void eliminar_peliculas() {
	
	
}
}

