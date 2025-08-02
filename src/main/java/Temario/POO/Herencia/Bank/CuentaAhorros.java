package Temario.POO.Herencia.Bank;

public class CuentaAhorros extends Cuenta{
    private double interes = 0.10;


    public CuentaAhorros(){
    }

    public CuentaAhorros(int nroCuenta, double saldo, double interes) {
        super(nroCuenta, saldo);
        this.interes = interes;
    }

    public void aplicarInteres(){
        saldo = (saldo - (saldo * interes));
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }


}
