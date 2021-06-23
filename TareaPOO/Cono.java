package TareaPOO;

public class Cono extends FigurasPoo {
private String nombre;

	private boolean tieneradio;
	private boolean tienealtura;
	
	public Cono() {
		this(true, "indefinido", true, "indefinido", true,true );
	}

	public Cono(boolean es3d, String color, boolean existe, String nombre, boolean tieneradio, boolean tienealtura) {
		
		this.nombre=nombre;
		this.tienealtura=tienealtura;
		this.tieneradio=tieneradio;
	}
	/////////////////////////////////////////////
	
	
	public void calcular (){
		System.out.println("a continuacion se calculara el cono ");
	}
	public void cono (double radio ,double altura ){
		
		
		double generatriz= Math.sqrt( Math.pow (altura,2) + Math.pow(radio,2));
				
				System.out.println("el area lateral es "+ (Math.PI*radio*generatriz));
				System.out.println("el area total es:" + (Math.PI*radio*(generatriz+radio) ));
				System.out.println("el volumen total es "+ (Math.PI*Math.pow(radio,2)*altura/3));

			}
	
	//////////////////////////////////////////////
	
	

	public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean isTieneradio() {
	return tieneradio;
}

public void setTieneradio(boolean tieneradio) {
	this.tieneradio = tieneradio;
}

public boolean isTienealtura() {
	return tienealtura;
}

public void setTienealtura(boolean tienealtura) {
	this.tienealtura = tienealtura;
}

}
