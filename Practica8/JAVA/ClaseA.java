package Practica8.JAVA;

public class ClaseA {
    public int x;
    public int z;       

    public ClaseA(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void incrementaXZ() {
        x++;
        z++;
    }
    public void incrementaZ() {
        z++;
    }
    public int getX() {
        return x;
    }
    public int getZ() {
        return z;
    }
}
