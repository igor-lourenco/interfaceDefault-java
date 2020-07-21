package servicos;

public class ServicoJurosBrasil implements TaxaServico {
	
	private double taxaJuros;

	public ServicoJurosBrasil(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
