package com.br.designpatterns.chain.of.responsability;

import java.math.BigDecimal;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public final BigDecimal calcular(Orcamento orcamento){
		if(deveAplicar(orcamento)){
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
}
