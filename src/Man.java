public class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Man man = new Man(23);
        String securityAnswer = (man.getAge() >= 18)? "you are of legal age" : "you are not of legal age";
        System.out.println(securityAnswer);


    }}


