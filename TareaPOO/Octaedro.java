package TareaPOO;

public class Octaedro extends FigurasPoo {
private String nombre;

private boolean tienelados;
private boolean tienealtura;

public Octaedro() {
	this(true, "indefinido", true, "indefinido",true, true);
}

public Octaedro(boolean es3d, String color, boolean existe, String nombre, boolean tienelados, boolean tienealtura) {
	this.nombre= nombre;
	this.tienealtura= tienealtura;
	this.tienelados=tienelados;
}
//////////////////////////////////////////////////////////

public void calcular (){
	System.out.println("a continuacion se calculara el octaedro ");
}
public void octaedro (double a, double b, double c ) {
	
	System.out.println("el area es: " + (2*((a*b)+(a*c)+(b*c))));
	
	System.out.println("el volumen es " +(a*b*c));
	
	System.out.println("el diametro es: " + (Math.sqrt(Math.pow(a,2)+ Math.pow(b, 2)+ Math.pow(c, 2))));


}
////////////////////////////////////////////////////////////
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
