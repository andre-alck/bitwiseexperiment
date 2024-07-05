public abstract class Interactable {
    protected Object getArgument(String[] args, int position, Class clazz) {
        if (!this.argumentExists(args, position)) {
            return null;
        }

        ValueFactory factory = new ValueFactory();
        ValueParser parser = factory.getParser(clazz);
        return parser.parse(args[position]);
    }

    private boolean argumentExists(String[] args, int position) {
        try {
            this.forceArrayIndexing(args[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }

        return true;
    }

    private void forceArrayIndexing(String position) {}
}
