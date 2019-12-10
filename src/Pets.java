
public class Pets {
		
		String eyeColor; //zapuzdrenie
		String name;
		String breed;
		String fur;
		String sex;
		int age;
		boolean adopted = false; 
		
		public Pets(String n,String ec,String br,String f,String s,int ag) {//konstruktor+agregacia s triedou
			
			name=n;
			eyeColor=ec;
			breed=br;
			fur=f;
			sex=s;
			age=ag;
			
		}
		
		public String getName() { //getter
			return this.name;
		}
		
		public String getEyeColor() {
			return this.eyeColor; 
		}
		
		public String getBreed() {
			return this.breed;
		}
		
		public String getFur() {
			return this.fur;
		}
		
		public String getSex() {
			return this.sex;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public boolean getAdopted() { 
			return this.adopted;
		}

		public boolean setAdopted() { 
			return this.adopted=true;
		}

}
