public class Wolf {

    private String sex;
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean seat() {
        System.out.println("sitting");
        return true;
    }

    public boolean run() {
        System.out.println("running");
        return true;
    }

    public boolean move() {
        System.out.println("moving");
        return true;
    }

    public boolean haunt() {
        System.out.println("haunting");
        return true;
    }

    public boolean howl() {
        System.out.println("howling");
        return true;
    }
}