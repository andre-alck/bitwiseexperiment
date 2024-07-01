public enum Permission {
    ALL(7),
    READ_WRITE(6),
    READ_EXECUTE(5),
    READ(4),
    WRITE_EXECUTE(3),
    WRITE(2),
    EXECUTE(1),
    NONE(0);

    private final int value;

    private Permission(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Permission getPermission(String name) {
        for (Permission currentElement : Permission.values()) {
            if (currentElement.name().equals(name)) {
                return currentElement;
            }
        }

        throw new RuntimeException("Element '" + name + "' was not found.");
    }
}
