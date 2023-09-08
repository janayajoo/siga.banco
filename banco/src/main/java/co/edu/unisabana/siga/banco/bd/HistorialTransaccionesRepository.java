package co.edu.unisabana.siga.banco.bd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialTransaccionesRepository extends JpaRepository<HistorialTransacciones, Integer> {

}
