 
package decoration;
public class SunRoof extends carDecerator{
    private int cost; 
    public SunRoof(Car car , int cost) {
        super(car);
        this.cost=cost;
    }
    @Override
    public void assemble() {
         car.assemble();
         System.out.print("Adding SunRoof");
    }

    @Override
    public void decreption() {
        car.decreption();
    }
}
