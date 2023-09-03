package org.example;

public class DublicateComparison {
    public static void findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == Integer.MIN_VALUE) {
                continue; // Пропускаем уже обработанные числа
            }
            int count = 1; // Количество повторений числа
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    nums[j] = Integer.MIN_VALUE; // Помечаем повторяющееся число
                }
            }
            if (count > 1) {
                System.out.println("Число " + nums[i] + " повторяется " + count + " раз(а)");
            }
        }
    }
}
