import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Pen pen0 = new Pen("pr1", "red", "pink", 15);
        Pen pen1 = new Pen("pr2", "green", "yellow", 20);
        Pen pen2 = new Pen("Pr3", "blue", "green", 25);
        Pen pen3 = new Pen("Pr4", "red", "green", 27);
        Pen pen4 = new Pen("Pr5", "blue", "green", 22);

        List<Pen> pensList = new ArrayList<Pen>();//размер не указывается, расширяется сам если нужно

        pensList.add(pen0);
        pensList.add(pen1);
        pensList.add(pen2);
        pensList.add(pen3);
        pensList.add(pen4);

        System.out.println("List");
        for (Pen pen : pensList) {
            System.out.println(pen);
        }

        System.out.println(pensList);

//        pensList.clear();
//
//        System.out.println("List");
//        for (Pen pen: pensList) {
//            System.out.println(pen);
//        }
        System.out.println("=========================================================");
        System.out.println(pensList.get(2));

//        pensList.remove(2);
//
//        System.out.println(" Deleted List");
//        for (Pen pen: pensList) {
//            System.out.println(pen);
//        }
        System.out.println("size:");
        System.out.println(pensList.size());

//        pensList.set(2, new Pen("1","2","3", 3));
//        System.out.println(" Deleted List");
//        for (Pen pen: pensList) {
//            System.out.println(pen);
//        }

//        System.out.println("Pens Array");
//        Pen[] pensArray = (Pen[]) pensList.toArray();
//        for (int i = 0; i < pensArray.length; i++) {
//            System.out.println(pensArray[i]);
//        }

//        System.out.println("Collection not empty");
//        System.out.println(pensList.isEmpty());

        System.out.println("Get sublist");
        System.out.println(pensList.subList(2,5));

    }
}
