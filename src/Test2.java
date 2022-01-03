public class Test2 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//
//        Animal animal2 = new Animal() {
//            public void eat() {
//                System.out.println("Animal2 is eating...");
//            }
//        };
//        animal2.eat();

//        Animal ableToEat = new Animal();
//        ableToEat.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("AnimalFromInterface is eating...");
            }
        };
        ableToEat.eat();
    }
}

//class Animal {
//    public void eat() {
//        System.out.println("Animal is eating...");
//    }
//}

interface AbleToEat3 {
    public void eat();
}

//class Animal implements AbleToEat3 {
//    @Override
//    public void eat() {
//        System.out.println("I can eat...");
//    }
//}