package second_branch;

import java.util.function.Predicate;

public class SecondClass implements SomeInterface<Integer>{
    int val;

    @Override
    public boolean bigger(Integer integer) {
        return this.val > integer;
    }
}
