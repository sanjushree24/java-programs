class Solution{
    public static void main(String[] args) {

        String str = "Helloworld";
        String newStr = "";

        for (int i = 0; i < str.length(); i += 2) {
            newStr +=  str.charAt(i);
        }

        System.out.println("New String: " + newStr);
    }
}