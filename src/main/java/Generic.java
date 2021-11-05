import java.util.stream.IntStream;

public class Generic {
    public <E extends Number> int[] modifyArr(int[] list, int searchNumber){
        String message = "числа: " + searchNumber + " нет в массиве!";

        int index = IntStream.range(0, list.length)
                .map(i -> list.length - 1 - i)
                .filter(i->list[i]==searchNumber)
                .findFirst().orElseThrow(()->new RuntimeException(new String(message)));

        int[] result = new int[list.length-index-1];
        System.arraycopy(list, index+1, result, 0, list.length-index-1);
        return result;
    }

    public <E extends Number> boolean booleanResultArray(int[] list, int searchNumber1, int searchNumber2){
        boolean var01 = IntStream.of(list).filter(i -> i != searchNumber1).filter
                (i -> i != searchNumber2).count() != 0;
        boolean var02 = IntStream.of(list).filter
                (i -> i == searchNumber1).count() != 0;
        boolean var03 = IntStream.of(list).filter
                (i -> i == searchNumber2).count() != 0;
        return !var01 && var02 && var03;
    }

}
