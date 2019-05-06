import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] vector = new int[]{8, 4, 9,1, 2, 222};
	    int n = vector.length;
	    int x = 96;
	    boolean gasit = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                if (vector[j] > vector[j+1]){
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }

        int start = 0;
        int end = n - 1;

        while (end >= start){
            int mid = start + (end - start) / 2;

            if (vector[mid] == x){
                System.out.println(x + " se afla pe pozitia " + mid);
                gasit = true;
                break;
            }else if (vector[mid] < x){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        if (gasit == false){
            System.out.println(x + " nu se afla in vector!");
        }

        System.out.println(Arrays.toString(vector));
    }
}
