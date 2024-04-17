package GEvaSE;

public class HinhTron {
    private final float PI = 3.14f;
    private float r;

    public float getR(){
        return r;
    }  

    public void setR(float r){
        this.r = r;
    }
    
    public float tinhCV(){
        return 2 * PI * r;
    }

    public float tinhDT(){
        return PI * r * r;
    }
}
