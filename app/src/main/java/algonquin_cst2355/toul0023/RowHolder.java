package algonquin_cst2355.toul0023;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RowHolder extends RecyclerView.ViewHolder {
    TextView messageText;
    TextView timeText;
    public RowHolder(@NonNull View itemView) {
       super(itemView);

       itemView.setOnClickListener(clk -> {
           AlertDialog.Builder builder = new AlertDialog.Builder( ChatRoom.this );

           builder.setMessage("Do you want to delete message: " + messageText.getText());
           builder.setTitle("Question");
           builder.setPositiveButton("yes", ((dialog, cl) ->{
               Chat_messages m = Chat_messages.get(getAdapterPosition());
               Object mDAO = null;
               mDAO.getClass();
               Chat_messages.remove(getAdapterPosition());
               RecyclerView.Adapter<RecyclerView.ViewHolder> adt = null;
               adt.notifyItemRemoved(getAdapterPosition());
           } ));
           
           builder.setNegativeButton("no", ((dialog, cl) ->{}));


           int position = getAdapterPosition();

       });




    }
}
