package movie.wyj.com.mywikimovie.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;

import butterknife.ButterKnife;

/**
 * Created by lenovo on 2018/10/14.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {
    protected Intent intent;
    protected Bundle bundle;
    protected Activity mContext;
    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(getIdContentView());

        mContext = this;

        intent = mContext.getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }

        ButterKnife.bind(this);
        presenter = getPresenter();
        attachView();
        initData();
        OtherAction();

    }

    protected abstract int getIdContentView();

    protected abstract P getPresenter();

    protected void attachView(){
        if(presenter != null){
            presenter.attach(this);
        }
    }

    protected void initData(){}


    protected void OtherAction(){}

    public void startActivity(Class<?> clazz) {
        intent = new Intent(mContext, clazz);
        startActivity(intent);
    }

    public void startActivity(Class<?> clazz, Bundle bundle) {
        intent = new Intent(mContext, clazz);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    protected void detachView(){
        if(presenter != null){
            presenter.detach();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        detachView();
    }

}
