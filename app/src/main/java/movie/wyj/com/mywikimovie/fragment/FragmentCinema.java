package movie.wyj.com.mywikimovie.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import movie.wyj.com.mywikimovie.R;
import movie.wyj.com.mywikimovie.base.BaseFragment;
import movie.wyj.com.mywikimovie.base.BasePresenter;

/**
 * Created by lenovo on 2018/11/28.
 */

public class FragmentCinema extends BaseFragment {


    @Override
    public Context context() {
        return getActivity();
    }

    @Override
    protected int getContentView() {
        return R.layout.frame_movie;
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }

    @Override
    protected void initData() {

    }
}

