package co.edu.unisabana.siga.banco.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HistorialDTO {

    private int codigoTransaccion;
    private int numeroCuenta;
    private String tipoTransaccion;
    private BigDecimal saldo;
    private LocalDate fechaCreacion;

    public int getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(int codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
