public class Main {
    public static void main(String[] args) {
        int[] mas = {1, 0, 0};
        int[] two = new int[mas.length];
        int cou = 0;

        for (int i = mas.length - 1; i >= 0; i--) {
            two[cou] = mas[i];
            cou++;
        }

        int step = 1;
        int a = 81 ;
        int res = 0;
        while(true){
            if (res == a){
                System.out.println("Искомое основание : "+step);
                break;
            }
            else {
                for (int i = mas.length - 1; i >= 0; i--) {
                    res += two[i] * pow(step, i);
                }
                if (res != a) {
                    step++;
                    res = 0;
                }
            }
        }
    }

    public static int pow(int value, int powValue) {

        int result = 1;

        for (int a = 1; a <= powValue; a++) {
            result = result * value;
        }
        return result;
    }
}
