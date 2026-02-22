class Q02_PasswordValidation {

    static boolean checkPassword(String password) {

        int n = password.length();
        if (n < 5 || n > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                return false;

            if (!Character.isLowerCase(ch) && !Character.isDigit(ch))
                return false;

            if (Character.isLowerCase(ch))
                hasLower = true;

            if (Character.isDigit(ch))
                hasDigit = true;
        }

        if (!hasLower || !hasDigit)
            return false;

        
        for (int len = 1; len <= n / 2; len++) {
            for (int i = 0; i + 2 * len <= n; i++) {
                String first = password.substring(i, i + len);
                String second = password.substring(i + len, i + 2 * len);
                if (first.equals(second))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.print("abcanan1:");
        System.out.println(checkPassword("abcanan1"));
        System.out.print("abc11se:");   
        System.out.println(checkPassword("abc11se"));
        System.out.print("123sd123:");    
        System.out.println(checkPassword("123sd123"));   
        System.out.print("newnew7:");
        System.out.println(checkPassword("newnew7"));    
    }
}