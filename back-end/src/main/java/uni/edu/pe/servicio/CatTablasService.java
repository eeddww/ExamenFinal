package uni.edu.pe.servicio;

import org.springframework.stereotype.Service;
import uni.edu.pe.dto.CatTablas;

import java.util.List;

public interface CatTablasService {
    List<CatTablas> obtenerCatTablas();

    int registrarCatTablas(CatTablas CatTabla);

	List<CatTablas> RespuestaCatTablas();
}
