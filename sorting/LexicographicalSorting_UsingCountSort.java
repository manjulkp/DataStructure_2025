package sorting;
public class LexicographicalSorting_UsingCountSort {

    public static String sorting(String s){

        int n = s.length();

        int array[] = new int[26];

    
        for(int i=0;i<n;i++){
            array[s.charAt(i)-'a']++;
        }

        StringBuilder res= new StringBuilder();

        for(int i=0;i<26;i++){
            int count = array[i];
            if(count !=0){
                res.append( (char)(i+'a')  );
            }


        }

        return res.toString();
    }
    
}
