package Labs.L07MapsLambdaAndStreamAPI;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymsMap.containsKey(word)) {
                synonymsMap.put(word, new ArrayList<>());
            }
            synonymsMap.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
