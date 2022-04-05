package proxy;

public class ProxyDog implements Dog {
    private String personName;
    private RealDog realdog;
    public ProxyDog(String myName){
        this.personName = myName;
    }
    @Override
    public void play(){
        if(getLikeability(personName) > 6){
            realdog = new RealDog(personName);
            realdog.play();
        } else {
            System.out.println("The dog doesn't like " + personName);
        }
    }

    public int getLikeability(String name){
        // if your name starts with C the dog likes you
        if(name.charAt(0) == 'C'){
            return 10;
        } else {
            return 0;
        }
    }
}
