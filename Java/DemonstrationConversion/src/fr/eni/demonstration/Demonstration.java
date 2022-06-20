package fr.eni.demonstration;

public class Demonstration {

	public static void main(String[] args) 
	{
		 byte unByte = 100;
		 short unShort = unByte;
		 
		 // ----------------------------
		 
		 double unDouble = 10.25;
		 float unFloat = (float)unDouble;
		 
		 //------------------------------
		 
		 float unFloat2 = 10.2F;
		 
		 //=----------------------------
		 
		 String uneString = "10";
		 double tmp = Double.parseDouble(uneString);
		 Integer.parseInt(uneString);
		 Float.parseFloat(uneString);
		
	}

}
