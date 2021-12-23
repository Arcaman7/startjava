public class WolfTest {

    public static void main(String[] args) {

        Wolf wolfone = new Wolf();

         wolfone.setSex("male");
         wolfone.setName("grey");
         wolfone.setAge(9);
         wolfone.setWeight(27.5);
         wolfone.setColor("green");

        System.out.println(wolfone.getSex());
        System.out.println(wolfone.getName());
        System.out.println(wolfone.getAge());
        System.out.println(wolfone.getWeight());
        System.out.println(wolfone.getColor());
        wolfone.seat();
        wolfone.run();
        wolfone.move();
        wolfone.haunt();
        wolfone.howl();
    }
}