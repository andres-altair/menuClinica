package edu.MenuClinica.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		int opcionSeleccionada;

		System.out.println("*************************************");
		System.out.println("0. cerrar la aplicacion");
		System.out.println("1. registro ddel paciente");
		System.out.println("2. ingreso del paciente");
		System.out.println("3. alta del paciente");
		System.out.println("4. resumen de ingreso y alta");
		System.out.println("5. historial del paciente");
		System.out.println("seleccione un aopcion:");
		System.out.println("*************************************");
		opcionSeleccionada = comunicacionTecladoM.nextInt();
		return opcionSeleccionada;
		

	}

}
