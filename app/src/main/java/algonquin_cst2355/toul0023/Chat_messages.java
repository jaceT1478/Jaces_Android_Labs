package algonquin_cst2355.toul0023;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Chat_messages {

    @ColumnInfo(name="message")
    protected String message;

    @ColumnInfo(name = "TimeSent")
    protected String timeSpent;

    @ColumnInfo(name = "SendOrReceive")
    protected int sendOrReceive;

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;
}
