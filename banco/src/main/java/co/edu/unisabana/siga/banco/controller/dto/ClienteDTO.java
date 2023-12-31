package co.edu.unisabana.siga.banco.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class ClienteDTO {
    private String nombre;
    private int codigo;
    private String apellido;
    private int saldo;
    private boolean cuentaAhorros;
    private boolean cuentaCorriente;
    private boolean tarjetaCredito;
    private String email;
    private String hashedPassword;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String token;
}
