package co.edu.unisabana.siga.banco.bd;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Cuenta {

    @Id
    @GeneratedValue
    @Column
    private int codigoCuenta;
    @Column
    private int idUsuario;
    @Column
    private int numeroCuenta;
    @Column
    private String nombreCuenta;
    @Column
    private String tipoCuenta;
    @Column
    private BigDecimal saldo;
    @Column
    private LocalDate fechaCreacion;
    @Column
    private LocalDate fechaModificacion;

    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
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

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}