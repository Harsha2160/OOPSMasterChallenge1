import java.util.Scanner;

public class Main {

    public static String drinkSelect;
    public static String drinkSizeSelect;
    public static String sideDishSelect;
    public static String BurgerSelect;
    public static String Topping1Select;
    public static String Topping2Select;
    public static String Topping3Select;
    public static String Topping4Select;
    public static String Topping5Select;
    public static String toppingModified;
    public static String toppingEntered;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Meal Choice: D for Deluxe or N for Normal. " +
                "Default Meal would be selected if this is skipped or entered invalid input");
        System.out.println("Note : Can select ONLY Deluxe Burger in Deluxe Meal");
        String mealSelect= scanner.nextLine();
        if (mealSelect.isBlank())
            mealSelect = "E";
        mealType(mealSelect);


    }

    public static void mealType(String mealType){
        Scanner scanner = new Scanner(System.in);
        if(mealType.toUpperCase().charAt(0) == 'N'){
            System.out.println("Enter Burger Type: Veg (OR) NonVeg");
            BurgerSelect = scanner.nextLine();
            if (BurgerSelect.isBlank() || (BurgerSelect.toUpperCase().charAt(0) != 'N' && BurgerSelect.toUpperCase().charAt(0) != 'V' ))
                BurgerSelect = "E";
            for (int i = 1;i<=3;i++){
                System.out.println("Enter one of the Five Toppings: 'Butter', 'Ham', 'Mustard Sauce', 'Jalapenos', 'Onions' ");
                toppingEntered = scanner.nextLine();
                if(toppingEntered.isBlank())
                    toppingModified = "E";
                else {
                    toppingBlankCheck(toppingEntered);
                }
               if(Topping1Select == null)
                   Topping1Select = toppingModified;
               else if(Topping2Select == null)
                   Topping2Select = toppingModified;
               else if(Topping3Select == null)
                   Topping3Select = toppingModified;
            }
            System.out.println("Enter Coke (OR) Soda");
            drinkSelect = scanner.nextLine();
            if(drinkSelect.isBlank())
                drinkSelect = "E";
            System.out.println("Enter Drink Size: Small, Regular, Large. Default is Small size");
            drinkSizeSelect = scanner.nextLine();
            if(drinkSizeSelect.isBlank() || (drinkSizeSelect.toUpperCase().charAt(0) !='S' && drinkSizeSelect.toUpperCase().charAt(0) !='R' && drinkSizeSelect.toUpperCase().charAt(0) !='L'))
                drinkSizeSelect = "Small";
            System.out.println("Enter Side Dish: Fries (OR) PotatoWedges");
            sideDishSelect = scanner.nextLine();
            if(sideDishSelect.isBlank())
                sideDishSelect = "E";
            new Meal(drinkSelect, drinkSizeSelect, sideDishSelect, BurgerSelect, Topping1Select, Topping2Select, Topping3Select);
        }

        else if(mealType.toUpperCase().charAt(0) == 'D'){
                System.out.println("Enter Burger Type: Deluxe");
                BurgerSelect = scanner.nextLine();
                if (BurgerSelect.isBlank() || BurgerSelect.toUpperCase().charAt(0) != 'D')
                    BurgerSelect ="E";
                for (int i = 1;i<=5;i++){
                    System.out.println("Enter one of the Five Toppings: 'Butter', 'Ham', 'Mustard Sauce', 'Jalapenos', 'Onions' ");
                    toppingEntered = scanner.nextLine();
                    if(toppingEntered.isBlank())
                        toppingModified = "E";
                    else {
                        toppingBlankCheck(toppingEntered);
                    }
                    if(Topping1Select == null)
                        Topping1Select = toppingModified;
                    else if(Topping2Select == null)
                        Topping2Select = toppingModified;
                    else if(Topping3Select == null)
                        Topping3Select = toppingModified;
                    else if(Topping4Select == null)
                        Topping4Select = toppingModified;
                    else if(Topping5Select == null)
                        Topping5Select = toppingModified;
                }
                System.out.println("Enter Coke (OR) Soda");
                drinkSelect = scanner.nextLine();
                if(drinkSelect.isBlank())
                    drinkSelect = "E";
                System.out.println("Enter Drink Size: Small, Regular, Large. Default is Small Size");
                drinkSizeSelect = scanner.nextLine();
                if(drinkSizeSelect.isBlank() || (drinkSizeSelect.toUpperCase().charAt(0) !='S' && drinkSizeSelect.toUpperCase().charAt(0) !='R' && drinkSizeSelect.toUpperCase().charAt(0) !='L'))
                    drinkSizeSelect = "Small";
                System.out.println("Enter Side Dish: Fries (OR) PotatoWedges");
                sideDishSelect = scanner.nextLine();
                if(sideDishSelect.isBlank())
                    sideDishSelect = "E";

            new Meal(drinkSelect, drinkSizeSelect, sideDishSelect, BurgerSelect, Topping1Select, Topping2Select, Topping3Select, Topping4Select, Topping5Select);
        }

        else{
            System.out.println("You selected a Default Meal");
            new Meal();
        }
    }

    public static void toppingBlankCheck(String toppingEntered){

            switch (toppingEntered.toUpperCase().charAt(0)) {
                case 'B':
                case 'H':
                case 'M':
                case 'J':
                case 'O':
                    toppingModified = toppingEntered;
                    break;

                default:
                    toppingModified = "E";
            }


    }

}
