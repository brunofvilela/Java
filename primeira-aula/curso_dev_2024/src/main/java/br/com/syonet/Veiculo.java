package br.com.syonet;

public class Veiculo {
    long velocidade;

    @Override
    public String toString(){
        return "Veículo [velocidade=" + velocidade + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Veiculo other = (Veiculo) obj;
        if (velocidade != other.velocidade)
            return false;
        return true;
    }

    
}
