package strategy;

public class Add implements Strategy{
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
