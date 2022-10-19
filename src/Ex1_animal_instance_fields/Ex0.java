package Ex1_animal_instance_fields;

class Animal {
    public String greeting = "I'm an animal!";
}

class Cat extends Animal {
    public String greeting = "I'm a cat!";
}

class Ex1 {
    public static void main(String[] args) {
        // QUIZ: whats the output?
        //Animal cat = new Cat();
        //System.out.println(cat.greeting);
    }
}
