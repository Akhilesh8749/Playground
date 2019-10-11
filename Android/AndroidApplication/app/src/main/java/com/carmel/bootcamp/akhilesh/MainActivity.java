package com.carmel.bootcamp.akhilesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import Delegate.DelegateInterface;

public class MainActivity extends AppCompatActivity implements DelegateInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RequisitionFormFive requisitionFormFive= new RequisitionFormFive();
        requisitionFormFive.setDelegateInterface(this);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mainLayout,requisitionFormFive);
        fragmentTransaction.commit();
    }

    @Override
    public void delegateMethod() {
        AddApprover addApprover=new AddApprover();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainLayout,addApprover);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
