

public class Principal {

	public static void main(String[] args) {
		Lista prueba = new Lista();
	    // System.out.println("hola");.
		prueba.K1.nodoInicial('&', prueba.K2, prueba.K4);
		prueba.K2.nodoIntermedio('r', 1,prueba.K1, prueba.K3,null);
		prueba.K3.nodoIntermedio('&',2, prueba.K2, prueba.K4, prueba.K2);
		prueba.K4.nodoFinal(3,prueba.K3);
	    //lectura de datos
	    System.out.println("Nodo inicial");
	    System.out.println("Numero de estado");
	    System.out.println(prueba.K1.estado);
	    System.out.println("Dato con el que avanza");
	    System.out.println(prueba.K1.dato);
	    System.out.println("Siguiente estado");
	    System.out.println(prueba.K1.next.estado);
	    System.out.println("salto a estado numero :");
	    System.out.println(prueba.K1.salto.estado);
	    
	    System.out.println("Nodo siguiente");
	    System.out.println("Numero de estado");
	    System.out.println(prueba.K2.estado);
	    System.out.println("Dato con el que avanza");
	    System.out.println(prueba.K2.dato);
	    System.out.println("Siguiente estado");
	    System.out.println(prueba.K2.next.estado);
	    
	    System.out.println("Nodo siguiente");
	    System.out.println("Numero de estado");
	    System.out.println(prueba.K3.estado);
	    System.out.println("Dato con el que avanza");
	    System.out.println(prueba.K3.dato);
	    System.out.println("Siguiente estado");
	    System.out.println(prueba.K3.next.estado);
	    
	    System.out.println("Nodo final");
	    System.out.println("Numero de estado");
	    System.out.println(prueba.K4.estado);
	    System.out.println("Dato con el que avanza");
	    System.out.println(prueba.K4.dato);
	    
	}

}
