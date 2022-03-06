package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {

      executeMethod(new Car());
    }

    public static void executeMethod(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls = obj.getClass();
        if(cls.getTypeName().equals("reflection.Car")){
            Method run = cls.getMethod("run");
            run.invoke(obj, null);
        }
    }
}
