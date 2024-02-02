/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author ASUS
 */
public class Stock {
        //sales product
    private int id1;
    private String cashname;
    private String date;
    private String product_id;
    private String pname;
    private String type;
    private int sell;
    private int qty;
    private int total;
    private int net;
    
 
    
    
        public Stock(int id1,String cashname,String Date,String Proid,String pname,String type,int sell,int qty,int total,int net)
    {

    //sales product
        this.id1 = id1;
        this.cashname = cashname;
        this.date = Date;
        this.product_id = Proid;
        this.pname = pname;
        this.type = type;
        this.sell = sell;
        this.qty = qty;
        this.total = total;
        this.net = net;
      
}
        public int getid1()
    {
        return id1;
    }
        public String gettype(){
            return type;
        }
          public String getcashname(){
            return cashname;
        }
        public String getProid()
    {
        return product_id;
    }
    public String getpname()
    {
        return pname;
    }
    public int getsell()
    {
        return sell;
    }
    public int getqty()
    {
        return qty;
    }
    public int gettotal()
    {
        return total;
    }
   public int getnet()
 {
      return net;
   }
       public String getDate()
    {
        return date;
    }
       
          //History
    private int id2;
    private String barcode;
    private String product;
    private String date2;
    private int quantity;
    
    public Stock(int id2,String barcode,String product, String date2, int quantity){
        this.id2 = id2;
        this.product = product;
        this.date2 = date2;
        this.quantity = quantity;
        this.barcode = barcode;
        
    }
    public int getid2(){
        return id2;
    }
    public String getbarcode(){
        return barcode;
    }
    
    public String getproduct(){
        return product;
    }
    public String getdate2(){
        return date2;
    }
    public int getquantity(){
        return quantity;
    }
    
    //product
    
    private int id;
    private String prod; 
    private int cost;
    private int whole;
    private int retail;
    private int qty2;
    private String barcode2;
    
    public Stock(int id, String prod, int cost, int whole, int retail, int qty2, String barcode2){
        
        this.id = id;
        this.prod = prod;
        this.cost = cost;
        this.whole = whole;
        this.retail = retail;
        this.qty2 = qty2;
        this.barcode2 = barcode2;
                
    }
    public int getid(){
        return id;
    }
  
    public String getprod(){
        return prod;
    }
    public int getcost(){
        return cost;
    }
    public int getwhole(){
        return whole;
    }
    public int getretail(){
        return retail;
    }
    public int getqty2(){
        return qty2;
    }
    public String getbarcode2(){
        return barcode2;
    }
    
    ///////////////////////////////////////print
    
    private int proid;
    private String prod2;
    private int qty3;
    private String bar2;
    
    public Stock(int proid, String prod2, int qty3, String bar2){
        this.proid = proid;
        this.prod2 = prod2;
        this.qty3 = qty3;
        this.bar2 = bar2;
    }
    
     public int getproid(){
        return proid;
    }
     public String getprod2(){
         return prod2;
     }
     public int getqty3(){
         return qty3;
         
     }
     public String getbar2(){
         return bar2;
     }
     
     
     
     /////////// private sale
    private String date3;
    private String customer_name;
    private String product_id2;
    private String proname;
    private int cost2;
    private int quantity2;
    private int total2;
    
    public Stock(String date3, String customer_name,String product_id2,String proname, int cost2,int quantity2, int total2){
        this.date3 = date3;
        this.customer_name = customer_name;
        this.product_id2 = product_id2;
        this.proname = proname;
        this.cost2 = cost2;
        this.quantity2 = quantity2;
        this.total2= total2;
        
    }
    public String getdate3(){
        return date3;
    }
     public String getcustomer_name(){
        return customer_name;
    }
      public String getproduct_id2(){
        return product_id2;
    }
       public String getproname(){
        return proname;
    }
         public int getcost2(){
         return cost2;
         
     }
           public int getquantity2(){
         return quantity2;
         
     }
             public int gettotal2(){
         return total2;
         
     }
             
             ///payment
            private int id4;
            private String date4;
            private String custom;
            private String total4;
            
       public Stock(int id4,String date4, String custom, String total4){
        this.id4 = id4;
           this.date4 = date4;
           this.custom = custom;
           this.total4 = total4;
       }
          public String getdate4(){
        return date4;
    }
      public String getcustom(){
        return custom;
    }
           public String gettotal4(){
        return total4;
    }
          
                public int getid4(){
        return id4;
    }
       //////////////customer Payment
                
                  ///payment
           // private int id5;
            private String date5;
            private String pretotal;
            private String dateoftrans;
             private String customer2;
             private int pay;
            
       public Stock(String date5, String pretotal, String dateoftrans, String customer2, int pay){
       // this.id5 = id5; int id5,
           this.date5 = date5;
           this.pretotal = pretotal;
           this.dateoftrans = dateoftrans;
           this.customer2 = customer2;
           this.pay = pay;
       }
          public String getdate5(){
        return date5;
    }
      public String getpretotal(){
        return pretotal;
    }
           public String getdateoftrans(){
        return dateoftrans;
    }
                public String getcustomer2(){
        return customer2;
    }
          
         /*       public int getid5(){
        return id5;
    }*/
              public int getpay(){
        return pay;
    }
       
}
