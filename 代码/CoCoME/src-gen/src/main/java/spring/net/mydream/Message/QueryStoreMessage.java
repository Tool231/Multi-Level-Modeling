package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryStoreMessage{
	public int id;
	public int getId() {
		return id;
	}
					
	public void setId(int id) {
		this.id = id;
	}
}
