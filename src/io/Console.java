package io;

import java.io.*;

public class Console 
{
	public String leggiString()
	{
		String linea = "";
		try 
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);

			linea = input.readLine();
	     }
        	
		catch (Exception e)
		{
			System.out.println("errore");
			System.exit(0) ;
		}
		return linea;

	}

    public int leggiInt()
	{
		String linea = "";
        int numero = 0;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			linea = input.readLine();
			numero = Integer.parseInt (linea);
     	}
     	
        catch (Exception e)
       	{
       		System.out.println("errore: inserire un numero intero");
	       	System.exit(0) ;
       	}
        
		return numero;
	}
    
	public char leggiChar()
	{
		String linea = "";
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			linea = input.readLine();

			if(linea.length() !=1)			
				throw new Exception();
	 	}
		catch (Exception e)
	   	{
	   		System.out.println("errore: inserire un solo carattere");
	   		System.exit(0) ;
	   	}
		return linea.charAt(0);	
	}
	
    public double leggiDouble()
	{
		String linea = "";
        double numero=0;
		try
		{
			InputStreamReader stream = new InputStreamReader(System.in);
			BufferedReader input= new BufferedReader(stream);
			
			linea = input.readLine();
	        numero = Double.parseDouble (linea);
	    }
   		catch (Exception e)
   		{
   			System.out.println("errore: inserire un numero decimale");
   			System.exit(0);
   		}
		return numero;
	}
}