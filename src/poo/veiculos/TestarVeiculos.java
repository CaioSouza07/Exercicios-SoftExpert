package poo.veiculos;

public class TestarVeiculos {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", "Fiesta", "Cinza", "2006", "Gasolina");
        Moto moto = new Moto("Honda", "Bizz", "Vermelha", "2010", "Gasolina");
        Caminhao caminhao = new Caminhao("Volvo", "xyz", "Branco", "2020", "Diesel");

        System.out.println(caminhao.consumoCombustivel(100));
        System.out.println(moto.consumoCombustivel(100));
        System.out.println(carro.consumoCombustivel(100));

    }
}
