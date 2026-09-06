package LLD_problems.VendingMachineRoughDesign;

import java.util.Map;

// Vending Machine - Rough Design
// Syntax errors only fixed. Design intentionally kept as-is.

// --------------------------------------------------------------------------
// Entities involved:

class Product {
    String productCode;
    String productName;
    double Cost;
}

// --------------------------------------------------------------------------

class VendingMachine {

    Product selectedProduct;
    InventoryManagement inventoryManagement;
    PaymentManagement paymentManagement;

    void selectProduct(String productCode) {
    }

    void insertMoney(double amount) {
    }

    void dispenseProduct() {
    }

    void dispenseProducts() {
    }
}

// --------------------------------------------------------------------------

enum MachineState {
    IDLE,
    PRODUCT_SELECTED,
    AWAITING_PAYMENT,
    DISPENSING
}

// An admin class is not required as the vending machine can be restocked and
// money can be collected by the owner directly through the vending machine
// interface.

// -----------------------------------------------------------------------------

// class Admin {

// VendingMachine vendingMachine;

// void restockProduct(String code, int quantity) {
// vendingMachine.restockProduct(code, quantity);
// }

// void collectMoney() {
// vendingMachine.collectMoney();
// }
// }

// -----------------------------------------------------------------------------

class PaymentManagement {

    MachineState state;
    // PaymentStrategy paymentStrategy;
    double amountPaid;
    // Map<Product, Integer> costs; -- not needed as we can directly do product.Cost

    void insertMoney(double amount) {
        amountPaid += amount;
    }

    double getAmountPaid() {
        return amountPaid;
    }

    int paymentStatus(int paymentMade) {
        // check if paymentMade is less than or more than required payment
        return 0;
    }

    void refundPayment() {
    }

    void collectMoney() {
    }
}

// -----------------------------------------------------------------------------

// Much better design for this:

class PaymentManagementBetter {
    double amountInserted;

    void insertMoney(double amount) {
    }

    double getAmountInserted() {
        return amountInserted;
    }

    boolean hasSufficientAmount(double requiredAmount) {
        return amountInserted >= requiredAmount;
    }

    double calculateChange(double requiredAmount) {
        return amountInserted - requiredAmount;
    }

    void refundPayment() {
    }

    void collectMoney() {
    }
}

// -----------------------------------------------------------------------------
//
// Payment Strategy not required:
// as we are not doing pay through cash or card or UPI,
// rather add a simple variable as double amountPaid

class PaymentStrategy {

    double totalPaymentMade;

    PaymentStrategy() {
        totalPaymentMade = 0;
    }

    void setTotalPaymentMade(double totalPayment) {
        this.totalPaymentMade += totalPayment;
    }

    double getTotalPaymentMade() {
        return this.totalPaymentMade;
    }
}

class CoinPayment extends PaymentStrategy {

    double payment;

    CoinPayment(double payment) {
        this.payment = payment;
        setTotalPaymentMade(payment);
    }
}

class NotePayment extends PaymentStrategy {

    double payment;

    NotePayment(double payment) {
        this.payment = payment;
        setTotalPaymentMade(payment);
    }
}

// --------------------------------------------------------------------------

class InventoryManagement {

    Map<Product, Integer> count;

    void decreaseCount(Product product, int count) {
    }

    void restoreProduct(Product product, int count) {
    }

    boolean isAvailable(Product product, int count) {
        return false;
    }
}

// ----------------------------------------------------------------------------

// SAMPLE STATE MANAGEMENT:

// class VendingMachineStateManagementSample {

// MachineState state;
// Product selectedProduct;

// InventoryManagement inventoryManagement;
// PaymentManagementBetter paymentManagement;

// void selectProduct(String code) {

// if (state != MachineState.IDLE) {
// throw new IllegalStateException("Machine is busy");
// }

// // Product product = inventoryManagement.getProduct(code);

// if (!inventoryManagement.isAvailable(product, 1)) {
// throw new RuntimeException("Product unavailable");
// }

// selectedProduct = product;
// state = MachineState.AWAITING_PAYMENT;
// }

// void insertMoney(double amount) {

// if (state != MachineState.AWAITING_PAYMENT) {
// throw new IllegalStateException("Select product first");
// }

// paymentManagement.insertMoney(amount);

// if (paymentManagement.hasSufficientAmount(
// selectedProduct.Cost)) {

// dispenseProduct();
// }
// }

// void dispenseProduct() {

// state = MachineState.DISPENSING;

// inventoryManagement.decreaseCount(selectedProduct, 1);

// double change = paymentManagement.calculateChange(
// selectedProduct.Cost);

// // PaymentManagementBetter currently has no returnChange()
// // method in the original rough design, so this is left as a comment.
// // paymentManagement.returnChange(change);

// state = MachineState.IDLE;

// selectedProduct = null;
// }
// }

public class Main {
    public static void main(String[] args) {
        // Sample usage of the VendingMachineStateManagementSample class
        // VendingMachineStateManagementSample vendingMachine = new
        // VendingMachineStateManagementSample();

        // Initialize inventory and payment management (not shown in this rough design)
        // vendingMachine.inventoryManagement = new InventoryManagement();
        // vendingMachine.paymentManagement = new PaymentManagementBetter();

        // Example flow
        try {
            // vendingMachine.selectProduct("A1");
            // vendingMachine.insertMoney(2.00);
            // Assuming the product costs less than or equal to 2.00
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}