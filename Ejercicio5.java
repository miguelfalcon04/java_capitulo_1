public class Ejercicio5 {
    public static void main(String[] args){
        String celeste = "\033[36m";
        String verde = "\033[32m";
        String azul = "\033[34m";
        String rojo = "\033[31m";
        String morado = "\033[35m";
        String naranja = "\033[33m";
        String blanco = "\033[37m";   
        System.out.println(rojo+"\n Lunes\tMartes\tMiérc.\tJueves.\tViernes");
        System.out.println(verde+" ======\t=======\t======\t=======\t=======");
        System.out.println(naranja+" PROG\tSIN\tED\tPROG \tFOL");
        System.out.println(azul+" PROG\tSIN\tED\tPROG\tFOL");
        System.out.println(morado+" LM\tSIN\tPROG\tLM\tFOL");
        System.out.println(celeste+" LM\tSIN\tPROG\tLM\tSIN");
        System.out.println(blanco+" BD\tPROG\tED\tBDATO\tSIN");
        System.out.println(rojo+" BD\tED\tED\tBDATO\tSIN");
       }
}
