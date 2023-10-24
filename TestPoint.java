package Exercice2_Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p=new Point(2,2);

        System.out.println("coordonnes  de  point "+p.numero +" sont:");
        p.affichePoint();
        Point q=new Point();
        System.out.println("coordonnes de point "+q.numero+" sont:");
        q.affichePoint();
        System.out.println("le nombre de point est "+Point.nombre);
        p.translate(8,3);
        System.out.println("les nouveaux coordonnes  de  point "+p.numero+1+"sont:");
        p.setcoordonnerPoint(6,7);
        System.out.println("les nouveaux coordonnes  de  point "+p.numero+" sont:");
        p.affichePoint();
        if (p.egale(p,q)){
            System.out.println(" coordonnes de point p et q sont égaux");
        }
        if(p.origine()){
            System.out.println("le point "+p.numero+"est dans l'origine");
        }else  System.out.println("le point "+p.numero+"n'est pas dans l'origine");


    }
}
