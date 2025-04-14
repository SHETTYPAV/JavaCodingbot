class Hotel {
    void food() {
        System.out.println("order");
    }
}

class Swiggy{
    static void order(Hotel P2) {
        P2.food();
    }
}

class Customer3{
    public static void main(String[] args) {
        Hotel P1 = new Hotel();
        Swiggy.order(P1);  
    }
}
