import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@MyFirstAnnotation
@EqualsAndHashCode

public class Student {

    @MyFirstAnnotation(flag = true)
    private String name;
    private int age;
    private String schoolName;
    private int maxGrade;

    @MyFirstAnnotation
    public void doSomething(){

    }

}
