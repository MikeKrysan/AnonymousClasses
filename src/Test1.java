public class Test1 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//
//        Animal animal2 = new Animal() {
//            public void eat(){
//                System.out.println("Animal2 is eating");
//            }
//        };
//        animal2.eat();

//        Animal1 animal = new Animal1();
//        animal.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone animal is eating...");
            }
        };
        ableToEat.eat();
    }
}

//class Animal {
//    public void eat() {
//        System.out.println("Animal is eating");
//    }
//}

interface AbleToEat1 {
    public void eat();
}

//class Animal1 implements AbleToEat1 {
//    @Override
//    public void eat() {
//        System.out.println("I can eat...");
//    }
//}