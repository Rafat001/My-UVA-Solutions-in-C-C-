#include<stdio.h>
int main()
{
    int n;
    while(scanf("%d",&n)==1)
    {
        if(n==0)
        {
            break;
        }
        else
        {
            if(n>=101)
            {
                printf("f91(%d) = %d\n",n,n-10);
            }
            else
            {
                printf("f91(%d) = 91\n",n);
            }
        }
    }
    return 0;
}