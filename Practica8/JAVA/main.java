package Practica8.JAVA;

public class main {
    public static void main(String[] args) {
        ClaseD d = new ClaseD(3,2,1);

        System.out.println("Valores iniciales:");
        System.out.println("A- x: "+ d.getAX());
        System.out.println("A- z: "+ d.getAZ());
        System.out.println("B- y: "+ d.getBY());
        System.out.println("B- z: "+ d.getBZ());

        d.incrementaXZ();

        System.out.println("Valores Incrementados");
        System.out.println("A- x: "+ d.getAX());
        System.out.println("A- z: "+ d.getAZ());
        System.out.println("B- y: "+ d.getBY());
        System.out.println("B- z: "+ d.getBZ());
    }
}
