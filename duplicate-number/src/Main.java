public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,10,11,12,13,14,14,15,16,17,18,19,20};
        int[] duplicateNumbers = new int[numbers.length];
        int duplicateIndex = 0;
        int duplicateCount = 0;
        int duplicateNumber = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < numbers.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    duplicateNumber = numbers[i];
                    break;
                }
            }
            if (isDuplicate) {
                duplicateNumbers[duplicateIndex] = duplicateNumber;
                duplicateIndex++;
                duplicateCount++;
            }
        }

        for (int i = 0; i < duplicateCount; i++) {
            System.out.println(duplicateNumbers[i]);
        }
    }
}