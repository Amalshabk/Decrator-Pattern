
package decoration;
public class Decoration {

    public static void main(String[] args) {
        
        CarSuv s = new CarSuv (50);
          System.out.println("cost = "+s.toString());
        HighEndWheels h = new HighEndWheels(s,30);
        System.out.println("cost = "+h.toString());
        SunRoof n = new SunRoof(s,30);
        System.out.println("cost = "+n.toString());
       
    }
    
}
