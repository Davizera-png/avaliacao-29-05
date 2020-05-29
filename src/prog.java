import java.util.Scanner;
import java.util.Locale;
public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome, recebeumais;
		int hrstrabalhadas, totalhrs;
		float valorhora, custototal, custo;
		char sn;
		int opcao;
		custototal = 0;
		totalhrs = 0;
		recebeumais = null;
		nome = null;
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
			System.out.print("Digitar outro (S/N)? ");
			sn = sc.next().charAt(0);
			custo = valorhora * hrstrabalhadas;
			totalhrs = totalhrs + hrstrabalhadas;
			custototal = custototal + custo;
			
			if (custo > totalhrs - custo) {
				recebeumais = recebeumais + nome;
			}
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
			if (opcao == 1) {
				System.out.println();
				System.out.println("Total de horas = "+ totalhrs);
				System.out.println();
			} else if (opcao == 2) {
				System.out.println();
				System.out.printf("Custo total = R$ %.2f", custototal);
				System.out.println();
			} else {
				System.out.printf("Nome da pessoa que ganhou mais: ", recebeumais);
				
			}
		} while(opcao != 4);
		//fim do menu
		//fim tratativas 1 e 2
		//FINALIZAR O PROGRAMA
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}
