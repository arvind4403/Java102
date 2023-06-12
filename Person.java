public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Person alice=new Person("alice",25);
        Person bob = new Person("Bob",30);

        System.out.println("Person one");
        System.out.println("Name : "+ alice.getName());
        System.out.println("age : "+alice.getAge());

        System.out.println("Person second");
        System.out.println("Name : "+bob.getName());
        System.out.println("Age : "+bob.getAge());
        
    }

}
