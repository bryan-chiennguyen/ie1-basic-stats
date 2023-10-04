
public class MinMaxCalculation {
    ArrayList<Integer> numbers;

    public MinMaxCalculation() {
        numbers = ArrayList<Integer>();
    }

    public void add(int number) {
        numbers.add(number);
    }

    public int getMin() {
        if (numbers.length() == 0) {
            return -1;
        }
        int min_value = 100000;
        for (int num: numbers) {
            min_value = Math.min(min_value, num);
        }
        return min_value;
    }

    public int getMax() {
        if (numbers.length() == 0) {
            return -1;
        }
        int max_value = -100000;
        for (int num: numbers) {
            max_value = Math.max(max_value, num);
        }
        return max_value;
    }
}