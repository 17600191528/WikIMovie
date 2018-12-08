package movie.wyj.com.mywikimovie;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import movie.wyj.com.mywikimovie.fragment.FragmentCinema;
import movie.wyj.com.mywikimovie.fragment.FragmentMovie;
import movie.wyj.com.mywikimovie.fragment.FragmentSet;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.iv_movie)
    ImageView ivMovie;
    @BindView(R.id.iv_cinema)
    ImageView ivCinema;
    @BindView(R.id.iv_set)
    ImageView ivSet;

    private int index = 0;
    private FragmentMovie fragmentMovie;
    private FragmentCinema fragmentCinema;
    private FragmentSet fragmentSet;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        fragmentMovie = new FragmentMovie();
        fragmentCinema = new FragmentCinema();
        fragmentSet = new FragmentSet();


        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.fragment, fragmentMovie)
                .commit();

        getCut(0);
    }

    @OnClick({R.id.iv_movie, R.id.iv_cinema,  R.id.iv_set})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_movie:
                manager.beginTransaction().replace(R.id.fragment, fragmentMovie).commit();
                index = 0;
                break;
            case R.id.iv_cinema:
                manager.beginTransaction().replace(R.id.fragment, fragmentCinema).commit();
                index = 1;
                break;
            case R.id.iv_set:
                manager.beginTransaction().replace(R.id.fragment, fragmentSet).commit();
                index = 2;
                break;
        }
        getCut(index);
    }

    private void getCut(int index) {
        ivMovie.setImageResource(index == 0 ? R.mipmap.com_icon_film_selected : R.mipmap.com_icon_film_default);
        ivCinema.setImageResource(index == 1 ? R.mipmap.com_icon_cinema_selected : R.mipmap.com_icon_cinema_default);
        ivSet.setImageResource(index == 2 ? R.mipmap.com_icon_my_selected : R.mipmap.com_icon_my_default);
    }
}
