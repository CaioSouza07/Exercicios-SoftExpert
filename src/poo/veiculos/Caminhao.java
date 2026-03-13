package poo.veiculos;

public class Caminhao extends Veiculo{

    public Caminhao(){
        super();
    }

    public Caminhao(String marca, String modelo, String cor, String ano, String tipoCombustivel){
        super(marca, modelo, cor, ano, tipoCombustivel);
    }

    @Override
    public double consumoCombustivel(double kmPercorrida) {
        return kmPercorrida / 4.2;
    }
}
