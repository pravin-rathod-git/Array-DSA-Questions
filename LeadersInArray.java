import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    // Function to find all leader elements in the array
    public static ArrayList<Integer> Leaders(int arr[]) {
        int n = arr.length;

        // The rightmost element is always a leader
        int leader = arr[n - 1];
        ArrayList<Integer> lead = new ArrayList<>();
        lead.add(leader);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            // If current element is greater than all elements to its right
            if (arr[i] > leader) {
                leader = arr[i];     // Update the current leader
                lead.add(leader);    // Add it to the list
            }
        }

        // Since leaders are collected from right to left, reverse the list
        Collections.reverse(lead);

        return lead;
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0};

        // Call the Leaders function
        ArrayList<Integer> result = Leaders(arr);

        // Print the leaders
        System.out.println("Leaders in the array are: " + result);
    }
}
