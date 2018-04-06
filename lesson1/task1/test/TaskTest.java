import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

	@Test
	public void main() throws UnsupportedEncodingException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		Task.main(new String[0]);
		assertEquals(outputStream.toString("UTF-8")
						.replaceAll("\r", "").replaceAll("\n", ""), "Hello World!");
	}
}