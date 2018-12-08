package movie.wyj.com.mywikimovie.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

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

public class FragmentSet extends BaseFragment {


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
