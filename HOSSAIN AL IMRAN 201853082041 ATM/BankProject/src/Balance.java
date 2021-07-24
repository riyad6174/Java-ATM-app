
public class Balance extends Deposit{
   private int bal;
   
   
   public Balance(){
   this.bal=0;
   }
   
   public Balance(int amount){
   
   DepositMoney(amount);
   }
   public int getBalance(){
            return bal;
   
   }
   public void DepositMoney(int amount){
   if(amount<0){
     
   }
   else{
   bal=bal+amount;
   }
   }
   public void withrawMoney(int withdrawAmount){
   
   if(bal>0){
       
       if(bal>withdrawAmount){
       
       bal=bal-withdrawAmount;
       
       }
       else{
           System.out.println("indsuff");
       }   
   }
   else{
       System.out.println("0 balance");
   }
   }
   
   
     
   
    
}
