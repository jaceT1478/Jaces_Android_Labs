package algonquin_cst2355.toul0023;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface ChatMessageDAO {


    @Insert
    public long insertMessage(Chat_messages m);
    @Query("Select * from chat_messages")
    List<Chat_messages> getAllMessages();

    @Delete
    void deleteMessages(Chat_messages m);
}
