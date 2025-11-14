package P;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0256d f4241a;

    /* renamed from: b, reason: collision with root package name */
    public List f4242b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4243c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4244d;

    public a0(C0256d c0256d) {
        super(0);
        this.f4244d = new HashMap();
        this.f4241a = c0256d;
    }

    public final d0 a(WindowInsetsAnimation windowInsetsAnimation) {
        d0 d0Var = (d0) this.f4244d.get(windowInsetsAnimation);
        if (d0Var == null) {
            d0Var = new d0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                d0Var.f4259a = new b0(windowInsetsAnimation);
            }
            this.f4244d.put(windowInsetsAnimation, d0Var);
        }
        return d0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f4241a.f4257h).setTranslationY(0.0f);
        this.f4244d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        C0256d c0256d = this.f4241a;
        View view = (View) c0256d.f4257h;
        int[] iArr = (int[]) c0256d.f4258i;
        view.getLocationOnScreen(iArr);
        c0256d.f4255f = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f4243c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4243c = arrayList2;
            this.f4242b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k = Z.k(list.get(size));
            d0 a3 = a(k);
            fraction = k.getFraction();
            a3.f4259a.d(fraction);
            this.f4243c.add(a3);
        }
        t0 g8 = t0.g(null, windowInsets);
        this.f4241a.b(g8, this.f4242b);
        return g8.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        H.c c6 = H.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        H.c c9 = H.c.c(upperBound);
        C0256d c0256d = this.f4241a;
        View view = (View) c0256d.f4257h;
        int[] iArr = (int[]) c0256d.f4258i;
        view.getLocationOnScreen(iArr);
        int i4 = c0256d.f4255f - iArr[1];
        c0256d.f4256g = i4;
        view.setTranslationY(i4);
        Z.m();
        return Z.i(c6.d(), c9.d());
    }
}
