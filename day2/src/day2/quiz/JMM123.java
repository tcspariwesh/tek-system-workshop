package day2.quiz;
class JMM123 {
  public static void main (String args[]) {
    int h=0,i = 0, j = 0, k = 0;
label1:
    for (; h < 6; h++) {
label2:
      do { i++; k = h + i + j;
        switch (k) {
          default: break label1;
          case 1: continue label2;
          case 2: break;
          case 3: break label2;
          case 4: continue label2;
          case 5: continue label1;
        }
      } while (++j<5);
    }
    System.out.println(h + "," + i + "," + j);
}}
