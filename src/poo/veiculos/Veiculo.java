package poo.veiculos;

public class Veiculo {

    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private String tipoCombustivel;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String cor, String ano, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double consumoCombustivel(double kmPercorrida){
        return kmPercorrida / 10;
    }

}
