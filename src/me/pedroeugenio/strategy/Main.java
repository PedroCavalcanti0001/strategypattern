package me.pedroeugenio.strategy;

import me.pedroeugenio.strategy.bancos.Itau;
import me.pedroeugenio.strategy.bancos.Santander;
import me.pedroeugenio.strategy.models.Pedido;
import me.pedroeugenio.strategy.services.CalculaDeJurosService;

public class Main {

    public static void main(String[] args) {
        Itau itau = new Itau();
        Santander santander = new Santander();
        CalculaDeJurosService calculaDeJurosService = new CalculaDeJurosService(santander);
        Pedido pedido = new Pedido(10.3);
        System.out.println(calculaDeJurosService.calculaJuros(pedido));
    }
}
