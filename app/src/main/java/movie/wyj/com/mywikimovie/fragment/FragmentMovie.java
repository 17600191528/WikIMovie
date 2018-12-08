package movie.wyj.com.mywikimovie.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import movie.wyj.com.mywikimovie.MapActivity;
import movie.wyj.com.mywikimovie.R;
import movie.wyj.com.mywikimovie.base.BaseFragment;
import movie.wyj.com.mywikimovie.base.BasePresenter;

/**
 * Created by lenovo on 2018/11/28.
 */
public class FragmentMovie extends BaseFragment {


    @BindView(R.id.frame_cinema_img_location)
    ImageView frameCinemaImgLocation;
    @BindView(R.id.frame_cinema_txt_location)
    TextView frameCinemaTxtLocation;
    @BindView(R.id.frame_cinema_img_search_default)
    ImageView frameCinemaImgSearchDefault;

    @OnClick({R.id.frame_cinema_img_location, R.id.frame_cinema_img_search_default})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.frame_cinema_img_location:
                startActivity(MapActivity.class);
                break;
            case R.id.frame_cinema_img_search_default:
                break;
        }
    }

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