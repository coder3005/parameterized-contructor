/* Parameterized Constructor */
class A
{
    int x,y;
    A(int a, int b)//parameterized
    {
        x=a; y=b;
    }
    void show()
    {
        System.out.print(x+" "+y);
    }
}
class B 
{
    public static void main(String[] args) {
        A r=new A(100,200);
        r.show();
    }
}