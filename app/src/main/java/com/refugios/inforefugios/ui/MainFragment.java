package com.refugios.inforefugios.ui;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.refugios.inforefugios.R;
import com.refugios.inforefugios.adapter.MainAdapter;
import com.refugios.inforefugios.common.BBDD;
import com.refugios.inforefugios.common.Sierra;
import com.refugios.inforefugios.data.LiveData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    //ATRIBUTOS
    private RecyclerView mRecyclerView_sierras;
    private RecyclerView.LayoutManager mLayoutManager_sierras;
    private Sierra sierra;
    private ArrayList<Sierra> sierras = new ArrayList<>();
    private ProgressBar loading_sierra;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();

        if (!LiveData.getSierras().isEmpty()){
            sierras = LiveData.getSierras();
        }

        if (sierras.isEmpty()){
            String consulta = "select * from sierra";
            new CargarSierras(consulta).execute();
        }else{
            mRecyclerView_sierras.setVisibility(View.VISIBLE);
            loading_sierra.setVisibility(View.GONE);
            lanzarAdapter();
        }
    }

    @Override
    public void onStop() {
        if (!sierras.isEmpty()){
            LiveData.setSierras(sierras);
        }
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        loading_sierra = view.findViewById(R.id.loading_sierras);
        mRecyclerView_sierras = view.findViewById(R.id.recyclerView_sierras);

        mLayoutManager_sierras = new LinearLayoutManager(view.getContext());
        mRecyclerView_sierras.setLayoutManager(mLayoutManager_sierras);

        return view;
    }

    public void lanzarAdapter() {
        MainAdapter adapter = new MainAdapter(getActivity(), sierras);
        mRecyclerView_sierras.setLayoutManager(mLayoutManager_sierras);
        mRecyclerView_sierras.setAdapter(adapter);
    }

    public class CargarSierras extends AsyncTask<Void, Void, ResultSet> {
        String consulta;
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        public CargarSierras(String consulta) {
            this.consulta = consulta;
        }

        @Override
        protected ResultSet doInBackground(Void... params) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://" + BBDD.getIp() + BBDD.getBd(), BBDD.getUsuario(), BBDD.getClave());
                statement = connection.createStatement();
                publishProgress();

                resultSet = statement.executeQuery(consulta);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return resultSet;
        }

        @Override
        protected void onPostExecute(ResultSet resultSet) {
            super.onPostExecute(resultSet);


            try {
                while (resultSet.next()) {
                    sierras.add(new Sierra(
                            resultSet.getInt("id_sierra"),
                            resultSet.getString("nombre"),
                            resultSet.getString("info"),
                            resultSet.getString("imagen"),
                            resultSet.getString("latitud"),
                            resultSet.getString("longitud")
                    ));
                }
                lanzarAdapter();

                connection.close();
                statement.cancel();
                this.resultSet.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            mRecyclerView_sierras.setVisibility(View.VISIBLE);
            loading_sierra.setVisibility(View.GONE);

        }

    }//FIN CARGARSIERRA

}
