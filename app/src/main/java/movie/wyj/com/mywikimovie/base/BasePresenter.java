package movie.wyj.com.mywikimovie.base;

import android.content.Context;

/**
 * Created by lenovo on 2018/11/6.
 */

public abstract class BasePresenter<V extends IView> {

    protected V iView;

    public BasePresenter() {
        getModel();
    }

    protected abstract void getModel();

    public void attach(V iView) {
        this.iView = iView;
    }

    public void detach() {
        this.iView = null;
    }

    protected Context context(){
        if(iView != null){
            return iView.context();
        }
        return null;
    }
}
