package uni.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.dto.CatTablas;
import uni.edu.pe.dto.rest.RespuestaCatTablas;
import uni.edu.pe.servicio.CatTablasService;

@RestController
public class CatTablasController {
	@Autowired
    CatTablasService service;

    @RequestMapping(value = "/obtenerCatTablas",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RespuestaCatTablas obtenerCatTablas(){
    	RespuestaCatTablas rpta = new RespuestaCatTablas();
        rpta.setCatTablas(service.RespuestaCatTablas());
        return rpta;
    }

    @RequestMapping(value = "/registrarCatTablas",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public CatTablas registrarCatTablas(@RequestBody CatTablas CatTabla){
        service.registrarCatTablas(CatTabla);
        return CatTabla;
    }
}
