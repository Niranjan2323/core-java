class paper {

    int getPages() {
        int pages = 100;
        System.out.println("Number of pages: " + pages);
        return pages;
    }
    void displayQuality(String quality) {
        System.out.println("Quality is: " + quality);
        int p = getPages();
        System.out.println("Returned Pages: " + p);
    }
    void showDetails() {
        System.out.println("Paper details");
        displayQuality("A4");
    }
}

