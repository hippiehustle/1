package C5;

import android.animation.ObjectAnimator;
import i0.C0878a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends p {
    public static final int[] k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f665l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f666m = {1000, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final g f667n = new g(Float.class, "animationFraction", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final g f668o = new g(Float.class, "completeEndFraction", 1);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f669c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f670d;

    /* renamed from: e, reason: collision with root package name */
    public final C0878a f671e;

    /* renamed from: f, reason: collision with root package name */
    public final i f672f;

    /* renamed from: g, reason: collision with root package name */
    public int f673g;

    /* renamed from: h, reason: collision with root package name */
    public float f674h;

    /* renamed from: i, reason: collision with root package name */
    public float f675i;
    public c j;

    public h(i iVar) {
        super(0);
        this.f673g = 0;
        this.j = null;
        this.f672f = iVar;
        this.f671e = new C0878a(1);
    }

    public final void r() {
        int i4 = 0;
        if (this.f669c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f667n, 0.0f, 1.0f);
            this.f669c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f669c.setInterpolator(null);
            this.f669c.setRepeatCount(-1);
            this.f669c.addListener(new f(this, i4));
        }
        if (this.f670d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f668o, 0.0f, 1.0f);
            this.f670d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f670d.setInterpolator(this.f671e);
            this.f670d.addListener(new f(this, 1));
        }
        this.f673g = 0;
        ((n) ((ArrayList) this.f707b).get(0)).f704c = this.f672f.f678c[0];
        this.f675i = 0.0f;
        this.f669c.start();
    }
}
