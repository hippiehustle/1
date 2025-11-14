package o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: o.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1206o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f13328a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f13329b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f13330c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13331d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f13328a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f13329b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f13330c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f13331d = true;
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
        }
    }
}
