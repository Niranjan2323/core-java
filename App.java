class app {

    int getVersion() {
        int version = 3;
        System.out.println("Version is: " + version);
        return version;
    }
    void displayName(String name) {
        System.out.println("App name is: " + name);

        int v = getVersion();
        System.out.println("Returned Version: " + v);
    }
    void showDetails() {
        System.out.println("App details");
        displayName("WhatsApp");
    }
}

