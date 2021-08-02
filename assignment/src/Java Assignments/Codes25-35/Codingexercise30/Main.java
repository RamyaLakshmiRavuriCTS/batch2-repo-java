import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Box> boxSet = new HashSet<>();
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        System.out.println("Enter the number of Boxes");
        int boxes = scanner.nextInt();
        for (int i = 0; i < boxes; i++) {
            Box box = new Box();
            System.out.println("Enter Box "+(i+1)+" Details");
            System.out.println("Enter Length");
            box.setLength(scanner.nextDouble());
            System.out.println("Enter Width");
            box.setWidth(scanner.nextDouble());
            System.out.println("Enter Height");
            box.setHeight(scanner.nextDouble());
            boxSet.add(box);
        }
        System.out.println("Unique Boxes in the Set are");
        for (Box box : boxSet) {
            System.out.println("Length=" + box.getLength() + " Width=" + box.getWidth() + " Height=" + box.getHeight() + " Volume=" + decimalFormat.format(box.volume()));
        }
    }
}