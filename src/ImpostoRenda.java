
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 2500.0;
		
		if(salario < 2500.0) {
			System.out.println("A sua al�quota � de 15%");
			System.out.println("Voc� pode deduzir at� 350");
		}else if(salario < 3800.0){
			System.out.println("Sua al�quota � de 18%");
			System.out.println("Voc� pode deduzir at� 500");
		}else {
			System.out.println("Sua al�quota � de 23%");
			System.out.println("Voc� pode deduzir at� 630");			
		}

	}

}
