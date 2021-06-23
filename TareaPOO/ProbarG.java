package TareaPOO;



public class ProbarG {

	public static void main(String[] args) {
		
		FigurasPoo FF = new FigurasPoo();
		Cilindro pp= new Cilindro();
		Cuadrado oo= new Cuadrado();
		Octaedro ll= new Octaedro();
		Tetraedro kk= new Tetraedro();
		Troncocono jj=new Troncocono();
		Cono hh= new Cono();
		Casqueteesferico ee = new Casqueteesferico();
		Esfera tt= new Esfera();
		
		FF.calcular();
		FF.dimencion();
		FF.fin();
		System.out.println("");
		pp.calcular();
		pp.cilindro(25, 10);
		System.out.println("");
		oo.calcular();
		oo.cuadrado(10);
		System.out.println("");
		ll.calcular();
		ll.octaedro(25, 25, 25);
		System.out.println("");
		kk.calcular();
		kk.tetraedro(5);
		System.out.println("");
		jj.calcular();
		jj.troncocono(25, 15, 7);
		System.out.println("");
		hh.calcular();
		hh.cono(25, 20);
		System.out.println("");
		ee.calcular();
		ee.casqueteesferico(25, 20);
		System.out.println("");
		tt.calcular();
		tt.esfera(25);

	}

}
