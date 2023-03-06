package scripts;

import java.io.FileWriter;
import java.io.IOException;

public class TechnicalComponents {
	public static void writeJSon(String jsonString, String fileName) throws IOException {
		String jsonNameString = "src/test/java/data/" + fileName + ".json";
		FileWriter file = new FileWriter(jsonNameString);
		file.write(jsonString.replace("\\", ""));
		file.flush();
		file.close();
	}
}
