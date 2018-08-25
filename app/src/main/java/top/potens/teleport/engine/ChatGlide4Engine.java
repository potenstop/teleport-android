package top.potens.teleport.engine;

import android.content.Context;
import android.widget.ImageView;

import top.potens.ptchat.engine.ChatImageEngine;
import top.potens.teleport.image.GlideApp;


/**
 * Created by wenshao on 2018/8/25.
 * chat页面图片加载
 */
public class ChatGlide4Engine implements ChatImageEngine {
    @Override
    public void loadHead(Context context, String url, ImageView view) {
       GlideApp.with(context)
                .load(url)
                .configConcatHead()
                .into(view);

    }

    @Override
    public void loadImage(Context context, String url, ImageView view) {
        GlideApp.with(context)
                .load(url)
                .into(view);

    }
}
