import java.io.*;

class bubbleSort {

    public static void main(String args[]){
        int ArrayList[] = {4,3,7,2,9,11,1,8};
        printList(ArrayList);
        SortBubble(ArrayList);
        System.out.print("1\n");
        printList(ArrayList);

    }

    public static void SortBubble (int[] list){
       int length =  list.length;
       for (int i=0; i < length -1; i++){
       boolean swapFlag = false;
       for (int j=0; j< length-i-1; j++){

            if (list[j] > list[j+1]){
                int Temp = list[j];
                list[j] = list[j+1];
                list[j+1] = Temp;
                System.out.println("Two numbers" + list[j] +"and" + list[j+1] + "swap.\n");
                swapFlag = true;
            }
       }
        printList(list);
        if (swapFlag == false)
           break;
        }
    }//SortBubble end
    
    public static void printList (int[] list){
        int len = list.length;
        for (int i=0; i<=len-1; i++){
            System.out.print(list[i] + " ");
        }
         System.out.print("\n");
    }
}
