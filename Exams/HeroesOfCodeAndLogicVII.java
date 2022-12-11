package Exams;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> detailsMap = new TreeMap<>();
        for (int i = 0; i < numberOfHeroes; i++) {
            String heroDetails = scanner.nextLine();
            String[] dataArr = heroDetails.split(" ");
            String name = dataArr[0];
            int health = Integer.parseInt(dataArr[1]);
            int mana = Integer.parseInt(dataArr[2]);
            detailsMap.put(name, new ArrayList<>());
            detailsMap.get(name).add(0, health);
            detailsMap.get(name).add(1, mana);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputArr = input.split(" - ");
            String command = inputArr[0];
            switch (command) {
                case "CastSpell":
                    String heroName = inputArr[1];
                    int manaNeeded = Integer.parseInt(inputArr[2]);
                    String spellName = inputArr[3];
                    int currentMana = detailsMap.get(heroName).get(1);
                    if (currentMana >= manaNeeded) {
                        int manaLeftAfterCast = currentMana - manaNeeded;
                        detailsMap.get(heroName).remove(1);
                        detailsMap.get(heroName).add(1, manaLeftAfterCast);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaLeftAfterCast);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    String name = inputArr[1];
                    int damage = Integer.parseInt(inputArr[2]);
                    String attacker = inputArr[3];
                    int currentHealth = detailsMap.get(name).get(0);
                    if (currentHealth > damage) {
                        int healthLeftAfterTheAttack = currentHealth - damage;
                        detailsMap.get(name).remove(0);
                        detailsMap.get(name).add(0, healthLeftAfterTheAttack);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, healthLeftAfterTheAttack);
                    } else if (currentHealth < damage) {
                        detailsMap.remove(name);
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                    }
                    break;
                case "Recharge":
                    String hName = inputArr[1];
                    int amount = Integer.parseInt(inputArr[2]);
                    int currMana = detailsMap.get(hName).get(1);
                    int manaSum = amount + currMana;
                    if (manaSum > 200) {
                        int diff = 200 - currMana;
                        detailsMap.get(hName).remove(1);
                        detailsMap.get(hName).add(1, 200);
                        System.out.printf("%s recharged for %d MP!%n", hName, diff);
                    } else {
                        detailsMap.get(hName).remove(1);
                        detailsMap.get(hName).add(1, manaSum);
                        System.out.printf("%s recharged for %d MP!%n", hName, amount);
                    }
                    break;
                case "Heal":
                    String nameHero = inputArr[1];
                    int healAmount = Integer.parseInt(inputArr[2]);
                    int currentHP = detailsMap.get(nameHero).get(0);
                    int hpSum = currentHP + healAmount;
                    if (hpSum > 100) {
                        int diff = 100 - currentHP;
                        detailsMap.get(nameHero).remove(0);
                        detailsMap.get(nameHero).add(0, 100);
                        System.out.printf("%s healed for %d HP!%n", nameHero, diff);
                    } else {
                        detailsMap.get(nameHero).remove(0);
                        detailsMap.get(nameHero).add(0, hpSum);
                        System.out.printf("%s healed for %d HP!%n", nameHero, healAmount);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        detailsMap.entrySet().stream().sorted((e1, e2) -> {
            int HP = e2.getValue().get(0) - e1.getValue().get(0);
            if (HP == 0) {
                HP = e1.getKey().compareTo(e2.getKey());
            }
            return HP;
        }).forEach(entry -> System.out.printf("%s\n" +
                "  HP: %d\n" +
                "  MP: %d\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
