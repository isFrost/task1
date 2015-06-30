import java.util.List;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class Handler {

    public static List<Integer> handle (List<Integer> list){

        for (int i = 0; i < list.size(); i++){
            if (i + 2 < list.size() && i + 1 < list.size()&& list.get(i) == list.get(i + 1) && list.get(i + 1) == list.get(i + 2)){
                list.remove(i + 2);
                list.remove(i + 1);
                list.remove(i);
            }
        }
        return list;
    }

}
