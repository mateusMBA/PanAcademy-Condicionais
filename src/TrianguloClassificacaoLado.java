import java.util.Scanner;

public class TrianguloClassificacaoLado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado");
		double lado1 = sc.nextDouble();
		System.out.println("Digite o segundo lado");
		double lado2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado");
		double lado3 = sc.nextDouble();
		
		if(!(lado1 > Math.abs(lado2 - lado3) && lado1 < Math.abs(lado2 + lado3))) {
			System.out.println("Isso n�o � um tri�ngulo.");
		}else {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equil�tero");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Is�sceles");
			}else {
				System.out.println("Tri�ngulo Escaleno");
			}
		}
		sc.close();
	}

}
