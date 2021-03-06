package com.pgssoft.forgetAdaptersDemo.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

import com.pgssoft.forgetAdaptersDemo.models.PersonModel;
import com.pgssoft.forgetAdaptersDemo.viewmodels.interfaces.IMainActivityAccess;
import com.pgssoft.forgetadapters.common.ObservableCollection;

public class MainActivityViewModel extends BaseObservable {

    // Private fields ---------------------------------------------------------

    private IMainActivityAccess access;
    private ObservableArrayList<PersonModel> people;

    public MainActivityViewModel(IMainActivityAccess access) {

        this.access = access;

        people = new ObservableArrayList<>();
        people.add(new PersonModel("Wojciech", "Sura", "PGS Software S.A."));
        people.add(new PersonModel("Bill", "Gates", "Microsoft"));
        people.add(new PersonModel("Steve", "Jobs", "Apple"));
    }

    public void addNew() {

        people.add(new PersonModel("John", "Doe", "ACME"));
    }

    public ObservableArrayList<PersonModel> getPeople() {

        return people;
    }
}
