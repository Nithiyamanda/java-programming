class Main {
  public static void main(String[] args) {
      int c=0,a,temp;  
    int N=153; 
    temp=N;  
    while(N>0)  
    {  
    a=N%10;  
    N=N/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");   
   }  
}  