package max.com.moxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class HelloWorldActivity extends MvpAppCompatActivity implements HelloWorldView {

    @InjectPresenter
    HelloWorldPresenter mHelloWorldPresenter;

    private TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloWorldTextView = ((TextView) findViewById(R.id.textView));
    }

    @Override
    public void showMessage(int message) {
        mHelloWorldTextView.setText(message);
    }
}