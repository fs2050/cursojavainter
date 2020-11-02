import java.util.Scanner;


public class entradaDados{
	
	public static void main(String args[]){
	
		Scanner entrada = new Scanner(System.in);
		/* // Capturar numeros inteiros
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		System.out.println(ano);	 */	
		
		// CApturar números Reais
		/* System.out.print("Digite um valor: ");
		float valor = entrada.nextFloat();
		System.out.println(valor); */
		
		//Capturar String
		System.out.print("Digite seu unome: ");
		String nome = entrada.nextLine();
		System.out.println(nome);
		
		
	}
	
}