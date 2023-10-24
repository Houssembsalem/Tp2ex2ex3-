package Eercice3_personne;
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne =new Personne();
        personne.setFirstName("houssem");
        personne.setName("ben Salem");
        personne.setDaeNaiss(1,8,2003);
        System.out.println(personne.firstName+" "+personne.name+" votre age est:"+personne.ageEn2023());
    }
}
