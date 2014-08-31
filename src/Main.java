import jjtree.ParseException;

public class Main
{
	public static void main(String[] args) throws ParseException
	{
		ICalculator calc = new JJTreeCalculator();
		calc.calculate("1 + 2;");
	}
}
