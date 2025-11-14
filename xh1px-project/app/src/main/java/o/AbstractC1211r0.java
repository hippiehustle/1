package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1211r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f13364a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e9) {
            e9.printStackTrace();
        }
        f13364a = field;
    }
}
