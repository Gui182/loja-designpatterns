package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
    
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        if (deveAplicar(orcamento)){
            return calcular(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal calcular(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);

    
}
