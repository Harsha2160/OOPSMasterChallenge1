public class Meal {

    protected Drink drinkName;
    protected SideDish sideDishName;
    protected double drinkPrice;

    protected double sideDishPrice;
    protected Burger BurgerChoice;

    protected double burgerPrice;

    protected double Topping1Price;
    protected double Topping2Price;

    private String drinkCheck;
    private String burgerCheck;
    private String sideDishCheck;
    protected double Topping3Price;

    protected double Topping4Price;
    protected double Topping5Price;

    protected Toppings ToppingVariable;

    protected String drinkSize;

    protected double billTotalPrice;


    public Meal() {

        BurgerChoice = BurgerSelection("VegBurger");
        burgerPrice = BurgerChoice.getBasePrice();

        drinkName = drinkSelection("Coke");
        drinkSize = "Small";
        drinkPrice = drinkName.calculateDrinkCost(drinkSize);

        sideDishName = SideDishSelection("Fries");

        sideDishPrice = sideDishName.getSideDishPrice();

        Topping1Price = ToppingVariable.ToppingCost("B");


        printNormalMealBill(drinkName.getClass().getSimpleName().toUpperCase().charAt(0), sideDishName.getClass().getSimpleName().toUpperCase().charAt(0),
                BurgerChoice.getClass().getSimpleName().toUpperCase().charAt(0), 'B', '\u0000', '\u0000', '\u0000', '\u0000');

        System.out.println("Total Bill of the Meal : $" + totalBill(drinkPrice, sideDishPrice, burgerPrice, Topping1Price, '\u0000', '\u0000'));

    }

    public Meal(String drinkChoice, String drinkSize, String sideDishChoice, String BurgerSelect, String Topping1, String Topping2, String Topping3) {

        BurgerChoice = BurgerSelection(BurgerSelect);

        if (BurgerChoice.getClass().getSimpleName().charAt(0) != 'B')

            burgerCheck = BurgerChoice.getClass().getSimpleName();

        burgerPrice = BurgerChoice.getBasePrice();


        this.drinkSize = drinkSize;
        drinkName = drinkSelection(drinkChoice);

        if (drinkName.getClass().getSimpleName().charAt(0) != 'D')

            drinkCheck = drinkName.getClass().getSimpleName();

        drinkPrice = drinkName.calculateDrinkCost(drinkSize);


        sideDishName = SideDishSelection(sideDishChoice);

        if (sideDishName.getClass().getSimpleName().charAt(0) != 'S')

            sideDishCheck = sideDishName.getClass().getSimpleName();


        sideDishPrice = sideDishName.getSideDishPrice();

        Topping1Price = ToppingVariable.ToppingCost(Topping1);
        Topping2Price = ToppingVariable.ToppingCost(Topping2);
        Topping3Price = ToppingVariable.ToppingCost(Topping3);


        printNormalMealBill(drinkCheck.toUpperCase().charAt(0), sideDishCheck.toUpperCase().charAt(0),
                burgerCheck.toUpperCase().charAt(0), Topping1.toUpperCase().charAt(0),
                Topping2.toUpperCase().charAt(0), Topping3.toUpperCase().charAt(0), '\u0000', '\u0000');
        System.out.println("Total Bill of the Meal : $" + totalBill(drinkPrice, sideDishPrice, burgerPrice, Topping1Price, Topping2Price, Topping3Price));


    }

    public Meal(String drinkChoice, String drinkSize, String sideDishChoice, String BurgerSelect, String Topping1, String Topping2, String Topping3, String Topping4, String Topping5) {

        BurgerChoice = BurgerSelection(BurgerSelect);

        if (BurgerChoice.getClass().getSimpleName().charAt(0) != 'B')

            burgerCheck = BurgerChoice.getClass().getSimpleName();

        burgerPrice = BurgerChoice.getBasePrice();

        this.drinkSize = drinkSize;
        drinkName = drinkSelection(drinkChoice);

        if (drinkName.getClass().getSimpleName().charAt(0) != 'D')

            drinkCheck = drinkName.getClass().getSimpleName();

        drinkPrice = drinkName.calculateDrinkCost(drinkSize);


        sideDishName = SideDishSelection(sideDishChoice);

        if (sideDishName.getClass().getSimpleName().charAt(0) != 'S')

            sideDishCheck = sideDishName.getClass().getSimpleName();

        sideDishPrice = sideDishName.getSideDishPrice();


        Topping1Price = ToppingVariable.ToppingCost(Topping1);
        Topping2Price = ToppingVariable.ToppingCost(Topping2);
        Topping3Price = ToppingVariable.ToppingCost(Topping3);
        Topping4Price = ToppingVariable.ToppingCost(Topping4);
        Topping5Price = ToppingVariable.ToppingCost(Topping5);

        printNormalMealBill(drinkCheck.toUpperCase().charAt(0), sideDishCheck.toUpperCase().charAt(0),
                burgerCheck.toUpperCase().charAt(0), Topping1.toUpperCase().charAt(0),
                Topping2.toUpperCase().charAt(0), Topping3.toUpperCase().charAt(0),
                Topping4.toUpperCase().charAt(0), Topping5.toUpperCase().charAt(0));
        System.out.println("Total Bill of the Meal : $" + totalBill(drinkPrice, sideDishPrice, burgerPrice, Topping1Price, Topping2Price, Topping3Price));


    }

    public Drink drinkSelection(String DrinkType) {

        switch (DrinkType.toUpperCase().charAt(0)) {

            case 'C':
                drinkName = new Coke();
                break;

            case 'S':
                drinkName = new Soda();
                break;

            default:
                drinkName = new Drink();
                drinkCheck = "Y";
                break;

        }
        return drinkName;

    }

    public SideDish SideDishSelection(String SideType) {

        switch (SideType.toUpperCase().charAt(0)) {

            case 'P':
                sideDishName = new PotatoWedges();
                sideDishName.setSideDishPrice(4.0);
                break;

            case 'F':
                sideDishName = new Fries();
                sideDishName.setSideDishPrice(3.0);
                break;

            default:
                sideDishName = new SideDish();
                sideDishCheck = "Z";
                break;

        }
        return sideDishName;
    }

    public Burger BurgerSelection(String BurgerType) {
        ToppingVariable = new Toppings(3, 4, 5, 6, 7);

        switch (BurgerType.toUpperCase().charAt(0)) {

            case 'V':
                BurgerChoice = new VegBurger();
                BurgerChoice.setBasePrice(8.0);
                break;

            case 'N':
                BurgerChoice = new NonVegBurger();
                BurgerChoice.setBasePrice(12.0);
                break;

            case 'D':
                BurgerChoice = new deluxeBurger();
                BurgerChoice.setBasePrice(30.0);
                break;

            default:
                BurgerChoice = new Burger();
                BurgerChoice.setBasePrice(0);
                burgerCheck = "X";
                break;

        }
        return BurgerChoice;
    }

    public double totalBill(double drinkPrice, double sideDishPrice, double burgerPrice, double Topping1Price, double Topping2Price, double Topping3Price) {


        if (burgerPrice < 30.0) {
            billTotalPrice = drinkPrice + sideDishPrice + burgerPrice + Topping1Price + Topping2Price + Topping3Price;
        } else {
            billTotalPrice = burgerPrice;
        }
        return billTotalPrice;
    }

    public void printNormalMealBill(char drinkChoice, char sideDishChoice, char BurgerSelect, char Topping1, char Topping2, char Topping3, char Topping4, char Topping5) {


        itemExists(BurgerSelect);
        itemExists(Topping1);
        itemExists(Topping2);
        itemExists(Topping3);
        itemExists(Topping4);
        itemExists(Topping5);
        itemExists(drinkChoice);
        itemExists(sideDishChoice);
    }

    private void itemExists(char value) {

        if(drinkSize.toUpperCase().charAt(0) == 'S')
            drinkSize = "Small";
        else if(drinkSize.toUpperCase().charAt(0)== 'R')
            drinkSize = "Regular";
        else if(drinkSize.toUpperCase().charAt(0) == 'L')
            drinkSize = "Large";


        switch (value) {

            case 'V':
                System.out.println("VegBurger :$" + burgerPrice);
                break;

            case 'N':
                System.out.println("NONVegBurger :$" + burgerPrice);
                break;

            case 'D':
                System.out.println("DeluxeBurger :$" + burgerPrice);
                break;

            case 'B':
                System.out.println("Butter :$" + ToppingVariable.getExtraButterPrice());
                break;

            case 'H':
                System.out.println("Ham :$" + ToppingVariable.getExtraHamPrice());
                break;

            case 'M':
                System.out.println("Mustered Sauce :$" + ToppingVariable.getExtraMustardSaucePrice());
                break;

            case 'J':
                System.out.println("Jalapenos :$" + ToppingVariable.getExtraJalapeno());
                break;

            case 'O':
                System.out.println("Onions :$" + ToppingVariable.getExtraOnion());
                break;

            case 'S':

                System.out.println("Soda of size " + drinkSize + " :$" + drinkPrice);

                break;

            case 'C':
                System.out.println("Coke of size " + drinkSize + " :$" + drinkPrice);

                break;

            case 'P':
                System.out.println("PotatoWedges :$" + sideDishPrice);
                break;
            case 'F':

                System.out.println("Fries :$" + sideDishPrice);
                break;

            case 'X':

                System.out.println("Valid Burger Type NOT entered");
                break;
            case 'Y':

                System.out.println("Valid Drink Type NOT entered");
                break;
            case 'Z':

                System.out.println("Valid Side Dish Type NOT entered");
                break;

        }


    }


}