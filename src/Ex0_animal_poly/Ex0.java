package Ex0_animal_poly;

class Animal {
    public void speak() {
        System.out.println("I'm an animal!");
    }
}

class Cat extends Animal {

    // Overrides method in base class.
    public void speak() {
        System.out.println("I'm a cat!");
    }
}

class Ex0 {
    public static void main(String[] args) {
        // QUIZ: whats the output?
        //Animal cat = new Cat();
        //cat.speak();
    }
}


