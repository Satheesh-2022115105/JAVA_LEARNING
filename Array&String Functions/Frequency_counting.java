public class Frequency_counting{
    public static void main(String[] args) {
        String str="GREEN APPLE ENDS THE STREAM";
        int[] arr=new int[26];
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                arr[c-'A']++;

            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>=1){
                    System.out.println("Character count of "+(char)('A'+i)+" is :"+arr[i]);
            }
        }
    }
}