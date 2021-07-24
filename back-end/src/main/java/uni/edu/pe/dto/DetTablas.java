package uni.edu.pe.dto;

import lombok.Data;

@Data
public class DetTablas {
    private Integer id;
    private String codigoTabla;
    private String codigoDetalle;
    private String valor;
    private String descripciondt;
    private String estado;
     
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoTabla() {
		return codigoTabla;
	}

	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}

	public String getCodigoDetalle() {
		return codigoDetalle;
	}

	public void setCodigoDetalle(String codigoDetalle) {
		this.codigoDetalle = codigoDetalle;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getdescripciondt() {
		return descripciondt;
	}


	public void setdescripciondt(String descripciondt) {
		this.descripciondt = descripciondt;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public DetTablas(Integer id, String codigoTabla, String codigoDetalle, String valor, String descripciondt,
			String estado) {
		this.id = id;
		this.codigoTabla = codigoTabla;
		this.codigoDetalle = codigoDetalle;
		this.valor = valor;
		this.descripciondt = descripciondt;
		this.estado = estado;
	}

    
}
