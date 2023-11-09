package algonquin_cst2355.toul0023;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Chat_messages.class}, version=1)

abstract class MessageDatabase extends RoomDatabase {

        public abstract ChatMessageDAO cmDAO();
    }


