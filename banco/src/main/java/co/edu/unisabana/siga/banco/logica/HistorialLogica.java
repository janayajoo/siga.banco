package co.edu.unisabana.siga.banco.logica;

import co.edu.unisabana.siga.banco.bd.Cuenta;
import co.edu.unisabana.siga.banco.bd.CuentaRepository;
import co.edu.unisabana.siga.banco.bd.HistorialTransacciones;
import co.edu.unisabana.siga.banco.bd.HistorialTransaccionesRepository;
import co.edu.unisabana.siga.banco.controller.HistorialController;
import co.edu.unisabana.siga.banco.controller.dto.CuentaDTO;
import co.edu.unisabana.siga.banco.controller.dto.HistorialTransaccionDTO;
import co.edu.unisabana.siga.banco.helper.GeneradorCuenta;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HistorialLogica {
    private HistorialTransaccionesRepository historialTransaccionesRepository;

    public HistorialLogica(HistorialTransaccionesRepository historialTransaccionesRepository) {
        this.historialTransaccionesRepository = historialTransaccionesRepository;
    }

    public void guardarHistorial(HistorialTransaccionDTO historialTransaccionDTO) {
        HistorialTransacciones historial = new HistorialTransacciones();
        historial.setIdUsuario(historialTransaccionDTO.getIdUsuario());
        historial.setFechaCreacion(LocalDate.now());
        historial.setFechaModificacion(LocalDate.now());

        historialTransaccionesRepository.save(historial);
    }
}
