package TareaPOO;

public class Esfera extends FigurasPoo{
	
	private String nombre;

	private boolean tieneradio;
	private boolean  tienecurvas;
	
	
	public Esfera() {
		this(true, "indefinido", true, "indefinido", true,true );
	} 
	public Esfera(boolean es3d, String color, boolean existe, String nombre, boolean tieneradio, boolean tienecurvas) {
		this.nombre=nombre;
		this.tienecurvas=tienecurvas;
		this.tieneradio=tieneradio;
	}
	/////////////////////////////////////////////////
	
	public void calcular (){
		System.out.println("a continuacion se calculara la esfera ");
	}
	public void esfera (double radio) {
	
		
		
		double volumen= (4.0/3.0)*Math.PI*(Math.pow(radio,3));
		
		System.out.println("el area es: " + (4*Math.PI*Math.pow(radio,2)));
		System.out.println("el volumen es: " + volumen);
		
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
	public boolean isTienecurvas() {
		return tienecurvas;
	}
	public void setTienecurvas(boolean tienecurvas) {
		this.tienecurvas = tienecurvas;
	}
}
