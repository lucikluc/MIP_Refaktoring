import java.util.ArrayList;
import java.util.List;

public class Tulko {
	ArrayList<Cat> cats = new ArrayList<>();
    ArrayList<Dog> dogs= new ArrayList<>();//pretazenie konstruktorov
	 boolean c=false;
	
	public Tulko() {
		this.cats.add(new Cat("Lucifer","Blue","Persian","Yes","Male",2));
		this.cats.add(new Cat("Blacky","Yellow","Bombay","Yes","Male",1));
		this.cats.add(new Cat("Cleo","Yellow","Egyptian","Yes","Female",4));
		this.cats.add(new Cat("Meowy","Green","Himalayan","Yes","Female",1));
		this.cats.add(new Cat("Pawtie","Blue","Peterbald","No","Female",5));
		this.cats.add(new Cat("Blue","Blue","Russian","Yes","Male",2));
		this.cats.add(new Cat("Josephyn","Black","Sphynx","None","Female",3));
		this.cats.add(new Cat("Simi","Brown","Siamese","None","Female",8));
		
		this.dogs.add(new Dog("Sunny","Brown","Labrador","Yellow","male",1));
		this.dogs.add(new Dog("Brownie","Brown","German shepherd","Brown","male",5));
		this.dogs.add(new Dog("Cutie","Brown","Golden retriever","Yellow","female",2));
		this.dogs.add(new Dog("Frenchie","Brown","French bulldog","white","female",3));
		this.dogs.add(new Dog("Blue","Blue and Brown","Husky","Black and White","male",2));
		this.dogs.add(new Dog("Dusty","Brown","Rottweiler","Black and Brown","male",6));
		this.dogs.add(new Dog("Buddy","Brown","Moscow watchdog","Brown and White","male",7));
		this.dogs.add(new Dog("Lilly","Brown","Yorkshire terrier","Brown and Black","female",2));
		this.dogs.add(new Dog("Hachiko","Brown","Akita inu","Orange and White","male",8));
		this.dogs.add(new Dog("Lucky","Brown","Sausage dog","Light Orange","male",8));
		
	}

	void infoD() {
		for (Dog dog: dogs) {
			dog.printInfoD();
		}
	}
	
	void printD() {
		for (Dog dogs: getDogs()) {
			if(dogs.getAdopted() == false) {
				dogs.printDogs(); 
			}
			
		}
	}
	
	void printC() {
		for (Cat cat: cats) {
			if(cat.getAdopted() == false) {
				cat.printCats();
			}
		}
	}
	
	public List<Dog> getDogs() {
		return dogs;
	}
	
	public List<Cat> getCats(){
		return cats;
	}
	
	String adoptDog(String name){
		for(Dog dogs:getDogs()) {
			if(dogs.getName().equals(name)) {
				dogs.setAdopted();
				return dogs.getName();
			}
		}
		return null;
	} 
	
	String adoptCat(String catname) {
		for(Cat cats:getCats()) {
			if(cats.getName().equals(catname)) {
				cats.setAdopted(); 
				return cats.getName();
			}
		}
		return null;
	}

}