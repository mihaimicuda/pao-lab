package strategy;

public class Add implements Strategy{
    @Override
    public int execute(int a, int b){
        return a+b;
    }
}