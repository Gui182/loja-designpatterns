package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoOrcamentoComMaisDeCincoItems extends Desconto {

    public DescontoOrcamentoComMaisDeCincoItems(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {     

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItems() > 5;
    }

}