package co.edu.unisabana.siga.banco.bd;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue
    @Column
    private int codigo;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int saldo;
    @Column
    private boolean cuentaAhorros;
    @Column
    private boolean cuentaCorriente;
    @Column
    private boolean tarjetaCredito;
    @Column
    private LocalDate fechaCreacion;
    @Column
    private LocalDate fechaModificacion;
    @Column
    private String token;
    @Column
    private String email;
    @Column
    private String hashedPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashed_password() {
        return hashedPassword;
    }

    public void setHashed_password(String hashed_password) {
        this.hashedPassword = hashed_password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isCuentaAhorros() {
        return cuentaAhorros;
    }

    public void setCuentaAhorros(boolean cuentaAhorros) {
        this.cuentaAhorros = cuentaAhorros;
    }

    public boolean isCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(boolean cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public boolean isTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(boolean tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
}