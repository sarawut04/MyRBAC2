package rbac.sunprakon.kittisak.myrbac.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rbac.sunprakon.kittisak.myrbac.R;

/**
 * Created by Administrator on 5/8/2560.
 */
public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_fragment,container,false);
        return view;
    }
} //Main Class
