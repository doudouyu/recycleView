package life.bean.com.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 作者 : bean on 2017/3/30/0030.
 * 注释 :
 */
public class MyAdapter extends BaseRecyclerAdapter<String>{

    public MyAdapter(RecyclerView v, Collection datas, int itemLayoutId) {
        super(v, datas, itemLayoutId);
    }

    @Override
    public void convert(RecyclerHolder holder, String item, int position, boolean isScrolling) {
        holder.setText(R.id.tv,item);
    }

}
