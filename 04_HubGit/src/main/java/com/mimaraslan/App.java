package com.mimaraslan;

public class App 
{

    public static void main( String[] args )
    {
    	
    	Islem islem = new Islem();
    	islem.goster();
    	
    	selamla();
    }
 
	private static void selamla() {
		 System.out.println( "----------------" );		
		 System.out.println( "Selam Github!" );		
		 System.out.println( "----------------" );		
	}
	
}
