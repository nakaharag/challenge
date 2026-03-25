public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.addPayment(new Payment("1", 100, "USD", PaymentStatus.SUCCESS));
        processor.addPayment(new Payment("2", 200, "USD", PaymentStatus.FAILED));
        processor.addPayment(new Payment("3", 300, "USD", PaymentStatus.PENDING));
        processor.addPayment(new Payment("4", 400, "USD", PaymentStatus.SUCCESS));

        System.out.println("All payments:");
        processor.getAllPayments().forEach(System.out::println);

        System.out.println("Total payments: " + processor.getTotalPayments());
        System.out.println("Total successful amount: " + processor.getTotalSuccessfulAmount());
        System.out.println("Average successful amount: " + processor.getAverageTotalSuccessfulAmount());
        System.out.println("Sorted payments: ");
        processor.getPaymentsSortedByAmountDesc().forEach(System.out::println);
    }
}
