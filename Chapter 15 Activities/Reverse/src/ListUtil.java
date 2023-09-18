import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        int count = strings.size();
        while (count != 1)
        {
            String n = strings.getFirst();
            strings.removeFirst();
            strings.addLast(n);
            count--;
        } 
    }
}
