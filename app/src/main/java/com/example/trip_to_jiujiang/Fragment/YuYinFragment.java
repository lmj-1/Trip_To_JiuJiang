package com.example.trip_to_jiujiang.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.trip_to_jiujiang.R;

public class YuYinFragment extends Fragment {
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.yuyindaolan_fragment,container,false);
        return view;
    }
}
