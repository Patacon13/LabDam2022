package com.mdgz.dam.labdam2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.mdgz.dam.labdam2022.databinding.FragmentBusquedaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BusquedaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BusquedaFragment extends Fragment {

    private Spinner alojamientos;
    private Spinner capacidad;
    private Spinner ciudad;
    private CheckBox wifi;
    private EditText rangoMin;
    private EditText rangoMax;
    private Button buscar;
    private FragmentBusquedaBinding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BusquedaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BusquedaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BusquedaFragment newInstance(String param1, String param2) {
        BusquedaFragment fragment = new BusquedaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = FragmentBusquedaBinding.inflate(getLayoutInflater());
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        alojamientos = binding.alojamiento;
        capacidad = binding.capacidad;
        ciudad = binding.ciudad;
        wifi = binding.wifi;
        rangoMin = binding.rangoMin;
        rangoMax = binding.rangoMax;
        buscar = binding.botonBuscar;
        // Inflate the layout for this fragment

        buscar.setOnClickListener(new ListenerBuscar());
        return inflater.inflate(R.layout.fragment_busqueda, container, false);
    }
    public class ListenerBuscar implements View.OnClickListener{

        @Override
        public void onClick(View view) {

        }
    }
}