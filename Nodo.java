
public class Nodo {
	    public Nodo back;	//apuntador al nodo anterior
	    public int estado;	//numero de estado 
	    public char dato;	//dato con el que hace transicion
	    public Nodo salto;	//apuntador para los estados que tienen saltos
	    public Nodo next;	//apuntador al nodo siguiente
	   public Nodo(){
	        this.back = null;
	        this.estado= 0;
	        this.dato = '0';
	        this.salto = null;
	        this.next = null;
	    }
	    public void nodoInicial(char val, Nodo sig, Nodo salto){
	        this.dato = val;
	        this.estado= 0;
	        this.next = sig;
	        this.salto = salto;
	    }
	    public void nodoFinal(int contador, Nodo ant){
	    	this.estado= contador;
	        this.back = ant;
	    }
	    public void nodoIntermedio(char var, int contador, Nodo ant, Nodo sig, Nodo salto){
	        this.dato= var;
	        this.estado = contador;
	        this.back = ant;
	        this.next = sig;
	        this.salto = salto;
	    }
	
}
