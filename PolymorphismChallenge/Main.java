class Main {
    public static void main(String args[]) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is $" + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 0.99);
        healthyBurger.addHealthAddition1("Alfalfa", 0.49);
        System.out.println("Total healthy burger price is $" + healthyBurger.itemizeHamburger());
    }
}