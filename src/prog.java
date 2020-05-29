import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome;
		int hrstrabalhadas;
		float valorhora;
		char sn;
		int opcao;
		do {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			hrstrabalhadas = sc.nextInt();
			while (hrstrabalhadas < 0) {
				System.out.print("Horas trabalhadas: ");
				hrstrabalhadas = sc.nextInt();
			}
			System.out.print("Valor por hora: ");
			valorhora = sc.nextFloat();
			while (valorhora < 0) {
				System.out.print("Valor por hora: ");
				valorhora = sc.nextFloat();
			}
			System.out.print("Digitar outro (S/N)?");
			sn = sc.next().charAt(0);
			
		} while(sn == 'S');
		//fim leitura
		// menu
		System.out.println();
		do {
			System.out.println("MENU");
			System.out.println("1- Total de horas trabalhadas");
			System.out.println("2- Custo Total");
			System.out.println("3- Nome da pessoa que ganhou mais");
			System.out.println("4- Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
		} while(opcao != 4);
		
	}

}
