package me.pedroeugenio.strategy.services;

import me.pedroeugenio.strategy.CalculaJurosStrategyInterface;
import me.pedroeugenio.strategy.models.Pedido;

public class CalculaDeJurosService {
    private CalculaJurosStrategyInterface calculadorDeJuros;

    public CalculaDeJurosService(CalculaJurosStrategyInterface calculadorDeJuros) {
        this.calculadorDeJuros = calculadorDeJuros;
    }

    public double calculaJuros(Pedido pedido) {
        return calculadorDeJuros.getTaxaDeJuros(pedido) * 1.5;
    }
}
