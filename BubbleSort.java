public class BubbleSort {
    public static void main (String args[]){
        int[] array = {-8,-10,0,1,-50,-1,-23};
        for (int i = 0 ; i < array.length ; i++ ){
            for (int j = 0 ; j < array.length-i-1 ; j++){
                if(array[j] >  array[j+1]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}