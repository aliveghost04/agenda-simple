package edu.itla.agenda;
import java.util.Scanner;

import edu.itla.agenda.mng.ManejadorContactos;

public class Menu {
	
	boolean continuar = true;
	int opcion = 0;
	
	public Menu() {
		
		Scanner lector = new Scanner(System.in);
		ManejadorContactos mngP = new ManejadorContactos();
		
		while (continuar == true) {
			System.out.println("Agenda de Erick \n");
			System.out.println("1. Listar Contactos");
			System.out.println("2. Crear Contactos");
			System.out.println("3. Eliminar Contactos");
			System.out.println("4. Salir");
			System.out.print("Elija una opcion ==> ");
			
			opcion = lector.nextInt();
			
//			try {
//				
//			} catch (Exceptio) {}
			
			switch (opcion) {
			
			default:
				System.out.println("Hey man esa opcion es invalida, klk tu dice... elige otra");
				break;
			case (1):
				mngP.listarContacto();
				break;
			case (2):
				mngP.crearContacto();
				break;
			case (3):
				mngP.eliminarContacto();
				break;
			case (4):
				System.out.println("Hey man hablamos ahorita !!! ;)");
				continuar = false;
				break;
			}
		}
	}
}
