import java.util.Scanner;

public class BurcBulanProgram {

	public static void main(String[] args) {

		int ay,gun;
		
	    Scanner input = new Scanner(System.in);

	    System.out.print("Doğduğunuz ayı sayı olarak giriniz : ");
	    ay = input.nextInt();
	    
  
	    System.out.print("Doğduğunuz günü giriniz : ");
	    gun = input.nextInt();
	    
	    if (ay == 1) 
	    	{
	    	if (gun >= 1 && gun <= 21) System.out.println("Oğlak burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz.");
	    	else System.out.println("Geçerli bir gün giriniz.");	    	
	    	}
	    
	    if (ay == 2) 
    	{
	    	if (gun >= 19 && gun <= 31) System.out.println("Kova burcusunuz.");
	    	else if (gun>=20 && gun<=31) System.out.println("Balık burcusunuz.");  
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	
	    if (ay == 3) 
    	{
	    	if (gun >= 20 && gun <= 21) System.out.println("Balık burcusunuz.");
	    	else if (gun>=21 && gun<=31) System.out.println("Koç burcusunuz.");  	
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 4) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 5) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 6) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz.");
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 7) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz.");  
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 8) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
	    	
	    if (ay == 9) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 10) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 11) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	    
	    if (ay == 12) 
    	{
	    	if (gun >= 19 && gun <= 21) System.out.println("Oğlan burcusunuz.");
	    	else if (gun>=22 && gun<=31) System.out.println("Kova burcusunuz."); 
	    	else System.out.println("Geçerli bir gün giriniz.");
    	}
	}

}
}
