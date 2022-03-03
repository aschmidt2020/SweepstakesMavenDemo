package maven_demo;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSVParser {
	 
	public List<Contestant> parse() {
		try {
			CSVReader reader = new CSVReaderBuilder(new FileReader(Paths.get("C:/Users/audsc/eclipse-workspace/maven_demo/src/main/resources/MOCK_DATA.csv").toFile())).withSkipLines(1).build();
			List<Contestant> csv_objectlist = reader.readAll().stream().map(data -> {
				Contestant csvObject = new Contestant();
				csvObject.setId(Integer.parseInt(data[0]));
				csvObject.setFirstName(data[1]);
				csvObject.setLastName(data[2]);
				csvObject.setEmail(data[3]);
				csvObject.setWinner(false);
				return csvObject;
			}).collect(Collectors.toList());
			// csv_objectlist.forEach(System.out::println);
			return csv_objectlist;
		}
	catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	}
}
