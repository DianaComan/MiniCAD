public final class globals {
//retine variabile care ajuta la creerea formelor (puncte, dimensiuni)
      public static int n1 = 0;
      public static int[][] v = {
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
                  {0, 0},
              };
      public static int[] d =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      public static int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      public static int[] a =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      public void setn(final int n) {
           this.n1 = n;
      }
      public void setv(final int b, final int i, final int j) {
           this.v[i][j] = b;
      }
      public void setd(final int b, final int i) {
           this.d[i] = b;
      }
      public void setc(final int b, final int i) {
           this.c[i] = b;
      }
      public void seta(final int b, final int i) {
           this.a[i] = b;
      }
}
