
public class Dog extends Pets{
	
	public Dog(String n,String ec,String br,String f,String s,int ag) {
		super(n,ec,br,f,s,ag);
	}
	
	public void printInfoD() {
		System.out.print(" "+ getName());
	}
	
	public void printDogs() {
		System.out.println("Name:" + getName() + " " + "Color of eyes: " + getEyeColor() + " " + "Breed: " + getBreed() + " " + "Color of fur: " + getFur() + " " + "Sex: " + getSex() + " " + "Age: " + getAge() );
	}
	

}
