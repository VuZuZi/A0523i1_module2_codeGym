package ss6_ke_thua.bai_tap.point_and_movablepoint;

public class MovAblePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovAblePoint() {
    }

    public MovAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    public void movAblePoint(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
    }

    @Override
    public String toString() {
        return super.toString()+
                ",speed = (" + xSpeed +
                ", " + ySpeed +
                ')';
    }
}
