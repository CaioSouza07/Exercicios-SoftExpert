package poo.classe_interna;

public class Computer {

    private String marca;
    private double velocidade;
    private String modelo;

    public Computer(String marca, double velocidade, String modelo) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.modelo = modelo;
    }

    public void visualizar(){
        Processor processor = new Processor();
        processor.displayDetails();
    }

    class Processor{

        public Processor() {
        }

        public void displayDetails(){
            System.out.println(marca + "  - " + velocidade + " - " + modelo);
        }
    }

}
