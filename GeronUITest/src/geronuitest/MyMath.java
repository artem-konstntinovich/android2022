
package geronuitest;


public class MyMath {
    //область видимости доступность тип результата имя (список внешних перменных)
    public static double calcGeron (double a, double b, double c)
    {
        double p = (a + b + c)/ 2.0;
        double Area = Math.sqrt(p * (p - a) * (p - b) * (p - c) );
        return Area;
    }
    
}
