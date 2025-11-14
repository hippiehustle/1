package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import o.C1175C;
import o.C1178a0;
import o.C1205o;
import o.C1209q;

/* loaded from: classes.dex */
public class G {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f11604b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f11605c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f11606d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f11607e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f11608f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f11609g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final t.j f11610h = new t.j(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11611a = new Object[2];

    public C1205o a(Context context, AttributeSet attributeSet) {
        return new C1205o(context, attributeSet);
    }

    public C1209q b(Context context, AttributeSet attributeSet) {
        return new C1209q(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.buttonStyle);
    }

    public o.r c(Context context, AttributeSet attributeSet) {
        return new o.r(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.checkboxStyle);
    }

    public C1175C d(Context context, AttributeSet attributeSet) {
        return new C1175C(context, attributeSet);
    }

    public C1178a0 e(Context context, AttributeSet attributeSet) {
        return new C1178a0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        t.j jVar = f11610h;
        Constructor constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11604b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f11611a);
    }
}
