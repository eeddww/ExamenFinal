package uni.edu.pe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.dto.DetTablas;
import uni.edu.pe.servicio.DetTablasService;

@RestController
public class DetTablasController {
	@Autowired
    DetTablasService service;

    @RequestMapping(value = "/actualizarDet",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public DetTablas actualizarDet(@RequestBody DetTablas DetTabla){
        service.actualizarDet(DetTabla);
        return DetTabla;
    }
}
