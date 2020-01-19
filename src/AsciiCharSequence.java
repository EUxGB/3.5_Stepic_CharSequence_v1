import java.lang.*;

public class AsciiCharSequence extends Object implements CharSequence {

    byte[] inputsec;

    public AsciiCharSequence(byte[] inputsec) {
        this.inputsec = inputsec;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte el : inputsec) sb = sb.append((char) el);
        String result = new String(sb.toString());
        return result;
    }

    @Override
    public int length() {
        return inputsec.length;
    }

    @Override
    public char charAt(int index) {
        return (char) inputsec[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subsec = new byte[end - start];
        System.arraycopy(inputsec, start, subsec, 0, end - start);
        return new AsciiCharSequence(subsec);
    }

}
