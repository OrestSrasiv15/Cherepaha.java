package Cherepaha;

public class Cherepaha {
	
	public String name;
	public int speed;
	public int vaga;
	private int size;
	private int price;
	protected int type;
	protected String color;
	static int location = 0;
	
	
	void Setname(String Name) {
		name= Name;
	}
	void Setspeed(int Speed) {
		speed=Speed;
	}
	
	void Setvaga(int Vaga) {
		vaga= Vaga;
	}
	void Setsize(int Size) {
		size=Size;
	}
		void Setprice(int Price) {
			price=Price;
	}
		void Settype(int Type) {
			type=Type;
	}
		void Setcolor(String Color) {
			color=Color;
		}
		
		
	String getName() {
		return name;
	}
	int getSpeed() {
		return speed;
	}
	int getVaga() {
		return vaga;
	}
	int getSize() {
		return size;
		}
	int getPrice() {
		return price;
	}
	int getType() {
		return type;
	}
	String getColor() {
		return color;
	}
	public Cherepaha(String name , int speed , int vaga) {
		Setname(name);
		Setspeed(speed);
		Setvaga(vaga);
		
	}
	public Cherepaha (String name , int speed , int vaga , int size , int price ,int type , String color ) {
		Setname(name);
		Setspeed(speed);
		Setvaga(vaga);
		Setsize(size);
		Setprice(price);
		Settype(type);
		Setcolor(color);
	}
		void printStaticLocation() {
			System.out.println("Location - " + location);
		
			
		
	}
		void printLocation() {
			System.out.println("Location - " + location);
		}
		
		 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	
	public static void main(String[] args) {
		Cherepaha Aha = new Cherepaha("   Аха",50 ,25);
	   System.out.println("Name -" + Aha.getName());
	   System.out.println("Weight -" + Aha.getVaga()+ "    " + "gr");
	   System.out.println("Speed -" + Aha.getSpeed() + "    " + "km/h");
	   System.out.println("Location" +Aha.toString());
	   
	   Cherepaha back = new Cherepaha("   back",55 ,30);
	   System.out.println("Name -" + back.getName());
	   System.out.println("Weight -" + back.getVaga()+ "    " + "gr");
	   System.out.println("Speed -" + back.getSpeed() + "    " + "km/h");
	   
	   Cherepaha Up = new Cherepaha("   Up",60,35);
	   System.out.println("Name -" + Up.getName());
	   System.out.println("Weight -" + Up.getVaga()+ "    " + "gr");
	   System.out.println("Speed -" + Up.getSpeed() + "    " + "km/h");
	   
	   Cherepaha Jorik = new Cherepaha("   Jorik",65 ,40);
	   System.out.println("Name -" + Jorik.getName());
	   System.out.println("Weight -" + Jorik.getVaga()+ "    " + "gr");
	   System.out.println("Speed -" + Jorik.getSpeed() + "    " + "km/h");
	   
	   Cherepaha Jessi = new Cherepaha("   Jessi",70 ,45);
	   System.out.println("Name -" + Jessi.getName());
	   System.out.println("Weight -" + Jessi.getVaga()+ "    " + "gr");
	   System.out.println("Speed -" + Jessi.getSpeed() + "    " + "km/h");
	   
	  
	}
	

}
