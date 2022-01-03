public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.eat();
//
//        Animal animal2 = new Animal() { //Создали анонимный класс. Можем использовать объект этого класса только один раз и можем сослать только на одну переменную (1)
//            public void eat() {
//                System.out.println("Other animal is eating...");
//            }
//        };
//
//        animal2.eat();


//        AbleToEat ableToEat = new Animal(); //Создаем объект класса Animal, сослав его на interface
//        ableToEat.eat();


        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
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

interface AbleToEat {
    public void eat();
}

//class Animal implements AbleToEat {
//    @Override
//    public void eat() {
//        System.out.println("I can eat");
//    }
//}

/*
1. Созданный в анонимном классе объект - это не объект класса Animal, а его наследник
 */