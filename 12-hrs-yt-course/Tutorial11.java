import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tutorial11 {
    public static void main(String a[]) {
        Status ss = Status.Success;
        System.out.println(ss.getClass().getSuperclass());
        System.out.println(Status.Pending);
        System.out.println(Status.Success);
        for (Status s : Status.values()) {
            System.out.println(s + "-->" + s.ordinal());
        }
    }
}

enum Status {
    Running,
    Failed,
    Pending,
    Success
}