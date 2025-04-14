class IBM {
    void opening() {
        System.out.println("offer");
    }
}

class Jspiders{
    static void shop(IBM P2) {
        P2.opening();
    }
}

class Customer4{
    public static void main(String[] args) {
        IBM P1 = new IBM();
        Jspiders.shop(P1);  
    }
}
