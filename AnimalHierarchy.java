class Animal{
	String name;
	int age;
	
	void makeSound(){
		System.out.println("Sound.....");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("barking.....");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("meow meow.....");
	}
}

class Bird extends Animal{
	void makeSound(){
		System.out.println("chirping....");
	}
}

//Main class
class AnimalHierarchy{
	public static void main(String[] args){
		
		//creating objects
		Animal obj = new Animal();
		Animal obj1 = new Dog();
		Animal obj2 = new Cat();
		Animal obj3 = new Bird();
		
		//displaying functions
		obj.makeSound();
		obj1.makeSound();
		obj2.makeSound();
		obj3.makeSound();
	}
}