package ph.edu.dlsu.hellofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cobalt on 1/15/16.
 */
public class MyFragment extends Fragment {
    public MyFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false); // false - no need to reattach
        return rootView;
    }
}
