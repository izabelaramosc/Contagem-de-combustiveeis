import java.util.Scanner;

public class contagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		    int tipo = sc.nextInt();

		    while (tipo != 4) {

		    	if (tipo == 1) {
		    		alcool += 1;
		    	}
		    	 else if (tipo == 2){
		    	     gasolina += 1;
		    	 }
		    	     else if (tipo == 3) {
		    	      diesel += 1;
		    	     }
		    	tipo = sc.nextInt();
		    }
		    	
		    	
		    	System.out.println("muito obrigada");
		    	System.out.println("alcool " + alcool);
		    	System.out.println("gasolina " + gasolina);
		    	System.out.println("diesel " + diesel);


		 sc.close();
		 

	}

}
