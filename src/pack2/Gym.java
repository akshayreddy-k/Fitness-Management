package pack2;


public class Gym extends Display {
	public Gym(String fitness_type,int trainer_rating,double duration,String trainer_name,String location,int cost){
		super(fitness_type,trainer_rating,duration,trainer_name,location,cost);
	}
	public void show() {
		System.out.println("Fitness Type ->"+fitness_type);
		System.out.println("Trainer ratings ->"+trainer_rating);
		System.out.println("duration of an exercise ->"+duration);
		System.out.println("Trainer's name ->"+trainer_name);
		System.out.println("location ->"+location);
		System.out.println("cost per month->"+cost);
	}
	public static void valuen(int k) {
		n=k;
	}
	
	@Override
	public int compareTo(Display o) {
		if(n==1) {
			return this.trainer_rating-o.trainer_rating;
		}
		else if(n==2) {
			return this.cost-o.cost;
		}
		else return 0;
	}
}