package bb.springstuff.scf;

import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Test implements RequestHandler<Integer, String> {

	@Override
	public String handleRequest(Integer input, com.amazonaws.services.lambda.runtime.Context context) {
		// TODO Auto-generated method stub
		return String.valueOf(input);
	}
}
