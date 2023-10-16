// Write a java program to display alternate character from a given string.

class Slip4B 
{
    public static void main(String a[]) 
      {
        if(a.length>0)
       {
        String s = a[0];
        for (int i = 0; i < s.length(); i = i + 2) 
        {
            System.out.print(" " + s.charAt(i));
        }
     
      }
    else
       System.out.println("enter the input");
  }
}
