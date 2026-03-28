class VehicleSpeed {
  public static void main(String[]args){

   System.out.println("welcome to train System");
   byte result = Train.trainSpeed((byte)70,(byte)60);
   System.out.println("Returned speed value:" + result);


   System.out.println("Welcome to Car System");

        byte result =Car. carSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
		
		
   System.out.println("Welcome to Ambulance System");

        byte result =ambulance.ambulanceSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
		
		
		
   System.out.println("Welcome to KTM Bike System");

        byte result = KTMBick. bikeSpeed((byte)70, (byte)50);

        System.out.println("Returned speed value: " + result);
 
   System.out.println("Welcome to Airplane System");

        byte result = Airplane.airplaneSpeed((byte)90, (byte)80);

        System.out.println("Returned speed value: " + result);
    		
}
}