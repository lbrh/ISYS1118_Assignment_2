class Customer {
    String sessionID;
    Product[] browseHistory;

    public void browseProducts() {}

    public void addToCart(int productID, int quantity) {}

    public void getProductDetails(int productID) {}
}

class GuestCustomer extends Customer {
    int guestID;
}

class RegisteredCustomer extends Customer {
    int customerID;
    String emailAddress;

    public void login() {}

    public void createAccount() {}

    public void viewAppointments() {}

    public void checkout(ShoppingCart cart) {}

    public void virtualTryOn(int productID) {}
}

class ShoppingCart {
    Product[] items;
    double totalPrice;
    int quantity;

    public void applyCoupon(String couponCode) {}

    public void clearCart() {}
}

class Product {
    int productID;
    String productName;
    double price;
    String description;
    int quantity;

    public void updateStock(int quantity) {}
}

class Staff {
    int staffID;
    String name;
    String email;

    public void manageOrder(int orderID, String action) {}

    public void handleReturn(int orderID) {}
}

class Admin extends Staff {
    int adminID;

    public void updateInventory(Product[] inventory) {}

    public void addProduct(Product product) {}

    public void deleteProduct(int productID) {}

    public void changePrice(int productID, int price) {}
}

class Order {
    int orderID;
    String orderDate;
    int customerID;
    Product[] items;

    public void getOrderDetails() {}

    public void generateInvoice() {}
}

class Optician {
    int opticianID;
    String name;
    String[] schedule;

    public void addAvailability(String date, String time) {}

    public void getAppointments() {}

    public void createAppointment(int opticianID, String date, String time) {}
}

class Appointment {
    int appointmentID;
    int customerID;
    int opticianID;
    String appointmentDate;
    String appointmentTime;
}

class Prescription {
    int prescriptionID;
    String prescriptionDetails;

    public void printPrescription() {}

    public void linkToOrder(int prescriptionID, int orderID) {}
}

class ExternalAPIService {
    String tryOnAPIEndpoint;
    String paymentAPIEndpoint;

    public void startVirtualTryOn(int productID, Image userImage) {}

    public void processPayment(int orderID, String paymentDetails) {}
}
