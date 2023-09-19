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
        int left = 0;
        int right = strings.size() - 1;

        while (left < right) 
        {
            String temp = strings.get(left);
            strings.set(left, strings.get(right));
            strings.set(right, temp);
            left++;
            right--;
        }
    }
}
