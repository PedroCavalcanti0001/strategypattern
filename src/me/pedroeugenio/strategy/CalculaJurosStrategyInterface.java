package me.pedroeugenio.strategy;

import me.pedroeugenio.strategy.models.Pedido;

public interface CalculaJurosStrategyInterface {

    public double getTaxaDeJuros(Pedido pedido);
}
