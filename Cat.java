public class Cat {
     public String name;
     public int age;
     public boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
        
    }
    void showCatInfo() {
        if(this.likesCuddles){
            System.out.println("This is " + this.name + " who is " + this.age + " and likes to cuddle!");
        }
        else{
            System.out.println("This is " + this.name + " who is " + this.age + " and doesnt like to cuddle!");
        }
      }
    }
    // System.out.printf("This is %s who is %s and likes to cuddle", this.name, this.age);
    // System.out.printf("This is %s who is %s and doesn't like cuddles", this.name, this.age);
    

