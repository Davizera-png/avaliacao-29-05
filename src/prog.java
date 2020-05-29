import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome;
		int hrstrabalhadas;
		float valorhora;
		char sn;
		do {
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.println("Horas trabalhadas: ");
			hrstrabalhadas = sc.nextInt();
			while (hrstrabalhadas < 0) {
				System.out.println("Horas trabalhadas: ");
				hrstrabalhadas = sc.nextInt();
			}
			System.out.println("Valor por hora: ");
			valorhora = sc.nextFloat();
			while (valorhora < 0) {
				System.out.println("Valor por hora: ");
				valorhora = sc.nextFloat();
			}
			System.out.println("Digitar outro (S/N)?");
			sn = sc.next().charAt(0);
			
		} while(sn == 'S');
		
	}

}
