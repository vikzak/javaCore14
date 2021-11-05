import java.util.Arrays;

public class Lesson14 {
    public static void main(String[] args) {
        int searchNumber = 4;
        int searchNumber1 = 1;
        int searchNumber2 = 4;
        Generic generic = new Generic();
        int[] myArray1 = {1,2,4,4,2,3,4,1,7};
        int[] myArray2 = {1,2,4,3,2,3,7,7,7};
        int[] myArray3 = {4,9,0,3,2,3,6,7,7};
        System.out.printf("число по условию задачи: %s\n", searchNumber);
        
        System.out.printf("1 исходный массив:" + Arrays.toString(myArray1) + "\n");
        int[] resultArray = generic.modifyArr(myArray1,searchNumber);
        System.out.printf("1 измененный массив:" + Arrays.toString(resultArray) + "\n");
        // еще 2 варианта
        System.out.printf("2 исходный массив:" + Arrays.toString(myArray2) + "\n");
        int[] resultArray2 = generic.modifyArr(myArray2,searchNumber);
        System.out.printf("2 измененный массив:" + Arrays.toString(resultArray2) + "\n");
        System.out.printf("3 исходный массив:" + Arrays.toString(myArray3) + "\n");
        int[] resultArray3 = generic.modifyArr(myArray3,searchNumber);
        System.out.printf("3 измененный массив:" + Arrays.toString(resultArray3) + "\n");

        // следующее задание
        System.out.println();
        int[] varArray1 = {1,1,1,4,4,1,4,4};
        int[] varArray2 = {1,1,1,1,1,1};
        int[] varArray3 = {4,4,4,4};
        int[] varArray4 = {1,4,4,1,1,4,3};
        System.out.printf(Arrays.toString(varArray1) + " -> " + String.valueOf(generic.booleanResultArray(varArray1,searchNumber1,searchNumber2))+"\n");
        System.out.printf(Arrays.toString(varArray2) + " -> " + String.valueOf(generic.booleanResultArray(varArray2,searchNumber1,searchNumber2))+"\n");
        System.out.printf(Arrays.toString(varArray3) + " -> " + String.valueOf(generic.booleanResultArray(varArray3,searchNumber1,searchNumber2))+"\n");
        System.out.printf(Arrays.toString(varArray4) + " -> " + String.valueOf(generic.booleanResultArray(varArray4,searchNumber1,searchNumber2))+"\n");

    };
}
