package com.example.theguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class PartyFoodFragment extends Fragment {


    public PartyFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.party_food_location_name1, R.string.party_food_location_description1,
                R.string.party_food_location_address1, R.string.party_food_location_basic_information1,
                R.string.party_food_location_additional_information1, R.drawable.chinesischerturm));
        locations.add(new Location(R.string.party_food_location_name2, R.string.party_food_location_description2,
                R.string.party_food_location_address2, R.string.party_food_location_basic_information2,
                R.string.party_food_location_additional_information2, R.drawable.hofbrauehaus));
        locations.add(new Location(R.string.party_food_location_name3, R.string.party_food_location_description3,
                R.string.party_food_location_address3, R.string.party_food_location_basic_information3,
                R.string.party_food_location_additional_information3, R.drawable.christkindmarktresidenz));

        // Create an LocationAdapter, whose data source is a list of Locations. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter;
        adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}