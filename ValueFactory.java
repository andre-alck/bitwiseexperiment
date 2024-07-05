import java.lang.Boolean;
import java.lang.Integer;

public class ValueFactory {
    public ValueParser getParser(Class clazz) {
        if (clazz.getSimpleName().equals("Integer")) {
            return new IntegerValueParser();
        }

        if (clazz.getSimpleName().equals("Boolean")) {
            return new BooleanValueParser();
        }

        if (clazz.getSimpleName().equals("String")) {
            return new StringValueParser();
        }

        return null;
    }
}