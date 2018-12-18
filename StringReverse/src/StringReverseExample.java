public class StringReverseExample {

    public static void main(String args[]) {

        String str = "Sony is going to introduce new TV";
        System.out.println("Original Str:  " + str);
        System.out.println("Reverse str: " + reverseString(str));
        System.out.println("reverse2: " + reverseString2(str));

    }

    public static String reverseString(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChar = str.toCharArray();

        for (int i = strChar.length - 1; i >= 0; i--) {
            strBuilder.append(strChar[i]);
        }
        return strBuilder.toString();
    }

    static String reverseString2(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strToChar = str.toCharArray();

        int start = 0;
        int end = strToChar.length;

        for (int i = strToChar.length -1; i >= 0; i--) {
            if (strToChar[i] == ' ' || i == 0) {
                start = i + 1;
                while (start != end) {
                    strBuilder.append(strToChar[start++]);

                }
                strBuilder.append(" ");
                end = i;
            }


        }
        return strBuilder.toString();
    }
}
