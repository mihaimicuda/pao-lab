package strategy;

public class Multiply implements Strategy{
    @Override
    public int operation(int x, int y) {
        return x * y;
    }
}