public class WolfTest {

    public static void main(String[] args) {

        Wolf wolfone = new Wolf();

         wolfone.sex = "male";
         wolfone.name = "Grey";
         wolfone.age = 9;
         wolfone.weight = 27.5;
         wolfone.color = "green";

        System.out.println(wolfone.sex);
        System.out.println(wolfone.name);
        System.out.println(wolfone.age);
        System.out.println(wolfone.weight);
        System.out.println(wolfone.color);
        wolfone.seat();
        wolfone.run();
        wolfone.move();
        wolfone.haunt();
        wolfone.howl();
    }
}