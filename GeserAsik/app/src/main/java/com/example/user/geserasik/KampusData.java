package com.example.user.geserasik;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class KampusData {
    Context context;
    List<KampusModel> kampusModels = new ArrayList<>();
    MainView view;
    public KampusData(MainView view,Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        KampusModel kampus;
        kampus= new KampusModel("BEM FTI 2019", R.drawable.bem);
        kampusModels.add(kampus);
        kampus= new KampusModel("UKMK ALBERTUS MAGNUS",R.drawable.ukm);
        kampusModels.add(kampus);
        kampus= new KampusModel("HIMASISFO",R.drawable.himasisfo);
        kampusModels.add(kampus);
        kampus= new KampusModel("BEM KM 2019",R.drawable.km);
        kampusModels.add(kampus);
        kampus= new KampusModel("OSIS 2015/2016",R.drawable.osis);
        kampusModels.add(kampus);
        kampus= new KampusModel("MISDINAR INDONESIA",R.drawable.misdinar);
        kampusModels.add(kampus);
        view.onSuccess(kampusModels);
    }
}
