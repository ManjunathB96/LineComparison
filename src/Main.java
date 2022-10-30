public class Main {
    public static void main(String[] args) {
        LineUC1 l1 = new LineUC1();
        l1.p1 = new PointUC2();

        l1.p1.x =10;
        l1.p1.y =20;

        l1.p2 = new PointUC2();

        l1.p2.x =80;
        l1.p2.y = 100;

        LineUC1 l2 = new LineUC1();

        l2.p1 = new PointUC2();

        l2.p1.x  = 10;
        l2.p1.y = 20;

        l2.p2 = new PointUC2();

        l2.p2.x = 80;
        l2.p2.y = 75;


        Float length1 = l1.getLength();
        System.out.println(length1);

        Float length2 = l2.getLength();
        System.out.println(length2);

          if(length1. == length2){
             System.out.println("Both lines are equal");

         }
         else {
            System.out.println("lines are not equal");
         }

       
    }
}
