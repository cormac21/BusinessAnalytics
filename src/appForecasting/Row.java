package appForecasting;

public class Row {

	public Float valor;
	public Float nivel;
	public Float tendencia;
	public Float componenteTemporal;
	public Float foreCasting;
	public Float erro;
	public Float erroPercent;
	
	public Row(Float valor){
		this.valor = valor;
	}
	
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getNivel() {
		return nivel;
	}
	public void setNivel(Float nivel) {
		this.nivel = nivel;
	}
	public Float getTendencia() {
		return tendencia;
	}
	public void setTendencia(Float tendencia) {
		this.tendencia = tendencia;
	}
	public Float getComponenteTemporal() {
		return componenteTemporal;
	}
	public void setComponenteTemporal(Float componenteTemporal) {
		this.componenteTemporal = componenteTemporal;
	}
	public Float getForeCasting() {
		return foreCasting;
	}
	public void setForeCasting(Float foreCasting) {
		this.foreCasting = foreCasting;
	}
	public Float getErro() {
		return erro;
	}
	public void setErro(Float erro) {
		this.erro = erro;
	}
	public Float getErroPercent() {
		return erroPercent;
	}
	public void setErroPercent(Float erroPercent) {
		this.erroPercent = erroPercent;
	}
	
}
