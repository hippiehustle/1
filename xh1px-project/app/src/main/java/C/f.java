package C;

import A.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c f532a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f533b;

    /* renamed from: c, reason: collision with root package name */
    public int f534c;

    /* renamed from: d, reason: collision with root package name */
    public final int f535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536e;

    /* renamed from: f, reason: collision with root package name */
    public final int f537f;

    /* renamed from: g, reason: collision with root package name */
    public final int f538g;

    /* renamed from: h, reason: collision with root package name */
    public int f539h;

    /* renamed from: i, reason: collision with root package name */
    public int f540i;
    public int j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f541l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f542m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f543n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f544o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f545p;

    public f(int i4) {
        super(i4, -2);
        this.f533b = false;
        this.f534c = 0;
        this.f535d = 0;
        this.f536e = -1;
        this.f537f = -1;
        this.f538g = 0;
        this.f539h = 0;
        this.f545p = new Rect();
    }

    public final boolean a(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return this.f543n;
        }
        return this.f542m;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar;
        this.f533b = false;
        this.f534c = 0;
        this.f535d = 0;
        this.f536e = -1;
        this.f537f = -1;
        this.f538g = 0;
        this.f539h = 0;
        this.f545p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.a.f413b);
        this.f534c = obtainStyledAttributes.getInteger(0, 0);
        this.f537f = obtainStyledAttributes.getResourceId(1, -1);
        this.f535d = obtainStyledAttributes.getInteger(2, 0);
        this.f536e = obtainStyledAttributes.getInteger(6, -1);
        this.f538g = obtainStyledAttributes.getInt(5, 0);
        this.f539h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f533b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f8530w;
            if (TextUtils.isEmpty(string)) {
                cVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f8530w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f8532y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f8531x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    cVar = (c) constructor.newInstance(context, attributeSet);
                } catch (Exception e9) {
                    throw new RuntimeException(j.o("Could not inflate Behavior subclass ", string), e9);
                }
            }
            this.f532a = cVar;
        }
        obtainStyledAttributes.recycle();
        c cVar2 = this.f532a;
        if (cVar2 != null) {
            cVar2.g(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.f533b = false;
        this.f534c = 0;
        this.f535d = 0;
        this.f536e = -1;
        this.f537f = -1;
        this.f538g = 0;
        this.f539h = 0;
        this.f545p = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f533b = false;
        this.f534c = 0;
        this.f535d = 0;
        this.f536e = -1;
        this.f537f = -1;
        this.f538g = 0;
        this.f539h = 0;
        this.f545p = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f533b = false;
        this.f534c = 0;
        this.f535d = 0;
        this.f536e = -1;
        this.f537f = -1;
        this.f538g = 0;
        this.f539h = 0;
        this.f545p = new Rect();
    }
}
