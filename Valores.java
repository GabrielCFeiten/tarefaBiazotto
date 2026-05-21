package br.edu.refactoring.estacionamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Valores {

    private BigDecimal valor;

    public Valores(BigDecimal valor) {
        this.valor = valor;
    }

    public String formatarEmReais() {
        return "R$ " + valor.setScale(2, RoundingMode.HALF_UP)
                        .toString()
                        .replace(".", ",");
    }

    public boolean isAltoValor() {
        return valor.compareTo(
                new BigDecimal("50.00")
        ) >= 0;
    }

    public BigDecimal getValorOriginal() {
        return valor;
    }

}
