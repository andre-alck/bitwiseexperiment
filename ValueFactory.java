import java.lang.Boolean;
import java.lang.Integer;

public class ValueFactory {
    public ValueParser getParser(Class clazz) {
        if (clazz == null) {
            return null;
        }
    
        if (clazz.getSimpleName().equals(Integer.class.getSimpleName())) {
            return new IntegerValueParser();
        }

        if (clazz.getSimpleName().equals(Boolean.class.getSimpleName())) {
            return new BooleanValueParser();
        }

        if (clazz.getSimpleName().equals(String.class.getSimpleName())) {
            return new StringValueParser();
        }

        return null;
    }
}