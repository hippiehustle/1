package C5;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import b0.C0517b;
import b0.C0520e;
import b0.C0521f;
import b0.ChoreographerFrameCallbackC0516a;
import h4.AbstractC0832f;
import java.util.ArrayList;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: t, reason: collision with root package name */
    public static final j f685t = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final e f686o;

    /* renamed from: p, reason: collision with root package name */
    public final C0521f f687p;

    /* renamed from: q, reason: collision with root package name */
    public final C0520e f688q;

    /* renamed from: r, reason: collision with root package name */
    public final n f689r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f690s;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, C5.n] */
    public k(Context context, i iVar, e eVar) {
        super(context, iVar);
        this.f690s = false;
        this.f686o = eVar;
        this.f689r = new Object();
        C0521f c0521f = new C0521f();
        this.f687p = c0521f;
        c0521f.f9041b = 1.0f;
        c0521f.f9042c = false;
        c0521f.a(50.0f);
        C0520e c0520e = new C0520e(this);
        this.f688q = c0520e;
        c0520e.f9037m = c0521f;
        if (this.k != 1.0f) {
            this.k = 1.0f;
            invalidateSelf();
        }
    }

    @Override // C5.m
    public final boolean d(boolean z8, boolean z9, boolean z10) {
        boolean d2 = super.d(z8, z9, z10);
        a aVar = this.f696f;
        ContentResolver contentResolver = this.f694d.getContentResolver();
        aVar.getClass();
        float f8 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f8 == 0.0f) {
            this.f690s = true;
            return d2;
        }
        this.f690s = false;
        this.f687p.a(50.0f / f8);
        return d2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        boolean z9;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float b4 = b();
            ObjectAnimator objectAnimator = this.f697g;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z8 = true;
            } else {
                z8 = false;
            }
            ObjectAnimator objectAnimator2 = this.f698h;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f686o.a(canvas, bounds, b4, z8, z9);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f700l;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            i iVar = this.f695e;
            int i4 = iVar.f678c[0];
            n nVar = this.f689r;
            nVar.f704c = i4;
            int i8 = iVar.f682g;
            if (i8 > 0) {
                int h8 = (int) ((AbstractC1492c.h(nVar.f703b, 0.0f, 0.01f) * i8) / 0.01f);
                float f8 = nVar.f703b;
                int i9 = iVar.f679d;
                int i10 = this.f701m;
                e eVar = this.f686o;
                eVar.getClass();
                eVar.b(canvas, paint, f8, 1.0f, AbstractC0832f.j(i9, i10), h8, h8);
            } else {
                int i11 = iVar.f679d;
                int i12 = this.f701m;
                e eVar2 = this.f686o;
                eVar2.getClass();
                eVar2.b(canvas, paint, 0.0f, 1.0f, AbstractC0832f.j(i11, i12), 0, 0);
            }
            int i13 = this.f701m;
            e eVar3 = this.f686o;
            eVar3.getClass();
            eVar3.b(canvas, paint, nVar.f702a, nVar.f703b, AbstractC0832f.j(nVar.f704c, i13), 0, 0);
            int i14 = iVar.f678c[0];
            this.f686o.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f686o.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f686o.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f688q.b();
        this.f689r.f703b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean z8 = this.f690s;
        n nVar = this.f689r;
        C0520e c0520e = this.f688q;
        if (z8) {
            c0520e.b();
            nVar.f703b = i4 / 10000.0f;
            invalidateSelf();
        } else {
            c0520e.f9028b = nVar.f703b * 10000.0f;
            c0520e.f9029c = true;
            float f8 = i4;
            if (c0520e.f9032f) {
                c0520e.f9038n = f8;
            } else {
                if (c0520e.f9037m == null) {
                    c0520e.f9037m = new C0521f(f8);
                }
                C0521f c0521f = c0520e.f9037m;
                double d2 = f8;
                c0521f.f9048i = d2;
                double d3 = (float) d2;
                if (d3 <= c0520e.f9033g) {
                    if (d3 >= c0520e.f9034h) {
                        double abs = Math.abs(c0520e.j * 0.75f);
                        c0521f.f9043d = abs;
                        c0521f.f9044e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z9 = c0520e.f9032f;
                            if (!z9 && !z9) {
                                c0520e.f9032f = true;
                                if (!c0520e.f9029c) {
                                    c0520e.f9028b = c0520e.f9031e.T(c0520e.f9030d);
                                }
                                float f9 = c0520e.f9028b;
                                if (f9 <= c0520e.f9033g && f9 >= c0520e.f9034h) {
                                    ThreadLocal threadLocal = C0517b.f9012f;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new C0517b());
                                    }
                                    C0517b c0517b = (C0517b) threadLocal.get();
                                    ArrayList arrayList = c0517b.f9014b;
                                    if (arrayList.size() == 0) {
                                        if (c0517b.f9016d == null) {
                                            c0517b.f9016d = new R.g(c0517b.f9015c);
                                        }
                                        R.g gVar = c0517b.f9016d;
                                        ((Choreographer) gVar.f4988f).postFrameCallback((ChoreographerFrameCallbackC0516a) gVar.f4989g);
                                    }
                                    if (!arrayList.contains(c0520e)) {
                                        arrayList.add(c0520e);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }
}
