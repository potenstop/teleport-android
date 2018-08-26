package top.potens.teleport.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.potens.teleport.R;
import top.potens.teleport.util.XBossUtil;

/**
 * Created by wenshao on 2018/8/24.
 */
public class SplashActivity extends Activity {
    private static final Logger logger = LoggerFactory.getLogger(SplashActivity.class);

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext = getApplicationContext();

        XBossUtil.init(new XBossUtil.InitConnectionCallback() {
            @Override
            public void operationComplete() {
                logger.debug("init/operationComplete");
                startActivity(new Intent(mContext, IndexActivity.class));
            }
        });
    }
}
