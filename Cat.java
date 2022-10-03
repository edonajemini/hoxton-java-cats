public class Cat {
        String name;
        int age;
        boolean likesCuddles;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Muff";
        cat.age = 2;
        if(cat.likesCuddles = true){
            System.out.println("This is " + cat.name + "who is " + cat.age + "and likes to cuddle");
        }
        else{
            System.out.println("This is " + cat.name + "who is " + cat.age + "and doesnt like to cuddle");
        }
    }
    
}
