public class Soda extends Drink {
private double sodaPrice;


    public double getSodaPrice() {
        return sodaPrice;
    }

    public void setSodaPrice(double sodaPrice) {
        this.sodaPrice = sodaPrice;
    }

    public double calculateDrinkCost(String size) {

        switch (size.toUpperCase().charAt(0)) {

            case 'S':

                setSodaPrice(4);
                break;

            case 'R':
                setSodaPrice(5);
                break;
            case 'L':
                setSodaPrice(7);
                break;

        }
        return getSodaPrice();
    }
}
