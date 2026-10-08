static void main()
{
    EmailService emailService = new EmailService();

    OrderService orderService = new OrderService(emailService);

    orderService.placeOrder();
}