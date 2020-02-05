public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(helloName("Jim"));
        System.out.println(lastChars("last", "chars"));
        System.out.println(doubleX("axxbb"));
        int[] a = {1,2};
        System.out.println(double23(a);
        System.out.println(cigarParty(45, true));
        System.out.println(noTeenSum(11,14,19));
        System.out.println(bobThere("abcbob"));
    }

    //#1 Warm-Up 1
    public static boolean nearHundred(int n) {
        public boolean nearHundred(int n) {
            for(int i = 190; i< 211;i++){
                if( n == i){
                    return true;
                }
                for(int a = 90; a< 111;a++)
                    if(n == a){
                        return true;
                    }
            }
            return false;
        }

        }
    //#2 String 1 Example
    public static  String helloName(String name) {
        String HelloName = "Hello " + name + "!";
        return HelloName;
    }
    //#2 String 1
    public static String lastChars(String a, String b) {
        String NewStr = "";
        if( a.length() == 0 && b.length() == 0){
            NewStr = NewStr + "@@";
        }else{
            if( a.length() == 0 && b.length() > 0){
                NewStr = NewStr + "@" + b.charAt(b.length()-1);
            }else{
                if( a.length() > 0 && b.length() == 0){
                    NewStr = NewStr + a.charAt(0) + "@";
                }else{
                    if(a.length() > 0 && b.length() > 0){
                        NewStr = NewStr + a.charAt(0) + b.charAt(b.length()-1);
                    }
                }
            }
        }
        return NewStr;
    }
    //#3 Warm-Up 2
    public static boolean doubleX(String str) {
        int num = str.indexOf("x");
        if(num == -1){
            return false;
        }
        if(num+1 >= str.length()){
            return false;
        }
        if(str.substring(num + 1, num + 2).equals("x")){
            return true;
        }
        return false;
    }
    //#4 Array 1
    public static boolean double23(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        if( nums[0] == 3 && nums[0] == nums[1] || nums[0] == 2 && nums[0] == nums[1]){
            return true;
        }else{
            return false;
        }
    }
    //#5 Logic 1
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if( cigars < 40 ){
            return false;
        }else{
            if( cigars >= 40 && isWeekend == true){
                return true;
            }else{
                if( cigars >= 40 && cigars <= 60 && isWeekend == false){
                    return true;
                }
            }
        }
        return false;
    }
    //#6 Logic 2
    public static int noTeenSum(int a, int b, int c) {
        int total = 0;
        if( a >= 13 && a < 15 || a > 16 && a <= 19){
            a = 0;
        }
        if( b >= 13 && b < 15 || b > 16 && b <= 19){
            b = 0;
        }
        if( c >= 13 && c < 15 || c > 16 && c <= 19){
            c = 0;
        }
        total = a + b + c;
        return total;
    }
    //#7 String 2
    public static boolean bobThere(String str) {
        for(int i = 0; i< str.length()-2; i++){
            if(str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")){
                return true;
            }
        }
        return false;
    }


}



