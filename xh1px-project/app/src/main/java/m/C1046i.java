package m;

import P.U;
import P.V;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046i {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f12372c;

    /* renamed from: d, reason: collision with root package name */
    public V f12373d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12374e;

    /* renamed from: b, reason: collision with root package name */
    public long f12371b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C1045h f12375f = new C1045h(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12370a = new ArrayList();

    public final void a() {
        if (!this.f12374e) {
            return;
        }
        Iterator it = this.f12370a.iterator();
        while (it.hasNext()) {
            ((U) it.next()).b();
        }
        this.f12374e = false;
    }

    public final void b() {
        View view;
        if (this.f12374e) {
            return;
        }
        Iterator it = this.f12370a.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            long j = this.f12371b;
            if (j >= 0) {
                u8.c(j);
            }
            Interpolator interpolator = this.f12372c;
            if (interpolator != null && (view = (View) u8.f4228a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f12373d != null) {
                u8.d(this.f12375f);
            }
            View view2 = (View) u8.f4228a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f12374e = true;
    }
}
