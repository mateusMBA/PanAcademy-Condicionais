import java.util.Scanner;

public class TrianguloClassificacao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro �ngulo");
		double angulo1 = sc.nextDouble();
		System.out.println("Digite o segundo �ngulo");
		double angulo2 = sc.nextDouble();
		System.out.println("Digite o terceiro �ngulo");
		double angulo3 = sc.nextDouble();
		
		if((angulo1 + angulo2 + angulo3) != 180.0) {
			System.out.println("Isso n�o � um tri�ngulo");
		}else {
			if(angulo1 == 90.0 || angulo2 == 90.0 || angulo3 == 90) {
				System.out.println("O tri�ngulo � um tri�ngulo ret�ngulo");
			}else if(angulo1 > 90.0 || angulo2 > 90.0 || angulo3 > 90) {
				System.out.println("O tri�ngulo � um obtus�ngulo");
			}else {
				System.out.println("O tri�ngulo � um acut�ngulo");
			}
		}
		sc.close();
	}

}
