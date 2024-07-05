import java.lang.Boolean;

public class BooleanValueParser implements ValueParser {
    @Override
    public Object parse(String parseable) {
        return Boolean.valueOf(parseable);
    }
}