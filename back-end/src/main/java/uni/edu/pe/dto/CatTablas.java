package uni.edu.pe.dto;

import lombok.Data;

@Data
public class CatTablas {
    private String codigoTabla;
    private String descripcionct;
    private String estado;
    
    public String getCodigoTabla() {
		return codigoTabla;
	}

	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}

	public String getdescripcionct() {
		return descripcionct;
	}

	public void setdescripcionct(String descripcionct) {
		this.descripcionct = descripcionct;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public CatTablas(String codigoTabla, String descripcionct, String estado) {
		this.codigoTabla = codigoTabla;
		this.descripcionct = descripcionct;
		this.estado = estado;
	}
}
