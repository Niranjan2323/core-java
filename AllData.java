class AllData {
  public static void main(String[]args){

   System.out.println("welcome to train System");
   byte result = trainSpeed((byte)70,(byte)60);
   System.out.public("Returned speed value:" + result);


   System.out.println("Welcome to Car System");

        byte result = carSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
		
		
   System.out.println("Welcome to Ambulance System");

        byte result = ambulanceSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
		
		
		
   System.out.println("Welcome to KTM Bike System");

        byte result = bikeSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
 
   System.out.println("Welcome to Airplane System");

        byte result = airplaneSpeed((byte)90, (byte)80);

        System.out.println("Returned speed value: " + result);
    		
}
}