package MySolusions.Cat;

public class Main {

    public static void main(String[] args) {
        Cat[] array = new Cat[2];
        Cat cat1 = new Cat("Burek");
        Cat cat2 = new Cat("Filemon");

        array[0] = cat1;
        array[1] = cat2;

        int mouses = 10;

        for(Cat element : array){
            element.print();
            element.makeSound();
            element.eatMouses(mouses++);
            System.out.println();
        }

        Cat cat3 = new Cat ("Bonifacy");
        System.out.println(cat3.getName());
        cat3.setName("puszek");
        System.out.println(cat3.getName());

    }
}
