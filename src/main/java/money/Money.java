package money;

public class Money {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  public boolean equals(Object obj) {
    Money money = (Money) obj;
    return amount == money.amount && currency.equals(money.currency);
  }

  public String toString() {
    return amount + " " + currency;
  }
}
