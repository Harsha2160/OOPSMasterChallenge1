public class Toppings {
    private double extraButterPrice;

    private double extraHamPrice;

    private double extraMustardSaucePrice;

    private double extraJalapenoPrice;

    private double extraOnionPrice;

    private double ToppingPrice;

    public Toppings(double extraButterPrice, double extraHamPrice, double extraMustardSaucePrice, double extraJalapeno, double extraOnion) {
        this.extraButterPrice = extraButterPrice;
        this.extraHamPrice = extraHamPrice;
        this.extraMustardSaucePrice = extraMustardSaucePrice;
        this.extraJalapenoPrice = extraJalapeno;
        this.extraOnionPrice = extraOnion;
    }

    public double getExtraButterPrice() {
        return extraButterPrice;
    }

    public double getExtraHamPrice() {
        return extraHamPrice;
    }

    public double getExtraMustardSaucePrice() {
        return extraMustardSaucePrice;
    }

    public double getExtraJalapeno() {
        return extraJalapenoPrice;
    }

    public double getExtraOnion() {
        return extraOnionPrice;
    }

    public double ToppingCost(String ToppingSelection) {

            switch (ToppingSelection.toUpperCase().charAt(0)) {

                case 'B':

                    ToppingPrice = extraButterPrice;
                    break;

                case 'H':
                    ToppingPrice = extraHamPrice;
                    break;
                case 'M':
                    ToppingPrice = extraMustardSaucePrice;
                    break;
                case 'J':
                    ToppingPrice = extraJalapenoPrice;
                    break;
                case 'O':
                    ToppingPrice = extraOnionPrice;
                    break;
                default :
                    ToppingPrice = 0;

            }

        return ToppingPrice;
    }
}
