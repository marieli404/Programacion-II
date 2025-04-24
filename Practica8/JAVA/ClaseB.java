package Practica8.JAVA;

public class ClaseB  {
    public int y;
    public int z;       
    
    public ClaseB(int y, int z) {
        this.y = y;
        this.z = z;
    }
    
    public void incrementaYZ() {
        y++;
        z++;
    }
    
    public void incrementaZ() {
        z++;
    }
    
    public int getY() {
        return y;
    }
    
    public int getZ() {
        return z;
    }
}
