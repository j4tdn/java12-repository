package ex04;

public class Ex04 {

    /**
     * Yet I haven't Debug.
     *
     * @param args
     */
    public static void main(String[] args) {
        String input = " Welcome  to JAVA12  class ";
        System.out.println("==================");
        System.out.println(input);
        System.out.println("==================");


        String result = getReverse(input);
        System.out.println(result);
    }

    //    Yet I haven't Debug.
    private static String revert(String input) {
        char[] sequences = input.toCharArray();

        for (int i = 0; i < sequences.length / 2; i++) {
            char tmp = sequences[i];
            sequences[i] = sequences[sequences.length - i - 1];
            sequences[sequences.length - i - 1] = tmp;
        }

        return String.copyValueOf(sequences);
    }
        // Yet I haven't Debug.
        private static String getReverse(String input){
            String result = input.replaceAll("\\s+", " ");

            String[] str = result.split(" ");

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length; i++) {
                sb.append(revert(str[i]) + " ");
            }

            return sb.toString();
        }
    }
