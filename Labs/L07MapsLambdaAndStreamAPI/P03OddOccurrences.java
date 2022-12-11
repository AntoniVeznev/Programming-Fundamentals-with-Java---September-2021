package Labs.L07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.toLowerCase().split(" ")).collect(Collectors.toList());
        List<String> resultList = new ArrayList<>();
        Map<String, Integer> allData = new LinkedHashMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            String currentWord = inputList.get(i);

            if (!allData.containsKey(currentWord)) {
                allData.put(currentWord, 1);

            } else {
                int currentCount = allData.get(currentWord);
                allData.put(currentWord, currentCount + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : allData.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
