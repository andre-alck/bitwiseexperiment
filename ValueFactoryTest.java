import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class ValueFactoryTest extends TestSuite {

    @TestMe
    public void givenNullClassThenParserIsNullAsWell() {
        ValueFactory valueFactory = new ValueFactory();
        ValueParser parser = valueFactory.getParser(null);
        MiniTest.assertThat(parser).isEqualTo(null);
    }

    @TestMe
    public void shouldInstanciateCorrectValueParserImplementation() {
        ValueFactory valueFactory = new ValueFactory();

        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair<Integer, IntegerValueParser>(0, new IntegerValueParser()));
        pairs.add(new Pair<String, StringValueParser>("", new StringValueParser()));
        pairs.add(new Pair<Boolean, BooleanValueParser>(false, new BooleanValueParser()));

        for (Pair pair : pairs) {
            ValueParser valueParser = valueFactory.getParser(pair.getLeft().getClass());
            MiniTest.assertThat(valueParser.getClass()).isEqualTo(pair.getRight().getClass());
        }
    }

    public static void main(String[] args) {
        ValueFactoryTest valueFactoryTest = new ValueFactoryTest();
        valueFactoryTest.runClassTests();
    }
}