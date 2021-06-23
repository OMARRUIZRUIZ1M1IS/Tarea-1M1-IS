package TareaPOO;

public class Cilindro extends FigurasPoo {
	private String nombre;
	

	private boolean tieneradio;
	private boolean tienealtura;
	 
	public Cilindro() {
		this(true, "indefinido", true, "indefinido", true,true );
	}

	public Cilindro(boolean es3d, String color, boolean existe, String nombre, boolean tieneradio, boolean tienealtura) {
		
		this.nombre=nombre;
		this.tienealtura=tienealtura;
		this.tieneradio=tieneradio;
	}

	///////////////////////////////////////////////////
	
	public void calcular (){
		System.out.println("a continuacion se calculara el cilindro ");
	}
	
	
	
	
public void cilindro (double radio ,double altura ){
		
		System.out.println("el area lateral es "+ (2* Math.PI* radio*altura  ));
		System.out.println("el area total es "+ (2* Math.PI* radio*(altura+radio) ));
		System.out.println("el volumen es: "+ (Math.PI* radio*radio*altura));
		
	}
	
	///////////////////////////////////////////////////////////
	
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
