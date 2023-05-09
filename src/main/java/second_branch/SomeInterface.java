package second_branch;

import java.util.function.Predicate;

@FunctionalInterface
public interface SomeInterface<T> {
    boolean bigger(T t);
}
