package top.potens.teleport.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import top.potens.teleport.R;
import top.potens.teleport.util.XBossUtil;

/**
 * Created by wenshao on 2018/8/24.
 */
public class SplashActivity extends Activity {
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext = getApplicationContext();

        XBossUtil.init(new XBossUtil.InitConnectionCallback() {
            @Override
            public void operationComplete() {
                startActivity(new Intent(mContext, IndexActivity.class));
            }
        });
    }
}
