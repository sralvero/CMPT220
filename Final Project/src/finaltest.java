public class finaltest {

    public static void main(String[] args){
         
        getUnicode("2694");
        getUnicode("26E8");
        getUnicode("2661");
        // have to figure out how to print directly from a function rather than necessitate a return type 
        
    }

    public static void getUnicode(String hex) {
        // ripped from https://stackoverflow.com/a/45273638
        String encoding=hex;
        int hexNum=Integer.parseInt(encoding,16);//convert str into hex number.
        char unicode[]=Character.toChars(hexNum);
        System.out.println(unicode);
    }
}