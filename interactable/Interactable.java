public class Interactable {
    public Object getArgument(String[] args, int position, Class clazz) {
        if (!this.argumentExists(args, position)) {
            throw new RuntimeException("Can't get null argument.");
        }

        ValueFactory factory = new ValueFactory();
        ValueParser parser = factory.getParser(clazz);
        return parser.parse(args[position]);
    }

    boolean argumentExists(String[] args, int position) {
        return args != null && position < args.length;
    }
}
