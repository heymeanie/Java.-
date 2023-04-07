import java.nio.file.Files;
import java.util.*;
import java.util.stream.*;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        //1.1 Создание стрима из List
        ArrayList<String> stream_Array_List = new ArrayList<>();
        stream_Array_List.add("a1");
        stream_Array_List.add("a2");
        stream_Array_List.add("a3");
        stream_Array_List.stream().forEach(System.out::println);

        //1.2 Создание стрима перечислением
        stream_Enum stream_enum;
        stream_Array_List.stream().forEach(System.out::println);

        //1.3 Создание стрима из массива
        Integer[] stream_Array = new Integer[] {2, 6, 3};
        Arrays.stream(stream_Array).forEach(System.out::println);

        //1.4 Создание стрима из файла
        //Stream<String> stream_From_File = Files.lines(Paths.get("D:\\Программирование\\java\\stream1.txt"));

        //1.5 Создание стрима из строки
        //Stream<String> stream_String = Stream.of("New string".chars());
        //stream_String.forEach(System.out::println);

        //1.6 Создание параллельного стрима
        List<String> stream_Parallel = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");
        stream_Parallel.parallelStream().forEach(System.out::println);

        //1.7 Создание бесконечного стрима, который возводит каждое предыдущее значение в квадрат
        Stream.iterate(2, num -> num * num).limit(5).forEach(System.out::println);

        //1.8 Создание бесконечного стрима, который возвращает последовательность фибоначчи
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]}).limit(10).map(y -> y[0]).forEach(x -> System.out.println(x));

    }
}
enum stream_Enum{

    a1,
    a2,
    a3
}