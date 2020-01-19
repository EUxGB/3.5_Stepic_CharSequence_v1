public class Main {

    public static void main(String[] args) {
        //Создаем массив байт с символами строки
        String txt = "My cat is the best in the world";
        System.out.println(txt);

        byte[] txtbytes = txt.getBytes();

        for (byte el : txtbytes) System.out.print(el + " ,");

        System.out.println("\n" + "----------------------------------------------");
        AsciiCharSequence ascc = new AsciiCharSequence(txtbytes);
        System.out.println("ascc.length() " + ascc.length());
        System.out.println("ascc.charAt(5): " + ascc.charAt(5));
        System.out.println("toString(): " + ascc.toString());
        System.out.println("subSequence(4,15): " + ascc.subSequence(4, 15));

    }
}
