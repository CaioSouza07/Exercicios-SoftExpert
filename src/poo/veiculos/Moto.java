package poo.veiculos;

public class Moto extends Veiculo{

    public Moto(){
        super();
    }

    public Moto(String marca, String modelo, String cor, String ano, String tipoCombustivel){
        super(marca, modelo, cor, ano, tipoCombustivel);
    }

    @Override
    public double consumoCombustivel(double kmPercorrida) {
        return kmPercorrida / 30.1;
    }
}
