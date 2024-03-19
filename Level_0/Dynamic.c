#include<stdio.h>
#include<stdlib.h>
int main()
{
    int n,*p;
    scanf("%d",&n);
    p=(int*)malloc(sizeof(int)*n);
    p=(int *)calloc(n,sizeof(int));
    for(int i=0;i<n;scanf("%d",&p[i++]));
    free(p);
}