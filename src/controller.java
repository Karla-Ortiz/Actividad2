
/**
 *
 * @author KORTIZ
 */
public class controller {

    /**
     *
     * @param var
     * @return
     */
    public String codigomurcielago(String var) {
        char[] caracteres = notNull(var).toCharArray();
        StringBuilder stb = new StringBuilder();
        for (char c : caracteres) {
            stb.append(reemplace(c));
        }
        return stb.toString();
    }

    /**
     *
     * @param c
     * @return
     */
    public char reemplace(char c) {
        switch (c) {
            case 'M':
                return '0';
            case 'U':
                return '1';
            case 'R':
                return '2';
            case 'C':
                return '3';
            case 'I':
                return '4';
            case 'E':
                return '5';
            case 'L':
                return '6';
            case 'A':
                return '7';
            case 'G':
                return '8';
            case 'O':
                return '9';
            default:
                return c;
        }
    }

    /**
     *
     * @param var
     * @return
     */
    private String notNull(String var) {
        return var != null ? var.trim() : "";
    }
}
