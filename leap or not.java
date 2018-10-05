class Main {
  public static void main(String[] args) {
   int year=2000;
   boolean leap=false;
   if(year % 4 == 0)
{
  leap = true;
}
else
{
  leap=false;
}
if(year % 400 == 0)
{
  leap=false;
}
else
{
  leap=true;
}
if(leap)
{
  System.out.println(" yes ");
}
else
{
  System.out.println(" no ");
}
  }}
        
