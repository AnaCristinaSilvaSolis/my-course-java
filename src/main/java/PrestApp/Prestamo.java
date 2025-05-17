package PrestApp;

import java.util.Date;

public class Prestamo {
    private int idPrestamo;
    private Date fechaInicioPrestamo;
    private Date fechaFinPrestamo;
    private Date fechaProximoPago;
    private int cuotasAbonadas;
    private int cuotasTotales;
    TipoCuota tipoCuota;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Date fechaInicioPrestamo, Date fechaFinPrestamo, Date fechaProximoPago, int cuotasAbonadas, int cuotasTotales, TipoCuota tipoCuota) {
        this.idPrestamo = idPrestamo;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaFinPrestamo = fechaFinPrestamo;
        this.fechaProximoPago = fechaProximoPago;
        this.cuotasAbonadas = cuotasAbonadas;
        this.cuotasTotales = cuotasTotales;
        this.tipoCuota = tipoCuota;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(Date fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public Date getFechaFinPrestamo() {
        return fechaFinPrestamo;
    }

    public void setFechaFinPrestamo(Date fechaFinPrestamo) {
        this.fechaFinPrestamo = fechaFinPrestamo;
    }

    public Date getFechaProximoPago() {
        return fechaProximoPago;
    }

    public void setFechaProximoPago(Date fechaProximoPago) {
        this.fechaProximoPago = fechaProximoPago;
    }

    public int getCuotasAbonadas() {
        return cuotasAbonadas;
    }

    public void setCuotasAbonadas(int cuotasAbonadas) {
        this.cuotasAbonadas = cuotasAbonadas;
    }

    public int getCuotasTotales() {
        return cuotasTotales;
    }

    public void setCuotasTotales(int cuotasTotales) {
        this.cuotasTotales = cuotasTotales;
    }

    public TipoCuota getTipoCuota() {
        return tipoCuota;
    }

    public void setTipoCuota(TipoCuota tipoCuota) {
        this.tipoCuota = tipoCuota;
    }
}
