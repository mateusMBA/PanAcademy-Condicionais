import java.util.Scanner;

public class CompraMa�as {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite o n�mero de ma��s compradas!");
		int numeroMa�as = sc.nextInt();
		
		if(numeroMa�as < 12 ) {
			System.out.println("Foram compradas " + numeroMa�as + " ma�as, o valor total da compra foi R$" + numeroMa�as * 0.3);
		}else {
			System.out.println("Foram compradas " + numeroMa�as + " ma�as, o valor total da compra foi R$" + numeroMa�as * 0.25);
		}
		sc.close();
	}
}
