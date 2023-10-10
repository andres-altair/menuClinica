package edu.MenuClinica.servicios;

import java.util.Scanner;
/**
 * implemetaciion de la interfaz menu
 * @author amd-060923
 */
/**
 * interfaz que enumera los metodos de la fincionalidadd del menu
 * 
 * @author amd-031023
 */

public interface MenuInterfaz {
	/**
	 * mostrar el menu al usuario y que recoja la oppcion
	 * @author amd-031023
	 * @return (int) el numero de la accion que selecciona
	 */
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);

}
