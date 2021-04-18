package com.br.designpatterns.chain.of.responsability;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));

		return desconto.calcular(orcamento);
	}
}
