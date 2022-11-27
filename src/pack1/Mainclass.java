package pack1;
import java.util.*;
import pack2.*;

class NewThread1 extends Thread  //For threads least priority is 0 .Highest priority is 10 
{
	NewThread1() 
	{
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); 
	}

	public synchronized void run()           
	{
		try 
		{
			System.out.println("System Started Processing.....Please Wait");
			for(int i = 5; i > 0; i--) 
			{
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} 
		catch (InterruptedException e)                        // For Every Match There Should be a catch.
		{
			System.out.println("Child interrupted.");
		}

		System.out.println("Exiting child thread.");
	}
}




public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
	    try
	    {
	    System.out.println("Enter your BMI");
	    String bmi="";
	    
	    bmi=sc.next();
	   for(int i=0;i<bmi.length();i++)
	    {
	    if((bmi.charAt(i)>='a' && (bmi.charAt(i)<='z')))
	//    if((bmi>="a" && (bmi.charAt(i)<='z')))
	    throw new CustomException("Enter valid Body Mass Index");
	    
	    }
	    }
	    catch(CustomException e) {
	    	System.out.println("Error caught"+e);
	    }
		
		Gym g[]=new Gym[5];
		Yoga y[]=new Yoga[5];
		Meditation med[]=new Meditation[7];
		
		g[0]=new Gym("GYM",10,2,"Yasmin_Karachiwala","Mumbai",10000000);
		g[1]=new Gym("GYM",10,3,"Satyajit Chaurasia","Mumbai",20000000);
		g[2]=new Gym("GYM",9,2,"Manish Advilkar","Delhi",10000000);
		g[3]=new Gym("GYM",9,1,"Prashant Sawant","Hyderabad",1000000);
		g[4]=new Gym("GYM",9,2,"Samir Jaura","Banglore",100000);
		
		y[0]=new Yoga("Yoga",10,1,"Baba Ramdev","Mumbai",1000000,1);
		y[1]=new Yoga("Yoga",9,2,"Paramahansa Yogananda","Mysore",100000,1);
		y[2]=new Yoga("Yoga",5,2,"Maharshi","Chennai",3000000,3);
		y[3]=new Yoga("Yoga",8,1,"Swami Sivananda","Banglore",500000,4);
		y[4]=new Yoga("Yoga",9,1,"Hansa ji","Hyderabad",2020000,1);
		
		med[0]=new Meditation("Spiritual Meditation","Sadhguru",1,"Chennai",3000000);
		med[1]=new Meditation("Mindfulness Meditation","Sri Sri Ravi Shankar",2,"Warangal",100000);
		med[2]=new Meditation("Movement Meditation","Ranveer",2,"Warangal",600000);
		med[3]=new Meditation("Focused Meditation","Sadhguru",3,"Hyderabad ",750000);
		med[4]=new Meditation("Visualization Meditation","Vivek",2,"Mysore",35000);
		med[5]=new Meditation("Chanting Meditation","Shilpa Shetty",2,"Manglore",150000);
		med[6]=new Meditation("Movement Meditation","Rishi",2,"Kerala",300000);
	
		int n1;
			do{   
				System.out.println("Enter 1 to join in Gym");
				System.out.println("Enter 2 to join in yoga center");
				System.out.println("Enter 3 to join in Meditation class");
				System.out.println("Enter 4 to exit");
				n1=sc.nextInt();
				if(n1==1) {
					while(true) {  
						System.out.println("Enter 1 to show results by Gym Trainers Ratings");
						System.out.println("Enter 2 to Show results by Cost");
						int n2=sc.nextInt();
						if(n2==1)
						{
						Gym.valuen(1);
						while(true) 
						{ 
						System.out.println("enter 1 for ascending order or 2 for descending order");
						int n3=sc.nextInt();
						if(n3==1) 
						{
					    Arrays.sort(g);
						for(int i=0;i<5;i++) 
						{
		     			System.out.println("Fitness INFO "+(i+1));
					    System.out.println();
						g[i].show();
	    				System.out.println();
						System.out.println();
						}	
						break; 
						}
						else if(n3==2)
						{
		    			Arrays.sort(g,Comparator.reverseOrder());
						for(int i=0;i<5;i++)
						{
				    	System.out.println("GYM "+(i+1));
						System.out.println();
						g[i].show();
						System.out.println();
						System.out.println();
						}
						break; 
						}
						else
						{
						System.out.println(n3+" is a wrong number!!");
						System.out.println("please enter 1 or 2");
						continue;  
						}
					    }
						break; 
						}
						else if(n2==2)
						{
						Gym.valuen(2);
						while(true) 
						{
								System.out.println("enter 1 for ascending order or 2 for descending order");
								int n3=sc.nextInt();	
								if(n3==1) {
									Arrays.sort(g);
									for(int i=0;i<5;i++) {
										System.out.println("Gym "+(i+1));
										System.out.println();
										g[i].show();
										System.out.println();
										System.out.println();
									}
									break; 
								}
								else if(n3==2) {
									Arrays.sort(g,Comparator.reverseOrder());
									for(int i=0;i<5;i++) {
										System.out.println("Gym "+(i+1));
										System.out.println();
										g[i].show();
										System.out.println();
										System.out.println();
									}	
									break;
								}
								else {
									System.out.println(n3+" is a wrong number!!");
									System.out.println("please enter 1 or 2");
									continue;
								}
							}
							break;
						}
						else 
						{
							System.out.println(n2+" is a wrong number!!");
							System.out.println("please enter 1 or 2");
							continue; 
						}
					}
				}
				else if(n1==2)
				{
					while(true)
					{
						System.out.println("enter 1 to show Yoga Centers by rattings of trainers");
						System.out.println("enter 2 to show Yoga Centers by cost per month ");
						int n2=sc.nextInt();
						if(n2==1) {
							Yoga.valuen(1);
							while(true) {
								System.out.println("enter 1 for ascending order or 2 for descending order");
								int n3=sc.nextInt();
								if(n3==1) {
									Arrays.sort(y);
									for(int i=0;i<5;i++)
									{
									System.out.println("Yoga Center "+(i+1));
									System.out.println();
									y[i].show();
									System.out.println();
									System.out.println();
									}	
									break;
								}
								else if(n3==2) {
									Arrays.sort(y,Comparator.reverseOrder());
									for(int i=0;i<5;i++)
									{
									System.out.println("Yoga Center "+(i+1));
									System.out.println();
									y[i].show();
									System.out.println();
									System.out.println();
									}
									break;
								}
								else {
									System.out.println(n3+" is a wrong number!!");
									System.out.println("please enter 1 or 2");
									continue;
								}
							}
							break;
					 	}
						else if(n2==2){
							Yoga.valuen(2);
							while(true) {
								System.out.println("enter 1 for ascending order or 2 for descending order");
								int n3=sc.nextInt();	
								if(n3==1)
								{
									Arrays.sort(y);
									for(int i=0;i<5;i++)
									{
									System.out.println("Yoga Center "+(i+1));
									System.out.println();
									y[i].show();
									System.out.println();
									System.out.println();
									}
									break;
								}
								else if(n3==2)
								{
									Arrays.sort(y,Comparator.reverseOrder());
									for(int i=0;i<5;i++) 
									{
									System.out.println("Yoga Center "+(i+1));
									System.out.println();
									y[i].show();
									System.out.println();
									System.out.println();
									}
									break;
								}
								else
								{
									System.out.println(n3+" is a wrong number!!");
									System.out.println("please enter 1 or 2");
									continue;
								}
							}
							break;
						}
						else
						{
						System.out.println(n2+" is a wrong number!!");
						System.out.println("please enter 1 or 2");
						continue;
						}
					}
				}
				else if(n1==3)
				{
					try
					{
						System.out.println("Enter how many Meditation Centers to show");
						int n2=sc.nextInt();
						for(int i=0;i<n2;i++)
						{
						System.out.println("Meditation Center "+(i+1));
						System.out.println();
						med[i].show();
						System.out.println();
						System.out.println();
						}
					}
				    catch(ArrayIndexOutOfBoundsException e){
				    	System.out.println(e);
				    	System.out.println("Only 7 Meditation centers are available for now");
				    }
				}
				else if(n1!=4){
					System.out.println(n1+" is a wrong number!!");
					System.out.println("please enter 1 or 2 or 3 or 4");
				}
			}
			while(n1!=4);
			sc.close();
			NewThread1 t = new NewThread1(); 
			try 
			{
			t.join();
				for(int i = 5; i > 0; i--) 
				{
					System.out.println("Main Thread: " + i);
					Thread.sleep(1000);
				}
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Main thread interrupted.");
			}
			
			System.out.println("Main thread exiting.");      //Parent thread should start executing after all the 
                                                            //child threads are killed.	
	}	
}