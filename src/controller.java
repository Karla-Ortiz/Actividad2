
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
    private char reemplace(char c) {
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
            case 'm':
                return '0';
            case 'u':
                return '1';
            case 'r':
                return '2';
            case 'c':
                return '3';
            case 'i':
                return '4';
            case 'e':
                return '5';
            case 'l':
                return '6';
            case 'a':
                return '7';
            case 'g':
                return '8';
            case '0':
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

    /**
     *
     * @param txt
     * @param v
     * @return
     */
    public int howmany(String txt, String v) {
        int cont = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.codePointAt(i) == v.codePointAt(0)) {
                cont++;
            }
        }
        return cont;
    }
}
