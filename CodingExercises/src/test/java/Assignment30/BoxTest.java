package Assignment30;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box box1 = new Box(2.1, 1.2, 2.1);
        Box box2 = new Box(3.2, 2.3, 3.2);
        Box box3 = new Box(1.2, 2.1, 1.2);
        Box box4 = new Box(3.2, 2.3, 3.2);
        Box box5 = new Box(3.3, 2.2, 1.1);

        box1.addBoxToSet();
        box2.addBoxToSet();
        box3.addBoxToSet();
        box4.addBoxToSet();
        box5.addBoxToSet();

        Box.displayUniqueBoxes();

    }
}