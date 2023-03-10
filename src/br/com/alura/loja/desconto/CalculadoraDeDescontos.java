package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    //patter chain of responsability
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoComMaisDeCincoItems(
            new DescontoOrcamentoComPrecoMaiorQueQuinhentos(
                new SemDesconto()
            )
        );

        return desconto.calcular(orcamento);
    }
}
