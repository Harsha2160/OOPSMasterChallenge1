public class Coke extends Drink {
    private double cokePrice;

    public void setCokePrice(double cokePrice) {
        this.cokePrice = cokePrice;
    }

    public double getCokePrice() {
        return cokePrice;
    }

    public double calculateDrinkCost(String size) {


            switch (size.toUpperCase().charAt(0)) {

                case 'S':

                    setCokePrice(3);
                    break;

                case 'R':
                    setCokePrice(5);
                    break;
                case 'L':
                    setCokePrice(7);
                    break;


        }
        return getCokePrice();
    }
}
