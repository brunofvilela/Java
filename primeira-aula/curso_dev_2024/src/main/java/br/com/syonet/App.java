package br.com.syonet;

public class App{

public static void main (String[] args)
{
    Veiculo v1 = new Veiculo();
    v1.velocidade = 100;

    Veiculo v2 = new Veiculo();
    v2.velocidade = 100;

    Utils.print(v1);
    Utils.print(v2);

    Utils.print(v1.equals(100));
    
}
}