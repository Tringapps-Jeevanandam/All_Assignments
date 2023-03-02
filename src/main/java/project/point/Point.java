package project.point;


public class Point  {
    float x1;
    float x2;
    float y1;
    float y2;
    Point(float x1,float x2,float y1,float y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    Point(Point obj){
        x1 = obj.x1;
        x2 = obj.x2;
        y1 = obj.y1;
        y2 = obj.y2;

    }
    protected boolean equals(){
        return ((x1==x2) && (y1==y2));
    }
    
    
}