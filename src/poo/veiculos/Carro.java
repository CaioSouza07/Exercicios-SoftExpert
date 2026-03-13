package poo.veiculos;

public class Carro extends Veiculo{

    public Carro(){
        super();
    }

    public Carro(String marca, String modelo, String cor, String ano, String tipoCombustivel){
        super(marca, modelo, cor, ano, tipoCombustivel);
    }

    @Override
    public double consumoCombustivel(double kmPercorrida) {
        return kmPercorrida / 12;
    }
}
