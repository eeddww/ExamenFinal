package uni.edu.pe.dto.rest;

import uni.edu.pe.dto.CatTablas;

import java.util.List;

public class RespuestaCatTablas {

    private List<CatTablas> CatTabla;

    public List<CatTablas> getCatTablas() {
        return CatTabla;
    }

    public void setCatTablas(List<CatTablas> CatTabla) {
        this.CatTabla = CatTabla;
    }
}
