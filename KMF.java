class KMF {
    void Milk() {
        System.out.println("order");
    }
}

class Nandini{
    static void shop(KMF P2) {
        P2.Milk();
    }
}

class Customer2{
    public static void main(String[] args) {
        KMF P1 = new KMF();
        Nandini.shop(P1);  
    }
}
