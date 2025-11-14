package C5;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import i.LayoutInflaterFactory2C0860C;
import i.z;
import java.util.ArrayList;
import n.t;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public Object f706a;

    /* renamed from: b, reason: collision with root package name */
    public Object f707b;

    public p(View view, Object obj) {
        o6.j.e(view, "briefView");
        this.f706a = view;
        this.f707b = obj;
    }

    public static RadialGradient e(PointF pointF, float f8, int i4) {
        o6.j.e(pointF, "position");
        return new RadialGradient(pointF.x, pointF.y, f8, i4, Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4)), Shader.TileMode.CLAMP);
    }

    public void c() {
        z zVar = (z) this.f706a;
        if (zVar != null) {
            try {
                ((LayoutInflaterFactory2C0860C) this.f707b).f11584n.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f706a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (menuItem instanceof J.a) {
            J.a aVar = (J.a) menuItem;
            if (((t.j) this.f707b) == null) {
                this.f707b = new t.j(0);
            }
            MenuItem menuItem2 = (MenuItem) ((t.j) this.f707b).get(aVar);
            if (menuItem2 == null) {
                t tVar = new t((Context) this.f706a, aVar);
                ((t.j) this.f707b).put(aVar, tVar);
                return tVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int h(int i4, int i8) {
        int j = j(i4);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            int j5 = j(i11);
            i9 += j5;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = j5;
            }
        }
        if (i9 + j > i8) {
            return i10 + 1;
        }
        return i10;
    }

    public int i(int i4, int i8) {
        int j = j(i4);
        if (j == i8) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            int j5 = j(i10);
            i9 += j5;
            if (i9 == i8) {
                i9 = 0;
            } else if (i9 > i8) {
                i9 = j5;
            }
        }
        if (j + i9 > i8) {
            return 0;
        }
        return i9;
    }

    public abstract int j(int i4);

    public void k() {
        ((SparseIntArray) this.f706a).clear();
    }

    public abstract void l();

    public abstract void m(Canvas canvas);

    public abstract void n();

    public abstract void o(P2.a aVar, boolean z8);

    public abstract void p();

    public void q() {
        c();
        IntentFilter d2 = d();
        if (d2.countActions() == 0) {
            return;
        }
        if (((z) this.f706a) == null) {
            this.f706a = new z(this);
        }
        ((LayoutInflaterFactory2C0860C) this.f707b).f11584n.registerReceiver((z) this.f706a, d2);
    }

    public p(Context context) {
        this.f706a = context;
    }

    public p(int i4) {
        switch (i4) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                this.f706a = new SparseIntArray();
                this.f707b = new SparseIntArray();
                return;
            default:
                ArrayList arrayList = new ArrayList();
                this.f707b = arrayList;
                arrayList.add(new Object());
                return;
        }
    }

    public p(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C) {
        this.f707b = layoutInflaterFactory2C0860C;
    }
}
