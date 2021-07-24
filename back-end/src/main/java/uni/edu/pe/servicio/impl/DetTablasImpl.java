package uni.edu.pe.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.dao.DetTablasDao;
import uni.edu.pe.dto.DetTablas;
import uni.edu.pe.servicio.DetTablasService;

@Service
public class DetTablasImpl implements DetTablasService {

    @Autowired
    DetTablasDao dao;

    @Override
    public int actualizarDet(DetTablas DetTabla) {
        return dao.actualizarDet(DetTabla);
    }
}
