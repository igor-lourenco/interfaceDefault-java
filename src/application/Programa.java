package application;

import java.util.Locale;
import java.util.Scanner;

import servicos.ServicoJurosBrasil;
import servicos.TaxaServico;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Quantidade de meses: ");
		int meses = sc.nextInt();
		
		TaxaServico is = new ServicoJurosBrasil(2.0);
		double pagamento = is.pagamento(quantia, meses);
		
		System.out.println("Pagamento após " + meses + " meses: ");
		System.out.println(String.format("%.2f", pagamento));
		
				sc.close();

	}
}
