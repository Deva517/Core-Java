// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class canteen{
    public static void main(String[] args) {
        System.out.println("                                College Canteen                                              ");
        System.out.println("                             ********************                                            ");
        int dosap=20;
        int purip=15;
        int idlip=30;
        int vadap=20;
        int mealsp=100;
        int biriyanip=120;
        int chapathip=50;
        int teasamosap=30;
        int sandwichp=40;
        int biscuitsp=10;
        int price=0;
        int quan=0;
        String selected="";
        Scanner sc=new Scanner(System.in);
          
          System.out.println("select what u want (Enter number)");
          System.out.println("1.Tiffins || 2.Lunch || 3.Snacks" );

        int choice=sc.nextInt();
        switch(choice){
            case 1:
                selected="Tiffins";
                System.out.println("Select the item(Enter number) : ");
                System.out.println("1.Dosa || 2.puri || 3.idli || 4.vada");
                int tiffin=sc.nextInt();
                System.out.println("Enter quantity of items");
                int quan1=sc.nextInt();
                quan+=quan1;
                if(tiffin==1){
                     price+=quan*dosap;
                }
                else if(tiffin==2){
                    price+=quan*purip;
                }
                else if(tiffin==3){
                    price+=quan*idlip;
                }
                else if(tiffin==4){
                    price+=quan*vadap;
                }
                else{
                    System.out.println("Enter valid number");
                }
                break;

            case 2:
                selected="Lunch";
                System.out.println("Select the item(Enter number) : ");
                System.out.println("1.Meals||2.Biriyani||3.Chapathi");
                int lunch=sc.nextInt();
                System.out.println("Enter quantity of items");
                 int quan2=sc.nextInt();
                 quan+=quan2;
                if(lunch==1){
                     price+=quan*mealsp;
                }
                else if(lunch==2){
                    price+=quan*biriyanip;
                }
                else if(lunch==3){
                    price+=quan*chapathip;
                }
               
                else{
                    System.out.println("Enter valid number");
                }
                break;

            case 3:
                selected ="snacks";
                System.out.println("Select the item(Enter number) : ");
                System.out.println("1.teasamosa||2.biscuits||3.sandwich");
                int snacks=sc.nextInt();
                System.out.println("Enter quantity of items");
                 int quan3=sc.nextInt();
                 quan+=quan3;
                if(snacks==1){
                     price+=quan*teasamosap;
                }
                else if(snacks==2){
                    price+=quan*biscuitsp;
                }
                else if(snacks==3){
                    price+=quan*sandwichp;
                }
               
                else{
                    System.out.println("Enter valid number");
                }
                break;   
                
        }

        
         int initalprice=price;

         System.out.println("Enter if you Need water bottle? 1.Yes || 2.No");
        int bottle=sc.nextInt();
        if(bottle==1){
            price=price+20;
        }
        System.out.println("*************************************     BILL    *********************************************");
        System.out.println("Selected Item:"+selected);
        System.out.println("Quantity of Items:"+quan);
        System.out.println("price:"+initalprice);
           if(bottle==1){
             System.out.println("selected one water bottle , price=20");
           }
           else{
             System.out.println("No water bottle selected");
           }
        System.out.println("total price:"+price);
        

        
        
        
       
    }
}