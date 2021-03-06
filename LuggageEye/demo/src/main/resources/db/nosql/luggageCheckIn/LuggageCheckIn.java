package db.nosql.luggageCheckIn;

import java.util.Date;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "paymentRecord")
public class LuggageCheckIn{

    @Id
    private long checkInID;
    private String passengerName;
    private int checkInDate;

}

