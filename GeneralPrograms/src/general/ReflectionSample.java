package general;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample {

    private void run(){
        System.out.println("In run...");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class c = Class.forName("general.ReflectionSample");
        Object o = c.newInstance();

        Method m = c.getDeclaredMethod("run", null);

        m.setAccessible(true);
        m.invoke(o, null);
    }
}
