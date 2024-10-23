package codeflow;

public class Main {

    public static void main(String[] args) {
        /*
        Flows flows = new Flows();
        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        //System.out.println("flows.methodA(\"start\");");
        flows.methodA("start");
        //System.out.println("flows.methodB(\"Hello, world\");");
        flows.methodB("Hello, world");
        */
        /*
       System.out.println("flows.methodC(\"Hello, world\");");
       flows.methodC("Hello, world");
       System.out.println("flows.methodD(25);");
       flows.methodD(25);   */


        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
        System.out.println(biogrande);
    }
}


