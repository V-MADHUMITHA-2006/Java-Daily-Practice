
public class StringCreation {
    public static void main(String[] args) {
        String str = "java programming";
        //Length of string
        int len = str.length();
        System.out.println("Length of the String is :"+len);
        
        //charaAt()-->Acess the character in string
        char ch = str.charAt(12);
        System.out.println("Aceess Character :" + ch);
       
        // SubString(BeginngIndex,EndIndex+1)
        String substr=str.substring(5,12);  
        System.out.println("Substring :" +substr);
        
        //To uppercase
        System.out.println("UpperCase :"+str.toUpperCase());
        //toLowerCase
        System.out.println("LowerCase :"+ str.toLowerCase());
       
       
        //Compare 
        String name= "Madhu";
        boolean isSame= name.equals("madhu");
        System.out.println("With Case Sensetive :"+isSame);

        boolean isSameCase= name.equalsIgnoreCase("madhu");
         System.out.println("Without Case Sensetive :"+isSameCase);
        
         //to check a substring contains or not
        System.out.println("<java> contains: "+str.contains("java"));
       
        //to replace substring or character
        System.out.println("Replace Python:" +str.replace("java","python"));

    }
}
