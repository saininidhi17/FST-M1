package Activity2;
import java.util.Arrays;

class Activity4 {
    static void sort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
    	 System.out.println("Array before Ordering: ");
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println(Arrays.toString(data));
        sort(data);
        System.out.println("Array after sorting in ascending order: ");
        System.out.println(Arrays.toString(data));
    }
}