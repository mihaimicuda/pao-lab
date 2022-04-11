package ro.unibuc;

public class Application {
    public static void main(String[] args) {

//        Motorbike motorbike = new Motorbike("Kawasaki");
//        System.out.println(motorbike.getPrice());

//        Motorbike motorbike = new Motorbike();


        Motorbike myBike = Motorbike.Builder
                .newMotorbike()
                .brand("Kawasaki")
                .engine(new Engine())
                .tyreType(new TyreType("Michelin"))
                .build();

        System.out.println(myBike);
    }
}
