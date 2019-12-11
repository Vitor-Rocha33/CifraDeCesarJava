import java.util.Scanner;

public class Main {
	
	public static void main (String [] args ) {
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Oque deseja fazer? Selecione uma opção");
		 System.out.println("1 - Encriptar");
		 System.out.println("2 - Decriptar");
		 int opc = input.nextInt();
		 	 
		 switch (opc) {
		 case 1 :
			System.out.println("Digite um valor para encriptar: ");
			String value = input.nextLine();
		 
			System.out.println("Digite um deslocamento: ");
			int desl = input.nextInt();
		 
			CifraDeCesar cf = new CifraDeCesar(value, desl);
		 
			System.out.println("O seu valor encriptado é " + cf.encrypt());
			
		 case 2 :
			 
			 System.out.println("Digite um valor para decriptar: ");
			 String value2 = input.nextLine();
			 
			 System.out.println("");
		 }
		 
		
		
		
		input.close();
	}
}
