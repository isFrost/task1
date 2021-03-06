import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class HandlerTest extends TestCase {

    public void testHandle() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);

        ArrayList<Integer> newList = (ArrayList)Handler.handle(list);
        assertEquals((int)newList.get(0), 3);
        assertEquals((int)newList.get(1), 2);
        assertEquals((int)newList.get(2), 1);
    }
}