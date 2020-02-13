import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(final String[] args) throws IOException {
        int i;
//numere magice
         final int sa7 = 7;
         final int op8 = 8;
         final int no9 = 9;
         final int un1 = 1;
         final int tr3 = 3;
         final int do2 = 2;
         final int ze0 = 0;
         final int pa4 = 4;
         final int sa6 = 6;
         final int ze1 = 10;
         final int s16 = 16;
         final int ci5 = 5;
        File file = new File(args[0]);
        Scanner fileReader = new Scanner(file);
        int n = ze0;
//numarul de forme
            n = fileReader.nextInt();
        int j;
        String s1 = "";
        int res = s16 + s16;
        String[] s = new String[res];
//pt fiecare forma se citesc datele specifice formelor, se retin in globals
//si apoi se apeleaza ShapeFactory pt desenarea formelor
        for (i = un1; i <= n + un1; i++) {
            s1 = fileReader.nextLine();
            s = s1.split(" ");
                if (s[ze0].equalsIgnoreCase("Circle")) {
                       globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                       globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                       globals.d[ze0] = Integer.parseInt(s[tr3]);
                       String col1 = "", col2 = "", col3 = "";
                        String[] ca = s[pa4].split("");
                        col1 = col1.concat(ca[un1]);
                        col1 = col1.concat(ca[do2]);
                        col2 = col2.concat(ca[tr3]);
                        col2 = col2.concat(ca[pa4]);
                        col3 = col3.concat(ca[ci5]);
                        col3 = col3.concat(ca[sa6]);
                        globals.c[ze0] = Integer.parseInt(col1, s16);
                        globals.c[un1] = Integer.parseInt(col2, s16);
                        globals.c[do2] = Integer.parseInt(col3, s16);
                        globals.a[ze0] = Integer.parseInt(s[ci5]);
                         col1 = ""; col2 = ""; col3 = "";
                       ca = s[sa6].split("");
                            col1 = col1.concat(ca[un1]);
                            col1 = col1.concat(ca[do2]);
                            col2 = col2.concat(ca[tr3]);
                            col2 = col2.concat(ca[pa4]);
                            col3 = col3.concat(ca[ci5]);
                            col3 = col3.concat(ca[sa6]);
                            globals.c[tr3] = Integer.parseInt(col1, s16);
                            globals.c[pa4] = Integer.parseInt(col2, s16);
                            globals.c[ci5] = Integer.parseInt(col3, s16);
                            globals.a[un1] = Integer.parseInt(s[sa7]);
                        Shape sh = new ShapeFactory(s[ze0]);
                        sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Line")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                   globals.v[un1][ze0] = Integer.parseInt(s[tr3]);
                   globals.v[un1][un1] = Integer.parseInt(s[pa4]);
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[ci5].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[sa6]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Canvas")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[tr3].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[pa4]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Diamond")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                   globals.d[ze0] = Integer.parseInt(s[tr3]);
                   globals.d[un1] = Integer.parseInt(s[pa4]);
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[ci5].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[sa6]);
                    col1 = ""; col2 = ""; col3 = "";
                       ca = s[sa7].split("");
                            col1 = col1.concat(ca[un1]);
                            col1 = col1.concat(ca[do2]);
                            col2 = col2.concat(ca[tr3]);
                            col2 = col2.concat(ca[pa4]);
                            col3 = col3.concat(ca[ci5]);
                            col3 = col3.concat(ca[sa6]);
                            globals.c[tr3] = Integer.parseInt(col1, s16);
                            globals.c[pa4] = Integer.parseInt(col2, s16);
                            globals.c[ci5] = Integer.parseInt(col3, s16);
                            globals.a[un1] = Integer.parseInt(s[op8]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Square")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                   globals.d[ze0] = Integer.parseInt(s[tr3]);
                   String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[pa4].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[ci5]);
                     col1 = ""; col2 = ""; col3 = "";
                   ca = s[sa6].split("");
                        col1 = col1.concat(ca[un1]);
                        col1 = col1.concat(ca[do2]);
                        col2 = col2.concat(ca[tr3]);
                        col2 = col2.concat(ca[pa4]);
                        col3 = col3.concat(ca[ci5]);
                        col3 = col3.concat(ca[sa6]);
                        globals.c[tr3] = Integer.parseInt(col1, s16);
                        globals.c[pa4] = Integer.parseInt(col2, s16);
                        globals.c[ci5] = Integer.parseInt(col3, s16);
                        globals.a[un1] = Integer.parseInt(s[sa7]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
                   }
               if (s[ze0].equalsIgnoreCase("Triangle")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                   globals.v[un1][ze0] = Integer.parseInt(s[tr3]);
                   globals.v[un1][un1] = Integer.parseInt(s[pa4]);
                   globals.v[do2][ze0] = Integer.parseInt(s[ci5]);
                   globals.v[do2][un1] = Integer.parseInt(s[sa6]);
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[sa7].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[op8]);
                    col1 = ""; col2 = ""; col3 = "";
                       ca = s[no9].split("");
                            col1 = col1.concat(ca[un1]);
                            col1 = col1.concat(ca[do2]);
                            col2 = col2.concat(ca[tr3]);
                            col2 = col2.concat(ca[pa4]);
                            col3 = col3.concat(ca[ci5]);
                            col3 = col3.concat(ca[sa6]);
                            globals.c[tr3] = Integer.parseInt(col1, s16);
                            globals.c[pa4] = Integer.parseInt(col2, s16);
                            globals.c[ci5] = Integer.parseInt(col3, s16);
                            globals.a[un1] = Integer.parseInt(s[ze1]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Polygon")) {
                   globals.n1 = Integer.parseInt(s[un1]);
                   for (j = ze0; j < globals.n1; j++) {
                        globals.v[j][ze0] = Integer.parseInt(s[un1 + do2 * j + un1]);
                        globals.v[j][un1] = Integer.parseInt(s[tr3 + do2 * j]);
                   }
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[do2 * globals.n1 + do2].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[do2 * globals.n1 + tr3]);
                    col1 = ""; col2 = ""; col3 = "";
                    ca = s[do2 * globals.n1 + pa4].split("");
                            col1 = col1.concat(ca[un1]);
                            col1 = col1.concat(ca[do2]);
                            col2 = col2.concat(ca[tr3]);
                            col2 = col2.concat(ca[pa4]);
                            col3 = col3.concat(ca[ci5]);
                            col3 = col3.concat(ca[sa6]);
                            globals.c[tr3] = Integer.parseInt(col1, s16);
                            globals.c[pa4] = Integer.parseInt(col2, s16);
                            globals.c[ci5] = Integer.parseInt(col3, s16);
                            globals.a[un1] = Integer.parseInt(s[do2 * globals.n1 + ci5]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
               }
               if (s[ze0].equalsIgnoreCase("Rectangle")) {
                   globals.v[ze0][ze0] = Integer.parseInt(s[un1]);
                   globals.v[ze0][un1] = Integer.parseInt(s[do2]);
                   globals.d[ze0] = Integer.parseInt(s[tr3]);
                   globals.d[un1] = Integer.parseInt(s[pa4]);
                    String col1 = "", col2 = "", col3 = "";
                    String[] ca = s[ci5].split("");
                    col1 = col1.concat(ca[un1]);
                    col1 = col1.concat(ca[do2]);
                    col2 = col2.concat(ca[tr3]);
                    col2 = col2.concat(ca[pa4]);
                    col3 = col3.concat(ca[ci5]);
                    col3 = col3.concat(ca[sa6]);
                    globals.c[ze0] = Integer.parseInt(col1, s16);
                    globals.c[un1] = Integer.parseInt(col2, s16);
                    globals.c[do2] = Integer.parseInt(col3, s16);
                    globals.a[ze0] = Integer.parseInt(s[sa6]);
                    col1 = ""; col2 = ""; col3 = "";
                       ca = s[sa7].split("");
                            col1 = col1.concat(ca[un1]);
                            col1 = col1.concat(ca[do2]);
                            col2 = col2.concat(ca[tr3]);
                            col2 = col2.concat(ca[pa4]);
                            col3 = col3.concat(ca[ci5]);
                            col3 = col3.concat(ca[sa6]);
                            globals.c[tr3] = Integer.parseInt(col1, s16);
                            globals.c[pa4] = Integer.parseInt(col2, s16);
                            globals.c[ci5] = Integer.parseInt(col3, s16);
                            globals.a[un1] = Integer.parseInt(s[op8]);
                    Shape sh = new ShapeFactory(s[ze0]);
                    sh.accept(new ShapeDisplayVisitor());
              }
        }
        fileReader.close();
    }
}

