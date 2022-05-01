package ro.proiect.Enums;

public enum CashTypes {
    RON(0.20f),
    EUR(1f),
    USD(0.95f),
    GBP(1.19f),
    UAH(0.031f),
    YEN(0.0073f);

    private final float _conversionToEuro;

    CashTypes(float conversionToEuro) {
        this._conversionToEuro = conversionToEuro;
    }

    public float value() {
        return this._conversionToEuro;
    }
}
