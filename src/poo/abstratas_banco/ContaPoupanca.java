package poo.abstratas_banco;

public class ContaPoupanca extends ContaBanco{


    private String nomeTitular;
    private double saldo;

    public ContaPoupanca(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if(saldo < valor){
            return false;
        }else{
            saldo -= valor;
            return true;
        }
    }
}
