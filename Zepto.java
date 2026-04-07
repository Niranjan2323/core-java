class Zepto {

    static int getItemPrice(String productName) {

        int itemCost = 0;

        if (productName.equals("milk")) {
            System.out.println("Product is: " + productName);
            itemCost = 50;

        } else if (productName.equals("bread")) {
            System.out.println("Product is: " + productName);
            itemCost = 40;

        } else if (productName.equals("eggs")) {
            System.out.println("Product is: " + productName);
            itemCost = 70;

        } else if (productName.equals("rice")) {
            System.out.println("Product is: " + productName);
            itemCost = 120;

        } else if (productName.equals("oil")) {
            System.out.println("Product is: " + productName);
            itemCost = 150;

        } else if (productName.equals("sugar")) {
            System.out.println("Product is: " + productName);
            itemCost = 60;

        } else {
            System.out.println("Product not found");
            return 0;
        }

        return itemCost;
    }

    static int calculateTotalAmount(String productName, int unitCost, int quantityCount) {

        int totalAmount = 0;

        if (unitCost > 0) {
            totalAmount = unitCost * quantityCount;
        } else {
            System.out.println("Invalid product");
        }

        return totalAmount;
    }
}