public class Car implements Drivable, Tradable {

    private int maxSpeed2;
    public Car() {
        this.maxSpeed2 = 2;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed2++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed2--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed2;
    }

    @Override
    public int getPrice() {
        return 10;
    }


    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed2 +")";
    }
}
