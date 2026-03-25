import java.util.*;
import java.util.stream.Collectors;

public class PaymentProcessor {
    private List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public List<Payment> getAllPayments() {
        return payments;
    }

    public List<Payment> getPaymentsByStatus(PaymentStatus status) {
        return payments.stream().filter(p -> p.getStatus() == status).collect(Collectors.toList());
    }

    public int getTotalPayments() {
        return payments.size();
    }

    public double getTotalSuccessfulAmount() {
        return payments.stream().filter(p -> p.getStatus() == PaymentStatus.SUCCESS).mapToDouble(Payment::getAmount)
                .sum();
    }

    public double getAverageTotalSuccessfulAmount() {
        return payments.stream().filter(p -> p.getStatus() == PaymentStatus.SUCCESS).mapToDouble(
                Payment::getAmount).average()
                .orElse(0.0);
    }

    public List<Payment> getPaymentsSortedByAmountDesc() {
        return payments.stream().sorted((a, b) -> Double.compare(b.getAmount(), a.getAmount()))
                .collect(Collectors.toList());
    }
}
