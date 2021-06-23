package TareaPOO;

public class Troncocono extends FigurasPoo{
private String nombre;
	

	private boolean tieneradio;
	private boolean tienealtura;
	
	
	
	public Troncocono() {
		this(true, "indefinido", true, "indefinido", true,true );
	}

	public Troncocono(boolean es3d, String color, boolean existe, String nombre, boolean tieneradio, boolean tienealtura) {
		
		this.nombre=nombre;
		this.tienealtura=tienealtura;
		this.tieneradio=tieneradio;
	}
	
	 //////////////////////////////////////////////
	public void calcular (){
		System.out.println("a continuacion se calculara el tronco de cono ");
	}
	public void troncocono (double radio1, double radio2, double alturae) {
		  double generatriz= Math.sqrt(Math.pow(alturae,2)+Math.pow(radio2-radio1,2));
	        
	        
	        System.out.println(" el area lateral es:"+ (Math.PI*(radio2+radio1)*generatriz));
	        System.out.println("el area total es: "+ Math.PI*(generatriz*(radio2+radio1)+Math.pow(radio2,2)+Math.pow(radio1,2)));
			System.out.println("el volumen es: "+ 1.0/3.0*Math.PI*alturae*(Math.pow(radio2,2)+Math.pow(radio1,2)+ radio1*radio2) );
	}
	
	///////////////////////////////////////////////
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
