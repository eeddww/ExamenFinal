package uni.edu.pe.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.dao.CatTablasDao;
import uni.edu.pe.dto.CatTablas;
import uni.edu.pe.servicio.CatTablasService;

import java.util.List;

@Service
public class CatTablasImpl implements  CatTablasService{

    @Autowired
    CatTablasDao dao;

    @Override
    public List<CatTablas> obtenerCatTablas() {
        return dao.obtenerCatTablas();
    }

    @Override
    public int registrarCatTablas(CatTablas CatTabla) {
        return dao.registrarCatTablas(CatTabla);
    }

	@Override
	public List<CatTablas> RespuestaCatTablas() {
		// TODO Auto-generated method stub
		return null;
	}
}
