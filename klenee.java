
public class klenee {
    public Nodo K1;
    public Nodo K2;
    public Nodo K3;
    public Nodo K4;
    klenee(){
        K1 = new Nodo();
        K2 = new Nodo();
        K3 = new Nodo();
        K4 = new Nodo();
        
        K1.nodoInicial('1', K2, K4);
        K2.nodoIntermedio('2', K1, K3,null);
        K3.nodoIntermedio('3', K2, K4, K2);
        K4.nodoFinal(K3);
    }
    public static void main(String[] args) {
        klenee prueba = new klenee();
        //Seguidos
        System.out.println("seguidos");
        System.out.println(prueba.K1.dato);
        System.out.println(prueba.K1.next.dato);
        System.out.println(prueba.K1.next.next.dato);
        System.out.println(prueba.K1.next.next.next.dato);
        //saltos
        System.out.println("saltos");
        System.out.println(prueba.K1.salto.dato);
        System.out.println(prueba.K3.salto.dato);

        //atras
        System.out.println("atras");
        System.out.println(prueba.K4.dato);
        System.out.println(prueba.K4.back.dato);
        System.out.println(prueba.K4.back.back.dato);
        System.out.println(prueba.K4.back.back.back.dato);

    }
}

class Nodo{
    public Nodo back;
    public char dato;
    public Nodo salto;
    public Nodo next;
    Nodo(){
        this.back = null;
        this.dato = '0';
        this.salto = null;
        this.next = null;
    }
    public void nodoInicial(char val, Nodo sig, Nodo salto){
        this.dato = val;
        this.next = sig;
        this.salto = salto;
    }
    public void nodoFinal(Nodo ant){
        this.back = ant;
    }
    public void nodoIntermedio(char var, Nodo ant, Nodo sig, Nodo salto){
        this.dato=var;
        this.back = ant;
        this.next = sig;
        this.salto = salto;
    }
}