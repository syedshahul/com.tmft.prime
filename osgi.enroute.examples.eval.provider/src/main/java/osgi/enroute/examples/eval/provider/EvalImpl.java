package osgi.enroute.examples.eval.provider;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.examples.eval.api.Eval;
import parsii.eval.Expression;
import parsii.eval.Parser;
import parsii.eval.Scope;
@Component
public class EvalImpl implements Eval{
	Scope scope = new Scope();

	public double eval(String expression) throws Exception {
		Expression expr = Parser.parse(expression);
		return expr.evaluate();
	}
}
