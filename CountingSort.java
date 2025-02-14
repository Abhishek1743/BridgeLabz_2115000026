class CountingSort{
	
	//Method to perform counting sort
    public static void countingSort(int ages[]){
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }
    }

    //Method to print student ages
    public static void printAge(int StudentAge[]) {
        for (int age : StudentAge) {
            System.out.print(age + " ");
        }
        System.out.println();
	}

    //Main method
    public static void main(String args[]) {
        int StudentAge[] = {12, 15, 11, 18, 10, 10, 11, 18, 17, 17, 16, 14, 13, 17};

        //calling sorting function
        countingSort(StudentAge);

        //displaying sorted ages
        printAge(StudentAge);
    }
}