package Exams;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }

        double averageSum = 1.0 * sum / numberList.size();

        for (int i = 0; i < numberList.size(); i++) {

            if (numberList.get(i) > averageSum) {
                resultList.add(numberList.get(i));
            }
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);

        if (resultList.isEmpty()) {
            System.out.println("No");
        }
        while (resultList.size() > 5) {

            if (resultList.get(0) > resultList.size() - 1) {
                resultList.remove(resultList.size() - 1);
            }
        }
        for (Integer finalResult : resultList) {
            System.out.print(finalResult + " ");
        }
    }
}
