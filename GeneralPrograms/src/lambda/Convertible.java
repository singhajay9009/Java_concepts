package lambda;

@FunctionalInterface
public interface Convertible<T, R> {

     R convert(T t);
}
