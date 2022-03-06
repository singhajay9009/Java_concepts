package interfaceExample;

public interface CommonExecuter <R, T> {

    R getPrice(T t);

    R getRate(T t);
}
