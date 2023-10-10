package edu.MenuClinica.controladores;

import java.util.Scanner;

import edu.MenuClinica.servicios.MenuImplementacion;
import edu.MenuClinica.servicios.MenuInterfaz;

/**
 * Clase por la que se accede a la apalicacion
 * 290923-amd
 */

public class Inicio {
	
	int enteroTodo;

	/**
	 * metodo pirncipal de nuestra aplicaion 
	 * define el procedimiento, es de donde toda accion sale
	 * y a donde llega cuando acaba
	 * 290923-amd
	 * @author amd
	 * @param args
	 */
	public static void main(String[] args) {
		int seleccionUsuario;
		boolean cerraMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
		while(!cerraMenu) {
			seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTeclado);
					
			switch(seleccionUsuario){
			case 0:
				System.out.println("[Info ] - se ejecuta caso 0");
				cerraMenu = true;
				break;
			case 1:
				System.out.println("[Info ] -se ejecuta caso 1");
				break;
			case 2:
				System.out.println("[Info ] -se ejecuta caso 2");
				break;
			case 3:
				System.out.println("[Info ] -se ejecuta caso 3");
				break;
			case 4:
				System.out.println("[Info ] -se ejecuta caso 4");
				break;
			case 5:
				System.out.println("[Info ] -se ejecuta caso 5");
				break;
				default:
					System.out.println("[Info ] -se ejecuta caso 0");
					break;
					}
		}

	}

}
