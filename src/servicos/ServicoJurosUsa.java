package servicos;

public class ServicoJurosUsa implements TaxaServico{
	
	private double taxaJuros;

	public ServicoJurosUsa(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

	
}
