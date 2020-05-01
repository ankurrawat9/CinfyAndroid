package com.example.cinfysystems.ui.profilepic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.cinfysystems.R;

public class ProfilepicFragment extends Fragment {

    private ProfilepicViewModel galleryViewModel;
      ImageView i1;
    private static final int CAMERA_REQUEST=1888;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ProfilepicViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profilepic, container, false);

        final Button b1 = root.findViewById(R.id.button);
        final Button b2 = root.findViewById(R.id.button2);

        i1 = root.findViewById(R.id.imageView);
     /*   i2 = root.findViewById(imageView2);*/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Saving your profile picture", Toast.LENGTH_SHORT).show();
            }
        });




        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==CAMERA_REQUEST)
        {
            Bitmap photo= (Bitmap) data.getExtras().get("data");
            i1.setImageBitmap(photo);


        }

    }
}