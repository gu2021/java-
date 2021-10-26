 import java.util.Scanner;
public class test4
{
double pi =3.14;
public static void main(String[] args)
{
    t25();
}

public static void t1()
{
    Scanner input = new Scanner(System.in);
    int daoshu;
    int zhengshu=input.nextInt();
    int shiweishu=zhengshu/10;
    int geweishu=zhengshu%10;
    daoshu=10*geweishu+shiweishu;
    System.out.println(daoshu);
    input.close();
}
public static void t2()    
{
    Scanner input = new Scanner(System.in);

    int zhengshu=input.nextInt();
    int baiweishu=zhengshu/100;
    int shiweishu=(zhengshu%100)/10;
    int geweishu=(zhengshu%100)%10;
    System.out.println(baiweishu+shiweishu+geweishu);
    input.close();
}
public static void t3()    
{   System.out.println("请输入你的身高");
    Scanner shengao = new Scanner(System.in);
    System.out.println("请输入你的体重");
    Scanner tizhong = new Scanner(System.in);
    Double shengao1=shengao.nextDouble();
    Double tizhong1=tizhong.nextDouble();
    System.out.println((tizhong1/shengao1)/shengao1);
    shengao.close();
    tizhong.close();
}
public static void t4()
{
    System.out.println("Hello world");
    //这是一段注释
    /*这是一段注释*/
}   
public static void t5()
{   
    System.out.println();
    System.out.println("Hello world");

}
public static void t6()
{   
for(int i=1;i<5;i++)
{  
    char m ='a';
    System.out.println(m);

}
//2021/10/19学习到015
}
public static void t7()
{   
int k =(int)88.88;
System.out.println(k);
}
public static void t8()
{   
int a=5;
int b=6;
char s='s';
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b); 
System.out.println(a%b);
int sa =s+a;
System.out.println(sa);
}
public static void t9()
{

    System.out.println(6+66+"a"+6+66);

}
public static void t10()
{

    int a =10;
    int b=20;
    int c;
    c=a>b?10:20;
    System.out.println(c);
    //两只老虎+0
}
public static void t11()
{
Scanner sc= new Scanner(System.in);
int choose = sc.nextInt();
if(choose==1)
{
    System.out.println("你选择了流程一");
}
System.out.println("结束");

sc.close();
}
public static void t12()
{
Scanner sc= new Scanner(System.in);
int choose = sc.nextInt();
if(choose==1)
{
    System.out.println("你选择了流程一");
}
else
{
    System.out.println("你选择了流程二");
}
System.out.println("结束");
sc.close();

}
public static void t13()
{
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
System.out.println("请输入您要判断的数字");
if(a%2==1)
{
    System.out.println("您输入的是奇数");
}
else
{
    System.out.println("您输入的是偶数");
}
sc.close();
}
public static void t14()
{
Scanner sc = new Scanner(System.in);
int choose = sc.nextInt();
if (choose==1)
{
    System.out.println("你选择了流程一");
} 
else if (choose == 2)
{
    System.out.println("你选择了流程二");
}
else
{
    System.out.println("你选择了流程三");
}
System.out.println("结束");
sc.close();
}
public static void t15()
{   System.out.println("请选择您的方法选项");
    Scanner sc = new Scanner(System.in);
    int choose= sc.nextInt();
    switch(choose)
    {
        case 1 :
                System.out.println("您选择了方法一");
                break;
        case 2 :
                System.out.println("您选择了方法二");
                break;
        default:
                System.out.println("您输入的数据有误");
                break;
    }
}
public static void t16()
{
    System.out.println("请选择您的方法选项");
    Scanner sc = new Scanner(System.in);
    int choose= sc.nextInt();
    switch(choose)
    {
        case 12:
        case 1:
        case 2:
        System.out.println("冬季");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("春季");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("夏季");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("秋季");
        break;

    }

}
public static void t17()
{
    for(int i=1; i<10||i==10;i++)
    {
        System.err.println("hello world");
    }

}
public static void t18()
{
    for(int i=1; i<6;i++)
    {
        System.err.println(i);
    }
    for(int i=5;i>0;i--)
    {
        System.err.println(i);
    }
}
public static void t19()
{   int o=0;
    for(int i=1; i<6;i++)
    {
        System.err.println(i);
        o+=i;
    }
    System.out.println(o);

}
public static void t20()
{   int o=0;
    for(int i=0; i<6;i+=2)
    {
        System.err.println(i);
        o+=i;
    }
    System.out.println(o);

}
public static void t21()
{
    Scanner sc=new Scanner(System.in);
    int date=sc.nextInt();
    int o =0;
    for(int i=101;i<date;i++)
    {   
        
        if((((i/100)*(i/100)*(i/100))+(((i%100)/10)*((i%100)/10)*((i%100)/10))+((i%10)*(i%10)*(i%10))==i))
        {
            System.out.println(i);
            o++;
        }

    }
    System.out.println(o);
    sc.close();
}
public static void t22()
{   int i =0;
    while(i<5)
    {   i++;
        System.out.println("Hello World");
    }
}
public static void t23()
{   double i =0.1;
    int o=0;
    while(i<8844430)
    {
        i*=2;
        o++;
    }
    System.out.println(o);

}
public static void t24()
{   int i =0;
    do
    {
        System.out.println("hello world");
        i++;
    }
    while(i<5);
}
public static void t25()
{
    for(int i =1;i<5;i++)
    {   
        if(i%2==0)
        {
            break;
        }
        System.out.println(i);
    }
}   
}

