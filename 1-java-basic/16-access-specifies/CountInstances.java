public class CountInstances{

   private static int numInstances=0;
   
   protected static int getNumInstances(){
	   
	   return numInstances;
	   
   }
   
   private static void addInstance(){
	   
	   numInstances++;
	   
   }
   
   CountInstances(){
	   
	   CountInstances.addInstance();
	   
	   
   }
   
   public static void main(String[]args){
	   
	   System.out.println("String with "+CountInstances.getNumInstances()+" Instances");
	   
	   for(int i=0;i<10;i++){
		   
		   new CountInstances();
		   
		   System.out.println("Created "+CountInstances.getNumInstances()+" instacnces");
		   
	   }
	   
   }

	
	
}