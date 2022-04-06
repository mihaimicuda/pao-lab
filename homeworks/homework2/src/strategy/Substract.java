package strategy;

public class Substract implements Strategy{
    @Override
    public int operation(int x, int y) {
        return x - y;
    }
}