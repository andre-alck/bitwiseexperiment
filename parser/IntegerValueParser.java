import java.lang.Integer;

public class IntegerValueParser implements ValueParser {
    @Override
    public Object parse(String parseable) {
        return Integer.valueOf(parseable);
    }
}