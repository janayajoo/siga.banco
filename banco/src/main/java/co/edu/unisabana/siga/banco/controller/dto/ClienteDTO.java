package co.edu.unisabana.siga.banco.controller.dto;

import java.time.LocalDate;

public class ClienteDTO {
    private String nombre;
    private int codigo;
    private String apellido;
    private int saldo;
    private boolean cuentaAhorros;
    private boolean cuentaCorriente;
    private boolean tarjetaCredito;
    private String email;
    private String password;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return password;
    }

    public void setHashedPassword(String hashedPassword) {
        this.password = hashedPassword;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

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
