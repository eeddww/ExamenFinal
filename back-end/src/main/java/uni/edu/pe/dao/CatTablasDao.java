package uni.edu.pe.dao;

import uni.edu.pe.dto.CatTablas;

import java.util.List;

public interface CatTablasDao {
    List<CatTablas> obtenerCatTablas();

    int registrarCatTablas(CatTablas CatTabla);
}
