
package decoration;
public class carDecerator implements Car {
    
     protected Car car;
    public carDecerator(Car c){
        this .car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public void decreption() {
        this.car.decreption();
    }   
}
