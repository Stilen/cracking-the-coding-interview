package chapter3;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;


//Problem 3.6 - Animal Shelter
public class AnimalShelter {
	
	public enum Type { CAT, DOG };
	
	private Queue<Animal> dogs = new LinkedList<Animal>();
	private Queue<Animal> cats = new LinkedList<Animal>();
	
	public void newAnimal(Animal animal) {
		if(animal.type == Type.CAT) cats.add(animal);
		else dogs.add(animal);
	}
	
	public Animal dequeueAny() {
		if(dogs.isEmpty()) return cats.poll();
		if(cats.isEmpty()) return dogs.poll();
		
		if(dogs.peek().getArrivalDate().before(cats.peek().getArrivalDate()))
			return dogs.poll();
		else return cats.poll();
	}
	
	public Animal dequeueCat() {
		return cats.poll();
	}
	
	public Animal dequeueDog() {
		return dogs.poll();
	}
	
	
	public class Animal {
		private Type type;
		private Date arrived;
		
		public Animal(Type type) {
			this.type = type;
			this.arrived = new Date();
		}
		
		public Type getType() {
			return type;
		}

		public Date getArrivalDate() {
			return arrived;
		}

		
	}
}
