package N0;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: V, reason: collision with root package name */
    public static final boolean f3651V;

    /* renamed from: W, reason: collision with root package name */
    public static final List f3652W;

    /* renamed from: X, reason: collision with root package name */
    public static final ThreadPoolExecutor f3653X;

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f3654A;

    /* renamed from: B, reason: collision with root package name */
    public Bitmap f3655B;

    /* renamed from: C, reason: collision with root package name */
    public Canvas f3656C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f3657D;

    /* renamed from: E, reason: collision with root package name */
    public RectF f3658E;

    /* renamed from: F, reason: collision with root package name */
    public O0.a f3659F;

    /* renamed from: G, reason: collision with root package name */
    public Rect f3660G;

    /* renamed from: H, reason: collision with root package name */
    public Rect f3661H;

    /* renamed from: I, reason: collision with root package name */
    public RectF f3662I;

    /* renamed from: J, reason: collision with root package name */
    public RectF f3663J;
    public Matrix K;

    /* renamed from: L, reason: collision with root package name */
    public final float[] f3664L;

    /* renamed from: M, reason: collision with root package name */
    public Matrix f3665M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3666N;

    /* renamed from: O, reason: collision with root package name */
    public EnumC0193a f3667O;

    /* renamed from: P, reason: collision with root package name */
    public final Semaphore f3668P;

    /* renamed from: Q, reason: collision with root package name */
    public Handler f3669Q;

    /* renamed from: R, reason: collision with root package name */
    public u f3670R;

    /* renamed from: S, reason: collision with root package name */
    public final u f3671S;

    /* renamed from: T, reason: collision with root package name */
    public float f3672T;

    /* renamed from: U, reason: collision with root package name */
    public int f3673U;

    /* renamed from: d, reason: collision with root package name */
    public C0202j f3674d;

    /* renamed from: e, reason: collision with root package name */
    public final Z0.e f3675e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3676f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3677g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3678h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3679i;
    public R0.a j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public A4.d f3680l;

    /* renamed from: m, reason: collision with root package name */
    public Map f3681m;

    /* renamed from: n, reason: collision with root package name */
    public String f3682n;

    /* renamed from: o, reason: collision with root package name */
    public final W0.d f3683o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3684p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3685q;

    /* renamed from: r, reason: collision with root package name */
    public V0.c f3686r;

    /* renamed from: s, reason: collision with root package name */
    public int f3687s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3688t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3689u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3690v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3691w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3692x;

    /* renamed from: y, reason: collision with root package name */
    public H f3693y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3694z;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT <= 25) {
            z8 = true;
        } else {
            z8 = false;
        }
        f3651V = z8;
        f3652W = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f3653X = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Z0.d());
    }

    public x() {
        Z0.e eVar = new Z0.e();
        this.f3675e = eVar;
        this.f3676f = true;
        this.f3677g = false;
        this.f3678h = false;
        this.f3673U = 1;
        this.f3679i = new ArrayList();
        this.f3683o = new W0.d(16);
        this.f3684p = false;
        this.f3685q = true;
        this.f3687s = 255;
        this.f3692x = false;
        this.f3693y = H.f3576d;
        this.f3694z = false;
        this.f3654A = new Matrix();
        this.f3664L = new float[9];
        this.f3666N = false;
        I1.a aVar = new I1.a(2, this);
        this.f3668P = new Semaphore(1);
        this.f3671S = new u(this, 1);
        this.f3672T = -3.4028235E38f;
        eVar.addUpdateListener(aVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final S0.e eVar, final Object obj, final R3.r rVar) {
        V0.c cVar = this.f3686r;
        if (cVar == null) {
            this.f3679i.add(new w() { // from class: N0.r
                @Override // N0.w
                public final void run() {
                    x.this.a(eVar, obj, rVar);
                }
            });
            return;
        }
        boolean z8 = true;
        if (eVar == S0.e.f5198c) {
            cVar.e(rVar, obj);
        } else {
            S0.f fVar = eVar.f5200b;
            if (fVar != null) {
                fVar.e(rVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f3686r.h(eVar, 0, arrayList, new S0.e(new String[0]));
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((S0.e) arrayList.get(i4)).f5200b.e(rVar, obj);
                }
                z8 = true ^ arrayList.isEmpty();
            }
        }
        if (z8) {
            invalidateSelf();
            if (obj == B.f3563z) {
                t(this.f3675e.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (!this.f3677g) {
            if (this.f3676f) {
                if (context != null) {
                    Matrix matrix = Z0.k.f7301a;
                    if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c() {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            return;
        }
        R3.r rVar = X0.q.f6841a;
        Rect rect = c0202j.k;
        List list = Collections.EMPTY_LIST;
        V0.c cVar = new V0.c(this, new V0.e(list, c0202j, "__container", -1L, 1, -1L, null, list, new T0.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), c0202j.j, c0202j);
        this.f3686r = cVar;
        if (this.f3689u) {
            cVar.q(true);
        }
        this.f3686r.f6245L = this.f3685q;
    }

    public final void d() {
        Z0.e eVar = this.f3675e;
        if (eVar.f7270p) {
            eVar.cancel();
            if (!isVisible()) {
                this.f3673U = 1;
            }
        }
        this.f3674d = null;
        this.f3686r = null;
        this.j = null;
        this.f3672T = -3.4028235E38f;
        eVar.f7269o = null;
        eVar.f7267m = -2.1474836E9f;
        eVar.f7268n = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        C0202j c0202j;
        V0.c cVar = this.f3686r;
        if (cVar != null) {
            EnumC0193a enumC0193a = this.f3667O;
            if (enumC0193a == null) {
                enumC0193a = EnumC0193a.f3580d;
            }
            if (enumC0193a == EnumC0193a.f3581e) {
                z8 = true;
            } else {
                z8 = false;
            }
            u uVar = this.f3671S;
            ThreadPoolExecutor threadPoolExecutor = f3653X;
            Semaphore semaphore = this.f3668P;
            Z0.e eVar = this.f3675e;
            if (z8) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException unused) {
                    if (z8) {
                        semaphore.release();
                        if (cVar.K == eVar.a()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (z8) {
                        semaphore.release();
                        if (cVar.K != eVar.a()) {
                            threadPoolExecutor.execute(uVar);
                        }
                    }
                    throw th;
                }
            }
            if (z8 && (c0202j = this.f3674d) != null) {
                float f8 = this.f3672T;
                float a3 = eVar.a();
                this.f3672T = a3;
                if (Math.abs(a3 - f8) * c0202j.b() >= 50.0f) {
                    t(eVar.a());
                }
            }
            if (this.f3678h) {
                try {
                    if (this.f3694z) {
                        l(canvas, cVar);
                    } else {
                        g(canvas);
                    }
                } catch (Throwable unused2) {
                    Z0.c.f7255a.getClass();
                }
            } else if (this.f3694z) {
                l(canvas, cVar);
            } else {
                g(canvas);
            }
            this.f3666N = false;
            if (z8) {
                semaphore.release();
                if (cVar.K == eVar.a()) {
                    return;
                }
                threadPoolExecutor.execute(uVar);
            }
        }
    }

    public final void e() {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            return;
        }
        H h8 = this.f3693y;
        int i4 = Build.VERSION.SDK_INT;
        boolean z8 = c0202j.f3613o;
        int i8 = c0202j.f3614p;
        int ordinal = h8.ordinal();
        boolean z9 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z8 && i4 < 28) || i8 > 4 || i4 <= 25))) {
            z9 = true;
        }
        this.f3694z = z9;
    }

    public final void g(Canvas canvas) {
        V0.c cVar = this.f3686r;
        C0202j c0202j = this.f3674d;
        if (cVar != null && c0202j != null) {
            Matrix matrix = this.f3654A;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preTranslate(r3.left, r3.top);
                matrix.preScale(r3.width() / c0202j.k.width(), r3.height() / c0202j.k.height());
            }
            cVar.g(canvas, matrix, this.f3687s, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3687s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            return -1;
        }
        return c0202j.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            return -1;
        }
        return c0202j.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public final A4.d i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3680l == null) {
            A4.d dVar = new A4.d(getCallback());
            this.f3680l = dVar;
            String str = this.f3682n;
            if (str != null) {
                dVar.f299i = str;
            }
        }
        return this.f3680l;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.f3666N) {
            this.f3666N = true;
            if ((!f3651V || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Z0.e eVar = this.f3675e;
        if (eVar == null) {
            return false;
        }
        return eVar.f7270p;
    }

    public final void j() {
        this.f3679i.clear();
        Z0.e eVar = this.f3675e;
        eVar.g(true);
        Iterator it = eVar.f7262f.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (!isVisible()) {
            this.f3673U = 1;
        }
    }

    public final void k() {
        float c6;
        float b4;
        if (this.f3686r == null) {
            this.f3679i.add(new v(this, 1));
            return;
        }
        e();
        boolean b9 = b(h());
        Z0.e eVar = this.f3675e;
        if (b9 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f7270p = true;
                boolean d2 = eVar.d();
                Iterator it = eVar.f7261e.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, d2);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                if (eVar.d()) {
                    c6 = eVar.b();
                } else {
                    c6 = eVar.c();
                }
                eVar.h((int) c6);
                eVar.f7265i = 0L;
                eVar.f7266l = 0;
                if (eVar.f7270p) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f3673U = 1;
            } else {
                this.f3673U = 2;
            }
        }
        if (!b(h())) {
            Iterator it2 = f3652W.iterator();
            S0.h hVar = null;
            while (it2.hasNext()) {
                hVar = this.f3674d.d((String) it2.next());
                if (hVar != null) {
                    break;
                }
            }
            if (hVar != null) {
                n((int) hVar.f5204b);
            } else {
                if (eVar.f7263g < 0.0f) {
                    b4 = eVar.c();
                } else {
                    b4 = eVar.b();
                }
                n((int) b4);
            }
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.f3673U = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, V0.c cVar) {
        boolean z8;
        int ceil;
        if (this.f3674d != null && cVar != null) {
            if (this.f3656C == null) {
                this.f3656C = new Canvas();
                this.f3663J = new RectF();
                this.K = new Matrix();
                this.f3665M = new Matrix();
                this.f3657D = new Rect();
                this.f3658E = new RectF();
                this.f3659F = new O0.a();
                this.f3660G = new Rect();
                this.f3661H = new Rect();
                this.f3662I = new RectF();
            }
            canvas.getMatrix(this.K);
            canvas.getClipBounds(this.f3657D);
            Rect rect = this.f3657D;
            this.f3658E.set(rect.left, rect.top, rect.right, rect.bottom);
            this.K.mapRect(this.f3658E);
            f(this.f3657D, this.f3658E);
            if (this.f3685q) {
                this.f3663J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                cVar.a(this.f3663J, null, false);
            }
            this.K.mapRect(this.f3663J);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            RectF rectF = this.f3663J;
            rectF.set(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                ViewParent parent = ((View) callback).getParent();
                if (parent instanceof ViewGroup) {
                    z8 = !((ViewGroup) parent).getClipChildren();
                    if (!z8) {
                        RectF rectF2 = this.f3663J;
                        Rect rect2 = this.f3657D;
                        rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    }
                    ceil = (int) Math.ceil(this.f3663J.width());
                    int ceil2 = (int) Math.ceil(this.f3663J.height());
                    if (ceil <= 0 && ceil2 > 0) {
                        Bitmap bitmap = this.f3655B;
                        if (bitmap != null && bitmap.getWidth() >= ceil && this.f3655B.getHeight() >= ceil2) {
                            if (this.f3655B.getWidth() > ceil || this.f3655B.getHeight() > ceil2) {
                                Bitmap createBitmap = Bitmap.createBitmap(this.f3655B, 0, 0, ceil, ceil2);
                                this.f3655B = createBitmap;
                                this.f3656C.setBitmap(createBitmap);
                                this.f3666N = true;
                            }
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                            this.f3655B = createBitmap2;
                            this.f3656C.setBitmap(createBitmap2);
                            this.f3666N = true;
                        }
                        if (this.f3666N) {
                            Matrix matrix = this.K;
                            float[] fArr = this.f3664L;
                            matrix.getValues(fArr);
                            float f8 = fArr[0];
                            float f9 = fArr[4];
                            Matrix matrix2 = this.K;
                            Matrix matrix3 = this.f3654A;
                            matrix3.set(matrix2);
                            matrix3.preScale(width, height);
                            RectF rectF3 = this.f3663J;
                            matrix3.postTranslate(-rectF3.left, -rectF3.top);
                            matrix3.postScale(1.0f / f8, 1.0f / f9);
                            this.f3655B.eraseColor(0);
                            this.f3656C.setMatrix(Z0.k.f7301a);
                            this.f3656C.scale(f8, f9);
                            cVar.g(this.f3656C, matrix3, this.f3687s, null);
                            this.K.invert(this.f3665M);
                            this.f3665M.mapRect(this.f3662I, this.f3663J);
                            f(this.f3661H, this.f3662I);
                        }
                        this.f3660G.set(0, 0, ceil, ceil2);
                        canvas.drawBitmap(this.f3655B, this.f3660G, this.f3661H, this.f3659F);
                        return;
                    }
                }
            }
            z8 = false;
            if (!z8) {
            }
            ceil = (int) Math.ceil(this.f3663J.width());
            int ceil22 = (int) Math.ceil(this.f3663J.height());
            if (ceil <= 0) {
            }
        }
    }

    public final void m() {
        float b4;
        if (this.f3686r == null) {
            this.f3679i.add(new v(this, 0));
            return;
        }
        e();
        boolean b9 = b(h());
        Z0.e eVar = this.f3675e;
        if (b9 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f7270p = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f7265i = 0L;
                if (eVar.d() && eVar.k == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.k == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f7262f.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f3673U = 1;
            } else {
                this.f3673U = 3;
            }
        }
        if (!b(h())) {
            if (eVar.f7263g < 0.0f) {
                b4 = eVar.c();
            } else {
                b4 = eVar.b();
            }
            n((int) b4);
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.f3673U = 1;
            }
        }
    }

    public final void n(int i4) {
        if (this.f3674d == null) {
            this.f3679i.add(new q(this, i4, 2));
        } else {
            this.f3675e.h(i4);
        }
    }

    public final void o(int i4) {
        if (this.f3674d == null) {
            this.f3679i.add(new q(this, i4, 0));
        } else {
            Z0.e eVar = this.f3675e;
            eVar.i(eVar.f7267m, i4 + 0.99f);
        }
    }

    public final void p(String str) {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            this.f3679i.add(new p(this, str, 1));
        } else {
            S0.h d2 = c0202j.d(str);
            if (d2 != null) {
                o((int) (d2.f5204b + d2.f5205c));
                return;
            }
            throw new IllegalArgumentException(A.j.p("Cannot find marker with name ", str, "."));
        }
    }

    public final void q(String str) {
        C0202j c0202j = this.f3674d;
        ArrayList arrayList = this.f3679i;
        if (c0202j == null) {
            arrayList.add(new p(this, str, 0));
            return;
        }
        S0.h d2 = c0202j.d(str);
        if (d2 != null) {
            int i4 = (int) d2.f5204b;
            int i8 = ((int) d2.f5205c) + i4;
            if (this.f3674d == null) {
                arrayList.add(new t(this, i4, i8));
                return;
            } else {
                this.f3675e.i(i4, i8 + 0.99f);
                return;
            }
        }
        throw new IllegalArgumentException(A.j.p("Cannot find marker with name ", str, "."));
    }

    public final void r(int i4) {
        if (this.f3674d == null) {
            this.f3679i.add(new q(this, i4, 1));
        } else {
            this.f3675e.i(i4, (int) r0.f7268n);
        }
    }

    public final void s(String str) {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            this.f3679i.add(new p(this, str, 2));
        } else {
            S0.h d2 = c0202j.d(str);
            if (d2 != null) {
                r((int) d2.f5204b);
                return;
            }
            throw new IllegalArgumentException(A.j.p("Cannot find marker with name ", str, "."));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f3687s = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Z0.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z8, z9);
        if (z8) {
            int i4 = this.f3673U;
            if (i4 == 2) {
                k();
                return visible;
            }
            if (i4 == 3) {
                m();
                return visible;
            }
        } else {
            if (this.f3675e.f7270p) {
                j();
                this.f3673U = 3;
                return visible;
            }
            if (isVisible) {
                this.f3673U = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3679i.clear();
        Z0.e eVar = this.f3675e;
        eVar.g(true);
        eVar.e(eVar.d());
        if (!isVisible()) {
            this.f3673U = 1;
        }
    }

    public final void t(float f8) {
        C0202j c0202j = this.f3674d;
        if (c0202j == null) {
            this.f3679i.add(new s(this, f8, 2));
        } else {
            this.f3675e.h(Z0.g.f(c0202j.f3610l, c0202j.f3611m, f8));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
