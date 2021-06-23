package TareaPOO;

public class Cuadrado extends FigurasPoo {
	private String nombre;

	private boolean tienelados;
	private boolean tienealtura;
	
	public Cuadrado() {
		this(true, "indefinido", true, "indefinido",true, true);
	}
	
	
	public Cuadrado(boolean es3d, String color, boolean existe, String nombre, boolean tienelados, boolean tienealtura) {
		
		this.nombre=nombre;
		this.tienealtura=tienealtura;
		this.tienelados=tienelados;
	}


	/////////////////////////////////////////
	public void calcular (){
		System.out.println("a continuacion se calculara el cuadrado ");
	}
	public void cuadrado(double lado) {
		System.out.println("el volumen es :"+(6*lado*lado));
		System.out.println("el area es :"+(lado*lado*lado));
	}
	
	
	
	
	////////////////////////////////////////////////////////////////////
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isTienelados() {
		return tienelados;
	}
	public void setTienelados(boolean tienelados) {
		this.tienelados = tienelados;
	}
	public boolean isTienealtura() {
		return tienealtura;
	}
	public void setTienealtura(boolean tienealtura) {
		this.tienealtura = tienealtura;
	}
}
