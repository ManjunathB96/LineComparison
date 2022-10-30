public class Line {
    PointUC2 p1;
    PointUC2 p2;

    float length;
    float getLength(){
        return (float) Math.sqrt(Math.pow((p1.x - p2.x),2 )+ Math.pow((p1.y - p2.y),2));

    }
}
