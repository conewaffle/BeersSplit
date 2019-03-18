package com.example.beerssplit;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.beerssplit.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";
    public static final String ARG_ITEM_SD = "item_sd";
    public static final String ARG_ITEM_DESC = "item_desc";
    public static final String ARG_ITEM_BREWERY = "item_brew";
    public static final String ARG_ITEM_ABV = "item_abv";
    public static final String ARG_ITEM_SMIN = "item_smin";
    public static final String ARG_ITEM_SMAX = "item_smax";
    public static final String ARG_ITEM_IMIN = "item_imin";
    public static final String ARG_ITEM_IMAX = "item_imax";

    /**
     * The dummy content this fragment is presenting.
     */
    private String name;
    private String desc;
    private String shortDesc;
    private String brewery;
    private int smin;
    private int smax;
    private double abv;
    private int imin;
    private int imax;


    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            name = getArguments().getString(ARG_ITEM_ID);
            desc = getArguments().getString(ARG_ITEM_DESC);
            shortDesc = getArguments().getString(ARG_ITEM_SD);
            brewery = getArguments().getString(ARG_ITEM_BREWERY);
            smin = getArguments().getInt(ARG_ITEM_SMIN);
            smax = getArguments().getInt(ARG_ITEM_SMAX);
            abv = getArguments().getDouble(ARG_ITEM_ABV);
            imin = getArguments().getInt(ARG_ITEM_IMIN);
            imax = getArguments().getInt(ARG_ITEM_IMAX);


            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(name);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (name!= null) {
            ((TextView) rootView.findViewById(R.id.name)).setText(name);
            ((TextView) rootView.findViewById(R.id.sd)).setText(shortDesc);
            ((TextView) rootView.findViewById(R.id.desc)).setText(desc);
            ((TextView) rootView.findViewById(R.id.desc)).setMovementMethod(new ScrollingMovementMethod());
            ((TextView) rootView.findViewById(R.id.brewery)).setText(brewery);
            ((TextView) rootView.findViewById(R.id.ibu)).setText("IBU: " + imin + " - " + imax);
            ((TextView) rootView.findViewById(R.id.srm)).setText("SRM: " + smin + " - " + smax);
            ((TextView) rootView.findViewById(R.id.abv)).setText(Double.toString(getArguments().getDouble(ARG_ITEM_ABV)) + " %");

        }

        return rootView;
    }
}
