package fr.eni.demonstration;

public class Demonstration {

	enum Couleurs { VERT ,JAUNE, ORANGE, ROUGE};
	
	public static void main(String[] args) 
	{
		System.out.println(Couleurs.ORANGE);
		
		Couleurs maVariable = Couleurs.ROUGE;
		
		System.out.println(maVariable);
		
		if(maVariable == Couleurs.ROUGE) 
		{
			System.out.println("Vive le orange !");
		}
		
		for (Couleurs tmp : Couleurs.values())
		{
			System.out.println(tmp.name() + " " + tmp.ordinal());
		}
		
	}

}
