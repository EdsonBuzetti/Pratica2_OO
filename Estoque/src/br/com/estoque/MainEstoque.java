package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setNome("Borracha");
        e.setQtdAtual(18);
        e.setQtdMinima(5);
        System.out.println(e.mostra());

        Estoque e2 = new Estoque(1,"Borracha",20,10);
        e2.darBaixa(10);
        e2.darBaixa(1000);
        System.out.println(e2.precisaRepor());
    }
}
