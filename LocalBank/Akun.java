package LocalBank;

public class Akun {
   private double balance;

   public Akun(double init__balance) {
      balance = init__balance;
   }

   public double getBalance() {
      return this.balance;
   }

   public Boolean Deposit(double amount) {
      if (amount > 0) {
         this.balance += amount;

         System.out.println("Deposit done successfully!");

         return true;
      } else {
         System.out.println("You cannot deposit amounts that are equal to or less than 0!");

         return false;
      }
   }

   public Boolean withdrawal(double amount) {
      if (this.balance > amount) {
         this.balance -= amount;

         System.out.println("Withdrawal done successfully!");

         return true;
      } else {
         System.out.println("Balance insufficient to perform withdrawal...");

         return false;
      }
   }
}