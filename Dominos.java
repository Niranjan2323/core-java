class Dominos {

    static int getPizzaPrice(String pizzaName) {

        int pizzaPrice = 0;

        if (pizzaName.equals("cheesy dip")) {
            pizzaPrice = 200;

        } else if (pizzaName.equals("paneer pizza")) {
            pizzaPrice = 350;

        } else if (pizzaName.equals("classic pizza")) {
            pizzaPrice = 400;

        } else if (pizzaName.equals("cheese mania")) {
            pizzaPrice = 450;

        } else if (pizzaName.equals("cheese burst")) {
            pizzaPrice = 500;

        } else if (pizzaName.equals("chicken dominator")) {
            pizzaPrice = 600;

        } else if (pizzaName.equals("pepper chicken pizza")) {
            pizzaPrice = 550;

        } else if (pizzaName.equals("paneer onion pizza")) {
            pizzaPrice = 480;

        } else if (pizzaName.equals("roasted chicken pizza")) {
            pizzaPrice = 420;

        } else if (pizzaName.equals("mushroom pizza")) {
            pizzaPrice = 530;

        } else {
            System.out.println("Pizza not found");
            return 0;
        }

        System.out.println("Selected Pizza: " + pizzaName);
        return pizzaPrice;
    }

    static int generateBill(String pizzaName, int unitPrice, int quantityOrdered) {

        int finalAmount = 0;

        if (pizzaName.equals("cheesy dip") || pizzaName.equals("mushroom pizza")) {
            finalAmount = unitPrice * quantityOrdered;
        } else {
            finalAmount = unitPrice * quantityOrdered;
        }

        return finalAmount;
    }
}