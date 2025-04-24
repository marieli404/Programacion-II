package Practica8.JAVA;

public class ClaseD {
    private ClaseA a;
    private ClaseB b;

    public ClaseD(int x, int z , int y){
        this.a = new ClaseA(x, z);
        this.b = new ClaseB(y, z);
    }

    public void incrementaXZ(){
        a.incrementaXZ();
        b.incrementaZ();
    }

    public int getAX(){
        return a.getX();
    }
    public int getAZ(){
        return a.getZ();
    }
    public int getBY(){
        return b.getY();
    }
    public int getBZ(){
        return b.getZ();
    }
}
