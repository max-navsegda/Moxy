package max.com.moxy;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Maxim on 1/5/2018.
 */

public interface HelloWorldView extends MvpView {
    void showMessage(int message);
}
