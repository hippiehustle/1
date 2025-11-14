package o;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: o.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1198k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f13292a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f13293b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f13294c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f13295d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f13296e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f13297f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z8;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
        } catch (ClassNotFoundException unused) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused2) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused3) {
            method = null;
            field = null;
        }
        try {
            field = cls.getField("left");
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                    try {
                        field4 = cls.getField("bottom");
                        z8 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z8 = false;
                        if (!z8) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (!z8) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (!z8) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z8 = false;
                if (!z8) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (!z8) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (!z8) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z8 = false;
            if (!z8) {
            }
        }
        if (!z8) {
            f13293b = method;
            f13294c = field;
            f13295d = field2;
            f13296e = field3;
            f13297f = field4;
            f13292a = true;
            return;
        }
        f13293b = null;
        f13294c = null;
        f13295d = null;
        f13296e = null;
        f13297f = null;
        f13292a = false;
    }
}
