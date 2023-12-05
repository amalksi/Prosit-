import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.lang.Override;

public class StudentManagment implements Managment {

        @Override
        public static void displayStudents(List<Student> students, Consumer<Student> con) {
            students.forEach(con);
        }

        @Override
        public static void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
            students.stream().filter(pre).forEach(con);
        }

        @Override
        public static String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
            return students.stream().map(fun).collect(Collectors.joining(", "));
        }

       @Override
         public static Student createStudent(Supplier<Student> sup) {
            return sup.get();
    }

       @Override
        public static List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return students.stream().sorted(com).collect(Collectors.toList());
    }


}
