import java.util.*;

public class Emp
{
    String name,empid,category;
    float bpay,hra,da,npay,pf,grosspay,allowance;
    double incometax;
    Scanner sc = new Scanner(System.in);
    public Emp(String na,String emp,String cat,float bp,float hr,float d,float allow)
    {
        bpay =bp ;
        hra=hr ;
        da=d;
        npay=0;
        pf=0;
        grosspay=0;
        incometax=0;
        allowance=allow;
        name =na;
        empid=emp;
        category=cat;
    }

    public void getGross()
    {
        grosspay = hra+da+bpay+allowance;
        pf=(float)0.12*grosspay;
    }

    public void calTax()
    {
        switch (category)
        {
            case "nc": case "NC":
                if(grosspay<=250000) {
                    incometax=0;
                }
                else if(grosspay>250000&&grosspay<=500000) {
                    incometax=0.05*(grosspay-250000-pf);
                } else if (grosspay>500000&&grosspay<=1000000) {
                    incometax=12500+(0.2*(grosspay-500000-pf));
                }
                else {
                    incometax=112500+(0.3*(grosspay-1000000-pf));
                }
                break;
            case "sc": case "SC":
                if(grosspay<=300000) {
                    incometax=0;
                }
                else if(grosspay>300000&&grosspay<=500000) {
                    incometax=0.05*(grosspay-300000-pf);
                } else if (grosspay>500000&&grosspay<=1000000) {
                    incometax=10000+(0.2*(grosspay-500000-pf));
                }
                else {
                    incometax=112500+(0.3*(grosspay-1000000-pf));
                }
                break;
            case "ssc": case "SSC":
                if(grosspay<=500000) {
                    incometax=0;
                }
                else if(grosspay>500000&&grosspay<=1000000) {
                    incometax=0.2*(grosspay-pf);
                }
                else {
                    incometax=100000+(0.3*(grosspay-1000000-pf));
                }
                break;
            default:
                System.out.println("Wrong category entered");
                break;
        }
    }

    public void getNet()
    {
        npay=grosspay-pf-(float)incometax;
    }
}