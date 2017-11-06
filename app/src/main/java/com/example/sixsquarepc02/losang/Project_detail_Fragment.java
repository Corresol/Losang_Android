package com.example.sixsquarepc02.losang;

import android.Manifest;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
//https://inducesmile.com/android/android-mapview-example-tutorial/

/**
 * Created by sixsquarepc02 on 20/2/17.
 */
public class Project_detail_Fragment extends Fragment {
    FragmentManager fm;
    TextView close_text,title_text,description_text,company_name,company_text,project_name,project_text,contact_name,contact_text,start_date,start_text;
    TextView end_date,end_text,description_name,description_text2;

    MapView mapView;
    GoogleMap map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.project_detail_fragment_layout,
                container, false);


        close_text=(TextView)view.findViewById(R.id.close);
        title_text=(TextView)view.findViewById(R.id.title);
        description_text=(TextView)view.findViewById(R.id.description);
        company_name=(TextView)view.findViewById(R.id.company_name);
        company_text=(TextView)view.findViewById(R.id.company_text);
        project_name=(TextView)view.findViewById(R.id.address_name);
        project_text=(TextView)view.findViewById(R.id.address_text);
        contact_name=(TextView)view.findViewById(R.id.contact_name);
        contact_text=(TextView)view.findViewById(R.id.contact_text);

        start_date=(TextView)view.findViewById(R.id.start_date);
        start_text=(TextView)view.findViewById(R.id.start_text);
        end_date=(TextView)view.findViewById(R.id.end_date);
        end_text=(TextView)view.findViewById(R.id.end_text);
        description_name=(TextView)view.findViewById(R.id.description_name);
        description_text2=(TextView)view.findViewById(R.id.description_text);


        Typeface face_book = Typeface.createFromAsset(getActivity().getAssets(), "fonts/book.ttf");
        close_text.setTypeface(face_book);
        title_text.setTypeface(face_book);
        description_text.setTypeface(face_book);
        company_name.setTypeface(face_book);
        company_text.setTypeface(face_book);
        project_name.setTypeface(face_book);
        project_text.setTypeface(face_book);
        contact_name.setTypeface(face_book);
        contact_text.setTypeface(face_book);
        start_date.setTypeface(face_book);
        start_text.setTypeface(face_book);
        end_date.setTypeface(face_book);
        end_text.setTypeface(face_book);
        description_name.setTypeface(face_book);
        description_text2.setTypeface(face_book);


close_text.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.home_container, new Projects_Fragment());
        ft.commit();
    }
});

// Gets the MapView from the XML layout and creates it
        mapView = (MapView) view.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);

        // Gets to GoogleMap from the MapView and does initialization stuff
        map = mapView.getMap();
        map.getUiSettings().setMyLocationButtonEnabled(false);
//        map.addMarker(new MarkerOptions()
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.location))
//                .anchor(0.0f, 1.0f)
//                .position(new LatLng(8.5710, 76.8663)));

        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.

        }
        map.setMyLocationEnabled(true);

        // Needs to call MapsInitializer before doing any CameraUpdateFactory calls
        MapsInitializer.initialize(this.getActivity());

        // Updates the location and zoom of the MapView
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(34.052235, -118.243683), 10);
        map.animateCamera(cameraUpdate);
        return view;
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

}
