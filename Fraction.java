public class Fraction
{
    private int numberator;
    private int denominator;

    Fraction(int _numberator, int _denominator)
    {
        this.numberator = _numberator;
        this.denominator = _denominator;
    }

    /*public void getInfo()
    {
        System.out.println("Ts = " + numberator + ", MS = " + denominator);
    }*/

    public int getNumberator()
    {
        return numberator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public static void main(String args[])
    {
        Fraction Obj = new Fraction(4, 5);
        //Obj.getInfo();
        Fraction Obj1 = new Fraction(6, 9);
        System.out.println(Obj.getDenominator());
    }

    static void sum()
    {
        
    }
}