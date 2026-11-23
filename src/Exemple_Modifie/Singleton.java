package Exemple_Modifie;

public final class Singleton {
     private static  Singleton instance = null;
    private int x;
    private int y;
    private int z;

    private Singleton(){
        super();
    }
    private Singleton ( int x2 , int y2 ,int z2){
        this.x =x2;
        this.y =y2;
        this.z =z2;

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public static Singleton getInstance(int x, int y,int z){
        if(instance == null){
            instance = new Singleton(x,y,z);
        }
        return instance;
    }
    public int Somme(int x,int y, int z){
        return x+y+z;
    }
    public float moyenne(int x,int y){
        return Somme(x, y, z)/2;
    }
    public void affiche(){
        System.out.println("\n je suis une instance et mes valeurs sont x =" +this.x+"et y=" +this.y+ "et z ="+this.z);
    }
    @Override 
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
