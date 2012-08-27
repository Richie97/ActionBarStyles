package com.richieapps.actionbarstyles;

import android.content.Intent;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

/**
 * User: ericrichardson
 * Date: 8/26/12
 * Time: 8:53 PM
 */
public class StyleFragment extends SherlockFragment{
    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TITLE, "title");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "title");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Sharing stuff");
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                        break;
            case android.R.id.home:
                //Home Nav stuff.
        }
        return super.onOptionsItemSelected(item);
    }
}
