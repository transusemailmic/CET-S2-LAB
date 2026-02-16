public class Prog7 {
    public static void main(String args[]){
        String str="I Love Java Programming";
        System.out.println("Original Text: "+str);
        System.out.println("UpperCase: "+str.toUpperCase());
        System.out.println("LowerCase: "+str.toLowerCase());
        System.out.println("SubString: "+str.substring(7,10));
        System.out.println("Replace: "+str.replace("Java","Python"));
        System.out.println("Concat"+str.concat("!"));
    }
}
