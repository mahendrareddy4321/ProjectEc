int s1=10,s2=10,s3=10;
int l1=-1,l2=-1,l3=-1;
while(input1!=0)
{
    int r=input1%10;
    if(r>l1)
    {
        l1=r;
    }
    if(r<s1)
    {
        s1=r;
    }
    input1=input1/10;
}
while(input2!=0)
{
    int r=input2%10;
    if(r>l2)
    {
        l2=r;
    }
    if(r<s2)
    {
        s2=r;
    }
    input2=input2/10;
}
while(input3!=0)
{
    int r=input3%10;
    if(r>l3)
    {
        l3=r;
    }
    if(r<s3)
    {
        s3=r;
    }
    input3=input3/10;
}
return (s1+s2+s3)-(l1+l2+l3);