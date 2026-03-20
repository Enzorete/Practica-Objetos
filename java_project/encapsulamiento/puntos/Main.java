package encapsulamiento.puntos;

public class Main {
    public static void main(String[] args) {

        Punto p1 = new Punto(2, 6);
        Punto p2 = new Punto(0, 0);
        Punto p3 = new Punto(3, 4);
        Punto p4 = new Punto(-1, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(p1.distancia(p4));
        System.out.println(Punto.distancia(p1, p4)); // al ser static se debe llamar al metodo con el nombre de su clase
    }
}
