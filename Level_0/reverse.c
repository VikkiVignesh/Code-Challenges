#include<stdio.h>
int rev(int i)
{  
    int n=i;
    int res=0;
    while (n!=0)
    {
      res=res*10+n%10;
      n=n/10;
    }
    return res;
}
int main()
{
  printf("Enter any Number : ");
  int num;
  scanf("%d",&num);
  printf("Revrse of %d is %d",num,rev(num));
  return 0;
}
