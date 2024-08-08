package Search;

import java.util.Arrays;

public class SearchInStrings{
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target){
//        str.length() is function in strings
        if(str.length()==0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i))
                return true;
        }
        return false;
    }

    // using for each loop
    static boolean search2(String str, char target){
        if(str.length()==0)
            return false;

        // to use for each loop you need some array or collection
        // thus str.toCharArray converts the string to char array
        for (char ch : str.toCharArray()) {
            if (ch==target)
                return true;
        }
        return false;
    }
}
