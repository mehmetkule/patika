import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // create an array
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 20, 5, 20));

        // call printFrequency method
        printFrequency(list);
    }

    static  int[] frequency(List<Integer> arr){
        int[] fr = new int[arr.size()];
        int visited = -1;
        // initialize the frequency of all elements to 0
        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            // check if the element is visited
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)){
                    count++;
                    fr[j] = visited;
                }
            }
            // check if the frequency of the current element is not count
            if(fr[i] != visited){
                fr[i] = count;
            }
        }
       return fr;
    }


    static void printFrequency(List<Integer> arr){
        int[] fr = frequency(arr);
        int visited = -1;
        // traverse the array
        for (int i = 0; i < fr.length; i++) {
            // check if the frequency of the current element is not count
            if(fr[i] != visited){
                System.out.println(arr.get(i) + " number repeated  " + fr[i] + " times.");
            }
        }
    }


}