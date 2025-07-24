interface TaxCalculator{
    double calculateTax(double amount);
}

class IndiaTaxCalculator implements TaxCalculator{
    public double calculateTax(double amount){
        return amount*0.18;
    }
}
class USTaxCalculator implements TaxCalculator {
    public double calculateTax(double amount) {
        return amount * 0.08; // Sales Tax
    }
}
class UKTaxCalculator implements TaxCalculator {
    public double calculateTax(double amount) {
        return amount * 0.12; // VAT
    }
}
class Invoice{
    private double amount;
    private TaxCalculator taxCalculator;

    public Invoice(double amount, TaxCalculator taxCalculator){
        this.amount = amount;
        this.taxCalculator = taxCalculator;
    }
    public double getTotalAmount(){
        return amount + taxCalculator.calculateTax(amount);
    }
}
public class OCP {
    public static void main(String[] args){
        double amount = 1000;

        Invoice indiaInvoice = new Invoice(amount, new IndiaTaxCalculator());
        System.out.println("Total(India): ₹" + indiaInvoice.getTotalAmount());

        Invoice usInvoice = new Invoice(amount, new USTaxCalculator());
        System.out.println("Total (US): $" + usInvoice.getTotalAmount());

        Invoice ukInvoice = new Invoice(amount, new UKTaxCalculator());
        System.out.println("Total (UK): £" + ukInvoice.getTotalAmount());
    }
}
