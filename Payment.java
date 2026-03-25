public class Payment {
    private String id;
    private double amount;
    private String currency;
    private PaymentStatus status;

    public Payment(String id, double amount, String currency, PaymentStatus status) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Payment id= " + id + " - amount = " + amount + " - currency: " + currency + " status: " + status;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }
}
