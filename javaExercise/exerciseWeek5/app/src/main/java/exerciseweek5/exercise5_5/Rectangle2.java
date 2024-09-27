package exerciseweek5.exercise5_5;

public class Rectangle2 implements Resizable {
    private int width;
    private int height;

    public Rectangle2(double width, double height){
        this.width = (int)width;
        this.height =(int) height;
    }

    @Override
    public void resizeWidth(int width){
      this.width = width;
    }

   @Override
    public void resizeHeight(int height){
      this.height = height;
    }

    public void printSize(){
        System.out.println("Width:"+ width + ", Height:" + height);
    }

    // private double width;
    // private double height;

    // public Rectangle(double width, double height) {
    //     this.width = width;
    //     this.height = height;
    // }
    
}
