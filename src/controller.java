
import java.util.List;
import java.util.LinkedList;

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
        txt = notNull(txt);
        v = notNull(v);
        for (int i = 0; i < txt.length(); i++) {
            if (txt.codePointAt(i) == v.codePointAt(0)) {
                cont++;
            }
        }
        return cont;
    }

    private boolean isPar(String var) {
        return notNull(var).length() % 2 == 0;
    }

    public String palabrasPares(String txt) {
        txt = notNull(txt);
        String pares = "";
        for (String v : txt.split(" ")) {
            if (isPar(v)) {
                pares += " " + v;
            }
        }
        return pares;

    }

    public String palabrasImpares(String txt) {
        txt = notNull(txt);
        String pares = "";
        for (String v : txt.split(" ")) {
            if (!isPar(v)) {
                pares += " " + v;
            }
        }
        return pares;
    }

    public String primeraLetra(String txt) {
        txt = notNull(txt);
        if (!txt.isEmpty()) {
            return txt.substring(0, 1);
        }
        return txt;
    }

    public String ultimaLetra(String txt) {
        txt = notNull(txt);
        if (!txt.isEmpty()) {
            return txt.substring(txt.length() - 1, txt.length());
        }
        return txt;
    }

    public String letraCentral(String txt) {
        txt = notNull(txt);
        if (!txt.isEmpty()) {
            return txt.substring(txt.length() / 2 - 1, txt.length() / 2);
        }
        return txt;
    }

    public int cantidadDePalabra(String txt) {
        return txt.split(" ").length;
    }

    public int longitud(String txt) {
        return txt.length();
    }

    public String primeraPalabra(String txt) {
        txt = notNull(txt);
        return txt.split(" ").length > 0 ? txt.split(" ")[0] : "";
    }

    public String ultimaPalabra(String txt) {
        txt = notNull(txt);
        int size = txt.split(" ").length;
        return txt.split(" ").length > 0 ? txt.split(" ")[size - 1] : "";
    }

    public String palabraCentral(String txt) {
        txt = notNull(txt);
        int size = txt.split(" ").length;
        return txt.split(" ").length > 0 ? txt.split(" ")[size / 2] : "";
    }

}
