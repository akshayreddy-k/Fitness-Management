package pack2;
public class Yoga extends Display {
	public int batch_no;
	public Yoga(String fitness_type,int trainer_rating,double duration,String trainer_name,String location,
			int cost,int batch_no){
		super(fitness_type,trainer_rating,duration,trainer_name,location,cost);
		this.batch_no=this.batch_no;
		
	}
	public void show() {
		System.out.println("Yoga name ->"+fitness_type);
		System.out.println("Rating of the Trainer ->"+trainer_rating);
		System.out.println("Yoga duration ->"+duration);
		System.out.println("Yoga Instructor name ->"+trainer_name);
		System.out.println("yoga Location ->"+location);
		System.out.println("Cost per month->"+cost);
		System.out.println("Batch number ->"+batch_no);
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