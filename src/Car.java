package car;


	class Car{
	    private String name;
	    private double fuel;
	    String color;
	    public void setName(String sname) {
	        name=sname;
	    }
	    public String getName() {
	           return name;
	    }
	   public  void setFuel(double sfuel) {
	            if(sfuel<0)
	            {
	                 System.out.print("´íÎó!ÇëÖØÐÂÊäÈë");
	            }
	            else  
	            {
	                   fuel=sfuel;
	            }
	   }
	    public double getFuel(){
	           return fuel;
	   }
	    public Car (){
	    
	   }
	   public Car(double x){
	           fuel=x;
	   }
	  public Car(double x,String y){
	          fuel=x;
	          name=y;
	   }
	  public Car(double x,String y,String z){
	          fuel=x;
	          name=y;
	          color=z;
	   }
	  public Car(String x,String y){
	         name=x;
	         color=y;
	   }
	}


