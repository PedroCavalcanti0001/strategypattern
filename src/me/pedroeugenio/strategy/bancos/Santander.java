package me.pedroeugenio.strategy.bancos;

import me.pedroeugenio.strategy.CalculaJurosStrategyInterface;
import me.pedroeugenio.strategy.models.Pedido;

public class Santander implements CalculaJurosStrategyInterface {
    @Override
    public double getTaxaDeJuros(Pedido pedido) {
        return 5;
    }
}
