import java.util.LinkedList;
// second PROBLEM
//NAME & LASTNAME: REZWANULLAH QURAISHI
// STUDENT NO: 200316057

public class LinkedListMerge {
    public static void main(String[] args) {
        // Create LinkedList objects and add elements to them
        LinkedList<Integer> inputList1 = new LinkedList<>();
        inputList1.add(1);
        inputList1.add(2);
        inputList1.add(4);

        LinkedList<Integer> inputList2 = new LinkedList<>();
        inputList2.add(2);
        inputList2.add(3);
        inputList2.add(5);

        LinkedList<Integer> inputList3 = new LinkedList<>();
        inputList3.add(3);
        inputList3.add(6);

        // LinkedList<Integer> inputList4 = new LinkedList<>();
        // inputList4.add(9);
        // inputList4.add(8);

        // Call the mergeLinkedList method and store the merged list
        LinkedList<Integer> mergedList = mergeLinkedList(inputList1, inputList2, inputList3);

        // Print the merged list
        System.out.println(mergedList);
    }

    // we can use more than one parameter for each input by using ... operator
    public static LinkedList<Integer> mergeLinkedList(LinkedList<Integer>... linkedLists) {
        // Create a new LinkedList to store the merged list
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Merge all input LinkedLists into a single mergedList
        for (LinkedList<Integer> linkedList : linkedLists) {
            mergedList.addAll(linkedList);
        }

        // Sort the mergedList using bubble sort algorithm
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mergedList.size() - 1; i++) {
                if (mergedList.get(i) > mergedList.get(i + 1)) {
                    // Swap elements if they are out of order
                    temp = mergedList.get(i);
                    mergedList.set(i, mergedList.get(i + 1));
                    mergedList.set(i + 1, temp);
                    isSorted = false;
                }
            }
        }

        // Return the sorted merged list
        return mergedList;
    }
}
