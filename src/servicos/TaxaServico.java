package servicos;

import java.security.InvalidParameterException;

public interface TaxaServico {

	double getTaxaJuros();
	
	default double pagamento(double quantia, int meses) {
		if(meses < 1)
		 throw new InvalidParameterException("Quantidade de meses não pode ser menor que zero");
		return quantia * Math.pow(1.0 + getTaxaJuros() / 100, meses);
	}
}
