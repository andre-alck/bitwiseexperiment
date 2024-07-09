import java.lang.IllegalAccessException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestSuite {
    public void runClassTests() {
        for (Method classMethod : this.getClass().getMethods()) {
            TestMe methodAnnotation = (TestMe)classMethod.getAnnotation(TestMe.class);
            if (methodAnnotation == null) {
                continue;
            }

            try {
                classMethod.invoke(this);
            } catch (IllegalAccessException | InvocationTargetException e) {
                MiniTest.logForDebugging(e);
            }
        }
    }
}