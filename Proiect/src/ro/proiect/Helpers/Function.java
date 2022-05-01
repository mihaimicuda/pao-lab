package ro.proiect.Helpers;

public final class Function {
    public static int DateYear(int year)
    {
        Checkers.CheckProperty(year, x -> x >= 1900, "Invalid year");
        return year - 1900;
    }
}
