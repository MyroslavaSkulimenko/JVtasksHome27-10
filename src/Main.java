public class Main {
    public static void main(String[] args) {
        /*   private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String position;
Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
а также метод  public String getFullName().*/
        Human human1= new Human("Orlov","Vitas",26,"m","IT");
        Human human2= new Human("Marina","Volkova",28,"f","JV");
        Human human3= new Human("Eva","Socol",31,"f","IT");
        System.out.println(human1.getFullName());
        System.out.println(human2.getFullName());
        System.out.println(human3.getFullName());

    }
}