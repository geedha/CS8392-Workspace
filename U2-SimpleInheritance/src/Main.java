class Vehicle{
	int id;
	boolean isRunning;
	boolean isOn;
	
	public void start(){
		this.isOn = true;
		System.out.println("Vehicle Started");
	}
	
	public void run(){
		if(this.isOn == true){
			this.isRunning = true;
			System.out.println("This Vehicle is Running");
		}
		else {
			System.out.println("Please Start the Vehicle -- Running Failed");
		}
	}
	
	public void stop(){
		if(this.isOn == true && this.isRunning == true){
		this.isRunning = false;
		this.isOn = false;
		System.out.println("Vehicle is Stoped from Running");
		}
		else {
			if(this.isOn == true){
				System.out.println("Vehicle is not running but now it's turned off");
				this.isOn = false;
			}
			else
				System.out.println("Vehicle not even turned on so no need to stop");
		}
	}
}
class Bicycle extends Vehicle{
	String owner;
	boolean isGeared;
	
	public Bicycle(){
		this.owner = "Rajasekaran";
		this.isGeared = true;
	}
	public void accelarate(){
		start();
		run();
		System.out.println("Started to Pedal");
	}
	public void horn(){
		System.out.println("Push the Bell Leaver");
	}
}
public class Main {
	public static void main(String[] args){
		Bicycle b = new Bicycle();
		b.accelarate();
		b.horn();
		b.stop();
	}
}