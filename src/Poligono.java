import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero de lados do pol�gono");
		int numeroLados = sc.nextInt();
		
		if(numeroLados > 5) {
			System.out.println("POL�GONO N�O IDENTIFICADO.");
		}else if(numeroLados >= 3) {
			System.out.println("POL�GONO IDENTIFICADO.");
		}else {
			System.out.println("N�O � UM POL�GONO.");
		}
		sc.close();

	}

}
