package TareaPOO;

public class Tetraedro extends FigurasPoo{
	private String nombre;

	
	private boolean tienelados;
	private boolean tienealtura;
	public Tetraedro() {
		this(true, "indefinido", true, "indefinido",true, true);
	}
	public Tetraedro(boolean es3d, String color, boolean existe, String nombre, boolean tienelados, boolean tienealtura) {
		this.nombre=nombre;
		this.tienealtura=tienealtura;
		this.tienelados=tienelados;
	}
	////////////////////////////////////////////////////////////////////////
	public void calcular (){
		System.out.println("a continuacion se calculara el tetraedro");
	}
	public void tetraedro(double ll) {
		System.out.println("el area es :" + (Math.pow(ll,2)*Math.sqrt(3)));

    	System.out.println("el volume es: "+(Math.sqrt(2)/12*Math.pow(ll,3)));
		
    	System.out.println("la altura es: " + (2.4494/3)*(ll));
	}
	
	////////////////////////////////////////////////////////////////////////
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
