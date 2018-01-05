package max.com.moxy;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by Maxim on 1/5/2018.
 */

@InjectViewState
public class HelloWorldPresenter extends MvpPresenter<HelloWorldView> {
    public HelloWorldPresenter() {
        getViewState().showMessage(R.string.hello_world);
    }
}