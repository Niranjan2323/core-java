class Phone{
	static String colour="black";
	static int price=50000;
	
 public static void getphonedetails(){
	 System.out.println("method with return type");
 }
 public static void getphonedetails(String colour){
	 System.out.println("colour:",colour);
 }
 public static int getprice(int price){
	 System.out.println("price:",price);
	 return price;
 }
}