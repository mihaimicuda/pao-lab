package proxy;

public class RealDog implements Dog {
    private String personName;
    public RealDog(String myName){
        this.personName = myName;
    }
    @Override
    public void play(){
        System.out.println("The dog plays with you");
    }
}
