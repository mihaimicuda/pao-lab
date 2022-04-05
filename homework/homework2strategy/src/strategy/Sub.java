package strategy;

public class Sub implements Strategy{
    @Override
    public int execute(int a, int b){
        return a-b;
    }
}
