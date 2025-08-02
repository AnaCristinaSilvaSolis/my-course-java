package Temario.POO.Herencia.Bank;

public class Cuenta {
    private int NroCuenta;
    protected double saldo;

    public void depositar(double cantidad){
        saldo += cantidad;
    }

    public void retirar(double cantidad){
        saldo -= cantidad;
    }

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, double saldo) {
        NroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        NroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "NroCuenta=" + NroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
