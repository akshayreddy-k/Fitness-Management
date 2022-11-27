package pack2;
public class Meditation {
	String Meditation_type;
	String trainer_name;
	double duration;
	String location;
	int cost;
	public Meditation(String Meditation_type, String trainer_name, double duration, String location, int cost) {
		this.Meditation_type = Meditation_type;
		this.trainer_name = trainer_name;
		this.duration = duration;
		this.location = location;
		this.cost = cost;
	}
	public void show(){
		System.out.println("Meditation name ->"+Meditation_type);
		System.out.println("Trainer name ->"+trainer_name);
		System.out.println("Duration of the Meditation->"+duration);
		System.out.println("Location of the Meditation ->"+location);
		System.out.println("Cost per month->"+cost);
	}
}
