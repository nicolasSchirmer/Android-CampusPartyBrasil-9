package test.cpbr_9;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.cpbr_9.R;

public class CustomAdapter  extends ArrayAdapter<itemRow> {

    Context context;

    public CustomAdapter(Context context, int resourceId,
                         List<itemRow> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    // private view holder class
    private class ViewHolder {
        TextView txtHora, txtTitle, txtPalco;
        //  RelativeLayout rootLay;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        itemRow item = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item, null);

            holder = new ViewHolder();
            // holder.rootLay = (RelativeLayout) convertView.findViewById(R.id.rootEtapa);
            holder.txtHora = (TextView) convertView.findViewById(R.id.hr);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.txtPalco = (TextView) convertView.findViewById(R.id.palco);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtHora.setText(item.getHora());
        holder.txtTitle.setText(item.getTitle());
        holder.txtPalco.setText(item.getPalco());

        return convertView;
    }
}
