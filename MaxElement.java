public class MaxElement 
{
	public static void main(String args[]) {
	int [] arr = new int [] {34,87,56,12,89};  
    int max = arr[0];  
    for (int i = 0; i < arr.length; i++) 
    {    
       if(arr[i] > max)  
           max = arr[i];  
    }  
    System.out.println("Largest element present in given array: " + max);  
}
}