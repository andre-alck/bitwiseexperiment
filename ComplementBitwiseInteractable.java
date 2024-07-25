public class ComplementBitwiseInteractable {
    public static void main(String[] args) {
        Interactable interactable = new Interactable();
        Integer value = (Integer) interactable.getArgument(args, 0, Integer.class);
        Integer valueComplement = ~value;
        System.out.println(valueComplement);
        System.out.println(value * -1 + 1);
        MiniTest.assertThat(valueComplement).isEqualTo(value * -1 - 1);
    }
}