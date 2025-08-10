public class addmatrix
{
public static void main(String args[])
{
int i,j;
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{9,8,7},{6,5,4},{3,2,1}};
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+b[i][j]+"\t");
}
System.out.println();
}
}
}