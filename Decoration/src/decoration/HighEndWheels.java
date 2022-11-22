
package decoration;
public class HighEndWheels extends carDecerator{
    private int cost; 
    public HighEndWheels(Car car , int cost) {
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
