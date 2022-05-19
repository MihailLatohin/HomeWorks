public class Array {
    public static void main(String[] args) {
        int list[] = new int[10];
        int i;
        for (i = 0; i < list.length; i = i + 1)
            list[i] = i;
        for (i = 0; i < list.length; i = i + 1)

            System.out.println("Элемент[" + i + "]: " + list[i]);
        System.out.println("Размер массива: " + list.length);
    }
}
