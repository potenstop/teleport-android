package top.potens.teleport.util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.DrawableRes;

/**
 * Created by wenshao on 2018/8/25.
 * 类型转换
 */
public class TypeConvert {
    /**
     * Drawable资源转路径的形式
     * @param context   Context
     * @param id        Drawable id
     * @return          对应的路径
     */
    public static String getResourcesUri(Context context, @DrawableRes int id) {
        Resources resources = context.getResources();
        return ContentResolver.SCHEME_ANDROID_RESOURCE + "://" +
                resources.getResourcePackageName(id) + "/" +
                resources.getResourceTypeName(id) + "/" +
                resources.getResourceEntryName(id);
    }
}
