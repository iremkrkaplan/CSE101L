import java.util.Scanner;




public class exercise01_20220808056 {
    private static Object nextDouble;



    public static void main(String[] args) {
        int b = 1;
        System.out.println(b+" "+b*b+" "+b*b*b);
        b=b+1;
        System.out.println(b+" "+b*b+" "+b*b*b);
        b=b+1;
        System.out.println(b+" "+b*b+" "+b*b*b);
        b=b+1;
        System.out.println(b+" "+b*b+" "+b*b*b);
        double c=9.5*4.5-2.5*3 ;
        double d=45.5-3.5;
        System.out.println(c/d);
        double pi2=4.0*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        double pi1=4.0*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13.0));
        double p = (pi1+pi2)/2;
        System.out.println(p);
        System.out.println("area of the circle:"+p*5.5*5.5);
        System.out.println("perimeter of circle:"+2*p*5.5);


        double q = 3.4;
        double u = 50.2;
        double e = 2.1;
        double v = 0.55;
        double g = 44.5;
        double t = 5.9;
        double x = (g*v-u*t) / (q*v-u*e);
        double y = (q*t-g*e) / (q*v-u*e);
        System.out.println("x = " + x + " y = " + y);


        Scanner input = new Scanner(System.in);
        System.out.println(" enter celcius: ");
        double f = input.nextDouble();
        System.out.println("fahrenheit:"+ ((f*1.8)+32.0));
        System.out.println("enter radius:");
        double i = input.nextDouble();
        System.out.println("area:"+ i*i*p);
        System.out.println("enter height:");
        double z = input.nextDouble();
        System.out.println("volume:"+i*i*p*z);


        int topl=0;
        System.out.println("enter a number between 0 and 1000");
        int number = input.nextInt();
        while (number>0){
                  topl += number % 10;
                  number /= 10;
        }
        System.out.println("the sum of the digits: "+ topl);


        System.out.println("dakikayı giriniz:");
        int dakika = input.nextInt();
        int yil= dakika / 525600;
        int gun= ( dakika/60 / 24)% 365;
        System.out.println( dakika + "dakika yaklaşık " + yil+" yıl "+"ve"+gun +" gündür");
        
        
        System.out.println("enter your budget:");
        double budget = input.nextDouble();
        double budget1 = budget*(1.0+0.05/12);
        double budget2 = budget1*(1+0.05/12)+budget1;
        double budget3 = 3.0*budget+budget*6.0*(0.05/12);
        double budget4 = (4.0*budget)+budget*10.0*(0.05/12);
        double budget5 = (5*budget)+budget*15.0*(0.05/12);
        double budget6 = (6*budget)+budget*21.0*(0.05/12);
        System.out.println("after a month your value is: "+ budget1);
        System.out.println("second month value :" +budget2);
        System.out.println("third month value:" + budget3);
        System.out.println("fourth month value is: "+budget4);
        System.out.println("fifth month value: "+budget5);
        System.out.println("after 6 months your value is: "+ budget6);

        System.out.println("enter your pound: ");
        double pn = input.nextDouble();
        double kg = pn*0.45359237;
        System.out.println("enter your height: ");
        double in = input.nextDouble();
        double he = in*0.0254;
        System.out.println("Your BMI is: " + kg/(he*he));


        System.out.println("enter 1st x coordinate:");
        int xx = input.nextInt();
        System.out.println("enter 1st y coordinate:");
        int yy = input.nextInt();
        System.out.println("enter scnd x coordinate");
        int aa = input.nextInt();
        System.out.println("enter scnd y coordinate");
        int bb = input.nextInt();
        System.out.println("distance between them: "+Math.pow(((xx-aa)*(xx-aa)+
                (yy-bb)*(yy-bb)),0.5 ));

        System.out.println("enter the kl side of the triangle klm: ");
        double kl= input.nextDouble();
        System.out.println("enter km side: ");
        double km = input.nextDouble();
        System.out.println("enter mn side:");
        double mn = input.nextDouble();
        double su = (kl+km+mn)/2;
        System.out.println("area: "+ Math.pow ((su*(su-kl)*(su-km)*(su-mn)),0.5));

    }
}