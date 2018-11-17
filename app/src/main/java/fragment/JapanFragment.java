package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

import adapter.PlayersAdapter;
import e.wolfsoft1.lineups_fifa_uikit.R;
import model.PlayersModel;

public class JapanFragment extends android.support.v4.app.Fragment {

    LinearLayout linearfifa;
//    LinearLayout player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11;

    int position = 0;

    private ArrayList<PlayersModel> playersModelArrayList;
    private RecyclerView recyclerViewfifa;
    private PlayersAdapter bAdapter;
    FrameLayout item;

//    LinearLayout lastplayer;

    String[] playera = {"Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel", "Schmelchel"};

    //    FrameLayout frame;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.temp, container, false);

//        lastplayer = view.findViewById(R.id.lastplayer);

        recyclerViewfifa = view.findViewById(R.id.recyclerViewfifa);
        recyclerViewfifa.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerViewfifa.setItemAnimator(new DefaultItemAnimator());

        item = view.findViewById(R.id.frame);

        playersModelArrayList = new ArrayList<>();

        for (int i = 0; i < playera.length; i++) {
            PlayersModel beanClassForRecyclerView_contacts = new PlayersModel(playera[i]);
            playersModelArrayList.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new PlayersAdapter(getContext(), playersModelArrayList, JapanFragment.this);
        recyclerViewfifa.setAdapter(bAdapter);


        return view;
    }
//method of popup background
    public void dimBackGround() {
        item.setAlpha(0.4F);
    }

    public void unDimBackGround() {
        item.setAlpha(1.0F);
    }

}





