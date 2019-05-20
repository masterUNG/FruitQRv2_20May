package kiky.beam.lilly.th.ac.rmutk.fruitqr;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckUserAnPhoneFragment extends Fragment {


    public CheckUserAnPhoneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Check Controller
        checkController();

    }

    private void checkController() {
        Button button = getView().findViewById(R.id.btnCheck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nameEditText = getView().findViewById(R.id.edtName);
                EditText userEditText = getView().findViewById(R.id.edtUser);
                EditText phoneEditText = getView().findViewById(R.id.edtPhone);

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_check_user_an_phone, container, false);
    }

}
