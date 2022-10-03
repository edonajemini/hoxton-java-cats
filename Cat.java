public class Cat {
        String name;
        int age;
        boolean likesCuddles;

// void likescuddles(){
//     if(likesCuddles == true){
//         System.out.println(this + "likes cuddles");
//     }else {
//         System.out.println(this + "doesnt like cuddles");
//     }
// }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Muff";
        cat.age = 2;
        cat.likesCuddles = true;
        System.out.println("This is " + cat.name + "who is " + cat.age );
    }
    
}
