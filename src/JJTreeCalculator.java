import java.io.StringReader;

import jjtree.EG2;
import jjtree.ParseException;
import jjtree.SimpleNode;

public class JJTreeCalculator implements ICalculator
{

	@Override
	public Double calculate(String formula) throws ParseException
	{
		EG2 parser = new EG2(new StringReader(formula));
		SimpleNode n = parser.Start();
		
		n.dump("");
		return null;
	}

}
