#include<stdio.h>
#include<stdbool.h>
#include<math.h>
bool isarmstrong(int n)
{
    int res=0;
    int num=n;
    int length=len(n);
    while(num!=0)
    {
        int rem=num%10;
        res+=pow(rem,length);
        num/=10;
    }
    return (res==n);
}
int len(int i)
{
    int cnt=0;
    while(i!=0)
    {
        cnt++;
        i/=10;
    }
    return cnt;
}
int main()
{
    printf("Enter any Number ");
     int num;
     scanf("%d",&num);
     printf("Lenght of num is %d \n",len(num));
     if(isarmstrong(num))
     {
        printf("%d is ArmStrong Number \n",num);
     }
     else
     {
        printf("%d is not an ArmStrong Number\n",num);
     }
     
}
