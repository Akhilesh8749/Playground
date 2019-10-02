package com.example.login;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.login.Deligate.DeligeteInterface;
import com.example.login.Model.RequestModel;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

public class FragmrntRequestList extends AppCompatActivity implements DeligeteInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmrnt_request_list);

        Request_List ReqList= new Request_List();
        ReqList.setDeligeteInterface(this);
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.popBackStackImmediate(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentLayout,ReqList);
        fragmentTransaction.commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfiguration){
        super.onConfigurationChanged(newConfiguration);
        if(newConfiguration.orientation==Configuration.ORIENTATION_PORTRAIT){
            Fragment ReqView= new Request_View();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragmentLayout,ReqView);
            fragmentTransaction.commit();

        }
        else {
            Fragment ReqView = new Request_View();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.popBackStackImmediate(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragmentLayout1, ReqView);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void deligeteMethod(RequestModel requestModel) {

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            Fragment ReqView= new Request_View();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragmentLayout,ReqView);
            fragmentTransaction.commit();

            ((Request_View) ReqView).setData(requestModel);
        }
        else {
            Fragment ReqView= new Request_View();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.popBackStackImmediate(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(R.id.fragmentLayout1,ReqView);
            fragmentTransaction.commit();

            ((Request_View) ReqView).setData(requestModel);
        }
    }
}