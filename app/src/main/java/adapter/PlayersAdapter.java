package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;


import e.wolfsoft1.lineups_fifa_uikit.R;
import fragment.JapanFragment;
import model.PlayersModel;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.MyViewHolder> {

    Context context;
    private ArrayList<PlayersModel> playersModelArrayList;
    JapanFragment japanFragment;

    public PlayersAdapter(Context context, ArrayList<PlayersModel> playersModelArrayList, JapanFragment japanFragment) {
        this.context = context;
        this.playersModelArrayList = playersModelArrayList;
        this.japanFragment = japanFragment;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pop, parent, false);


        return new PlayersAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        PlayersModel modelfoodrecycler = playersModelArrayList.get(position);

//popup visibility code

        holder.linearfifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupWindow popupwindow_obj = popupDisplay();
                popupwindow_obj.showAsDropDown(holder.linearfifa, -40, -40);
            }
        });


        if (position == 1) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 3) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 5) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 7) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 9) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 11) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 13) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 15) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 16) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 17) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 19) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 21) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 22) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 23) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 24) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 26) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 27) {
            holder.linearfifa.setVisibility(View.GONE);
        }
        if (position == 28) {
            holder.linearfifa.setVisibility(View.GONE);


        }
        if (position == 29) {
            holder.linearfifa.setVisibility(View.GONE);


        }
        if (position == 30) {
            holder.linearfifa.setVisibility(View.GONE);


        }
        if (position == 31) {
            holder.linearfifa.setVisibility(View.GONE);


        }
        if (position == 32) {
            holder.linearfifa.setVisibility(View.GONE);


        }


    }
//code of popdown
    public PopupWindow popdowndisplay() {

        final PopupWindow popupWindow1 = new PopupWindow();

        // inflate your layout or dynamically add view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = inflater.inflate(R.layout.france1, null);

        popupWindow1.setFocusable(true);
        popupWindow1.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow1.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow1.setContentView(view1);



        return popupWindow1;
    }
//code of popup
    public PopupWindow popupDisplay() {

        final PopupWindow popupWindow = new PopupWindow();

        // inflate your layout or dynamically add view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.popup, null);

        popupWindow.setFocusable(true);
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(view);

        //background of popup
        japanFragment.dimBackGround();
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                japanFragment.unDimBackGround();
            }
        });

        return popupWindow;
    }

    @Override
    public int getItemCount() {
        return playersModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        LinearLayout linearfifa;
        TextView player1;

        public MyViewHolder(View itemView) {
            super(itemView);

            player1 = itemView.findViewById(R.id.player1);
            linearfifa = itemView.findViewById(R.id.linearfifa);
        }
    }
}
