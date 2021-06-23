package TareaPOO;

public class Casqueteesferico extends FigurasPoo{
private String nombre;

private boolean tieneradio;
private boolean  tienecurvas;

public Casqueteesferico() {
	this(true, "indefinido", true, "indefinido", true,true );
}

public Casqueteesferico(boolean es3d, String color, boolean exiate, String nombre, boolean tieneradio, boolean tienecurvas) {
this.nombre=nombre;
this.tienecurvas= tienecurvas;
this.tieneradio=tieneradio;

}
/////////////////////////////////////////////
public void calcular (){
	System.out.println("a continuacion se calculara el casquete esferico ");
}

public void casqueteesferico (double radio ,double altura ){

	System.out.println(" el area es " + (2*Math.PI*radio*altura));
	System.out.println("el volumen es "+ (Math.PI*Math.pow(altura,2)*(3*radio-altura)/3));
}





/////////////////////////////////////////////////////
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
