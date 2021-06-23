package TareaPOO;

public class FigurasPoo {
	
	private boolean es3d;
private String color;
	private boolean existe;
	
	

	public FigurasPoo() {
		this (true , "indefinido", true );
	}

	public FigurasPoo(boolean es3d, String color, boolean existe) {
		this.es3d= es3d;
		this.color=color;
		this.existe= existe;
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	
	public void calcular (){
		System.out.println("a continuacion se calculara la figuara geometrica ");
	}
	
	public void dimencion () {
		System.out.println("la figura es tridimencional");
	}
	
	public void  fin  () {
		System.out.println("las figuras se han calculado");
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean isEs3d() {
		return es3d;
	}

	public void setEs3d(boolean es3d) {
		this.es3d = es3d;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}


}
