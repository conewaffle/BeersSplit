package com.example.beerssplit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.beerssplit.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * An activity representing a list of Items. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ItemDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ItemListActivity extends AppCompatActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.item_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        setupRecyclerView(recyclerView);

    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(this, Beer.getDummyBeers(), mTwoPane));
    }

    public static class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final ItemListActivity mParentActivity;
        private final List<Beer> mValues;
        private final boolean mTwoPane;
        //private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
              //  DummyContent.DummyItem item = (DummyContent.DummyItem) view.getTag();

                //if (mTwoPane) {
                 //   Bundle arguments = new Bundle();
                  //  arguments.putString(ItemDetailFragment.ARG_ITEM_ID, item.id);
                   // ItemDetailFragment fragment = new ItemDetailFragment();
                   // fragment.setArguments(arguments);
                   // mParentActivity.getSupportFragmentManager().beginTransaction()
                   //         .replace(R.id.item_detail_container, fragment)
                   //         .commit();
              // } else {
               //     Context context = view.getContext();
               //    Intent intent = new Intent(context, ItemDetailActivity.class);
                //    intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, item.id);

                 //   context.startActivity(intent);
              //  }
           // }
        //};

        SimpleItemRecyclerViewAdapter(ItemListActivity parent,
                                      List<Beer> items,
                                      boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mIdView.setText(mValues.get(position).getName());
            holder.mContentView.setText(mValues.get(position).getShortDescription());

            holder.itemView.setTag(mValues.get(position));
            //holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            final TextView mIdView;
            final TextView mContentView;

            ViewHolder(View view) {
                super(view);
                mIdView = (TextView) view.findViewById(R.id.name);
                mContentView = (TextView) view.findViewById(R.id.desc);
                view.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                Beer beer = mValues.get(position);

                //String name = beer.getName();
                //String shortDesc = beer.getShortDescription();
                //String desc = beer.getDescription();
                //double abv = beer.getAbv();
                //int ibuMin = beer.getIbuMin();
                //int ibuMax = beer.getIbuMax();
                //int srmMin = beer.getSrmMin();
                //int srmMax = beer.getSrmMax();
                //String brewery = beer.getBrewery();

                if (mTwoPane) {
                    Bundle arguments = new Bundle();

                    arguments.putString(ItemDetailFragment.ARG_ITEM_ID, beer.getName());
                    arguments.putString(ItemDetailFragment.ARG_ITEM_SD, beer.getShortDescription());
                    arguments.putString(ItemDetailFragment.ARG_ITEM_DESC, beer.getDescription());
                    arguments.putString(ItemDetailFragment.ARG_ITEM_BREWERY, beer.getBrewery());
                    arguments.putInt(ItemDetailFragment.ARG_ITEM_IMIN, beer.getIbuMin());
                    arguments.putInt(ItemDetailFragment.ARG_ITEM_IMAX, beer.getIbuMax());
                    arguments.putInt(ItemDetailFragment.ARG_ITEM_SMIN, beer.getSrmMin());
                    arguments.putInt(ItemDetailFragment.ARG_ITEM_SMAX, beer.getSrmMax());
                    arguments.putDouble(ItemDetailFragment.ARG_ITEM_ABV, beer.getAbv());

                    ItemDetailFragment fragment = new ItemDetailFragment();
                    fragment.setArguments(arguments);
                    mParentActivity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.item_detail_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ItemDetailActivity.class);
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, beer.getName());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_SD, beer.getShortDescription());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_BREWERY, beer.getBrewery());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_DESC, beer.getDescription());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_IMIN, beer.getIbuMin());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_IMAX, beer.getIbuMax());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_SMIN, beer.getSrmMin());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_SMAX, beer.getSrmMax());
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_ABV, beer.getAbv());


                    context.startActivity(intent);
                }


            }
        }
    }
}
