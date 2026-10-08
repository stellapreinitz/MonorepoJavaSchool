public class OrderService {

    private final EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder() {
        emailService.sendConfirmation();
    }
}