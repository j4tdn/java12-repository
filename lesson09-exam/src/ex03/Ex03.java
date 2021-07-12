package ex03;

/**
 *
 *Bước 1: Hợp nhất [a] và b: [ba, ab]
 *
 * Bước 2: Hợp nhất [ba, ab] và c: [cba, bca, bac, cab, acb, abc]
 *
 * Bước 3: Hợp nhất [cba, bca, bac, cab, acb, abc] và d:
 * [dcba, cdba, cbda, cbad, dbca, bdca, bcda, bcad, dbac, bdac, badc, bacd, dcab,
 * cdab, cadb , cabd, dacb, adcb, acdb, acbd, dabc, adbc, abdc, abcd]
 *
 * Page (71) in Cracking the Encrypted Interview Book, 6th ed.
 */
public class Ex03 {
    public static void main(String[] args) throws Exception {
        String str = "xyz";
        StringBuffer strBuf = new StringBuffer(str);
        System.out.println("Conversion Of XYZ is: ");
        permutation(strBuf,0);
    }

    private static void permutation(StringBuffer str, int index){

        if(index == str.length())
            System.out.println(str);
        else {
            permutation(str, index + 1);
            for (int i = index + 1; i < str.length(); i++) {
                swap(str,index, i);
                permutation(str, index+1);
                swap(str,i, index);
            }
        }
    }

    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}
