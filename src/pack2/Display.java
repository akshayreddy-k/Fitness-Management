package pack2;

public abstract class Display implements Comparable<Display> {
	public String fitness_type;
	public int trainer_rating;
	public double duration;
	public String trainer_name;
	public String location;
	public int cost;

	protected static int n;
	public Display() 
	{
		this.fitness_type=" ";
		this.trainer_rating= 0;
		this.duration= 0;
		this.trainer_name= " ";
		this.location=" ";
		this.cost=0;

	}
	public Display(String fitness_type,int trainer_rating,double duration,String trainer_name,String location,int cost)
	{
		this.fitness_type= fitness_type;
		this.trainer_rating= trainer_rating;
		this.duration= duration;
		this.trainer_name= trainer_name;
		this.location=location;
		this.cost= cost;
	}
	abstract void show();
}