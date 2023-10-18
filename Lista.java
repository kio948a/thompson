

public class Lista {

	public Nodo K1;	//nodo inicial
    public Nodo K2;	//
    public Nodo K3;
    public Nodo K4;	//nodo final
    public Lista(){
        K1 = new Nodo();
        K2 = new Nodo();
        K3 = new Nodo();
        K4 = new Nodo();
        K1.nodoInicial('&', K2, K4);
        K2.nodoIntermedio('r', 1,K1, K3,null);
        K3.nodoIntermedio('&', 2,K2, K4, null);
        K4.nodoFinal( 3, K3);
    }

}
