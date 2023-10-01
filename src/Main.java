import java.util.List;


public class Main {
    private static List<Integer>integers=List.of(2, 4, 6, 8, 10, 2, 6, 10);
    public static void main(String[] args) {
        List<Integer> list = getIntegers(integers);
        System.out.println(list);
    }
    private static List<Integer>getIntegers(List<Integer>integerList){
        return integerList.stream()
                .sorted()
                .filter(unique->integerList.indexOf(unique)==integerList.lastIndexOf(unique))
                .toList();

    }
}