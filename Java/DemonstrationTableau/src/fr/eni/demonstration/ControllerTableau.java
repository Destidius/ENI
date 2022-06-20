package fr.eni.demonstration;

import java.util.Arrays;

public class ControllerTableau {

	public static void main(String[] args) 
	{
		String[] tableau = new String[3];
		tableau[0] = "pomme";
		String fruit = "kiwi";
		// je vais chercher un emplacement null
		for (int i=0;i< tableau.length ; i++) {
			if (tableau[i]== null) {
				tableau[i] =fruit;
				break;
			}
		}
		//pomme , kiwi . null
		for( String f : tableau) {
			System.out.println(f);
		}
		// pour debuger
		System.out.println(Arrays.toString(tableau));
		
		// unboxing enlever 1 element du tab -> dans une variable
		String fruit2 = tableau[1];
		String mot = "Bonjour"; // instancier une variable
		

	}

}
