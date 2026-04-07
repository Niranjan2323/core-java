class BazaarNow {

    static int getProductRate(String productItem) {

        int productPrice = 0;

        if (productItem.equals("soap")) {
            System.out.println("Product is: " + productItem);
            productPrice = 30;

        } else if (productItem.equals("shampoo")) {
            System.out.println("Product is: " + productItem);
            productPrice = 120;

        } else if (productItem.equals("toothpaste")) {
            System.out.println("Product is: " + productItem);
            productPrice = 80;

        } else if (productItem.equals("facewash")) {
            System.out.println("Product is: " + productItem);
            productPrice = 150;

        } else if (productItem.equals("facecream")) {
            System.out.println("Product is: " + productItem);
            productPrice = 200;

        } else if (productItem.equals("suncream")) {
            System.out.println("Product is: " + productItem);
            productPrice = 180;

        } else {
            System.out.println("Product not available");
            return 0;
        }

        return productPrice;
    }

    static int generateTotalBill(String productItem, int unitPrice, int itemCount) {

        int finalCost = 0;

        if (unitPrice > 0) {
            finalCost = unitPrice * itemCount;
        } else {
            System.out.println("Invalid product");
        }

        return finalCost;
    }
}