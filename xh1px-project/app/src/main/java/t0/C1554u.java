package t0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554u extends AbstractC1533a0 implements f0 {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f14973C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f14974D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f14975A;

    /* renamed from: B, reason: collision with root package name */
    public final L5.x f14976B;

    /* renamed from: a, reason: collision with root package name */
    public final int f14977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14978b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f14979c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f14980d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14981e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14982f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f14983g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f14984h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14985i;
    public final int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f14986l;

    /* renamed from: m, reason: collision with root package name */
    public float f14987m;

    /* renamed from: n, reason: collision with root package name */
    public int f14988n;

    /* renamed from: o, reason: collision with root package name */
    public int f14989o;

    /* renamed from: p, reason: collision with root package name */
    public float f14990p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f14993s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f15000z;

    /* renamed from: q, reason: collision with root package name */
    public int f14991q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f14992r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14994t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14995u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f14996v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f14997w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f14998x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f14999y = new int[2];

    public C1554u(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15000z = ofFloat;
        this.f14975A = 0;
        L5.x xVar = new L5.x(11, this);
        this.f14976B = xVar;
        G1.i iVar = new G1.i(1, this);
        this.f14979c = stateListDrawable;
        this.f14980d = drawable;
        this.f14983g = stateListDrawable2;
        this.f14984h = drawable2;
        this.f14981e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f14982f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f14985i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f14977a = i8;
        this.f14978b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new O5.c(this));
        ofFloat.addUpdateListener(new I5.b(3, this));
        RecyclerView recyclerView2 = this.f14993s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            RecyclerView recyclerView3 = this.f14993s;
            recyclerView3.f8968t.remove(this);
            if (recyclerView3.f8970u == this) {
                recyclerView3.f8970u = null;
            }
            ArrayList arrayList = this.f14993s.f8955m0;
            if (arrayList != null) {
                arrayList.remove(iVar);
            }
            this.f14993s.removeCallbacks(xVar);
        }
        this.f14993s = recyclerView;
        recyclerView.i(this);
        this.f14993s.f8968t.add(this);
        this.f14993s.j(iVar);
    }

    public static int i(float f8, float f9, int[] iArr, int i4, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 != 0) {
            int i11 = i4 - i9;
            int i12 = (int) (((f9 - f8) / i10) * i11);
            int i13 = i8 + i12;
            if (i13 < i11 && i13 >= 0) {
                return i12;
            }
        }
        return 0;
    }

    @Override // t0.f0
    public final void a(MotionEvent motionEvent) {
        if (this.f14996v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean h8 = h(motionEvent.getX(), motionEvent.getY());
                boolean g8 = g(motionEvent.getX(), motionEvent.getY());
                if (h8 || g8) {
                    if (g8) {
                        this.f14997w = 1;
                        this.f14990p = (int) motionEvent.getX();
                    } else if (h8) {
                        this.f14997w = 2;
                        this.f14987m = (int) motionEvent.getY();
                    }
                    j(2);
                    return;
                }
                return;
            }
            if (motionEvent.getAction() == 1 && this.f14996v == 2) {
                this.f14987m = 0.0f;
                this.f14990p = 0.0f;
                j(1);
                this.f14997w = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.f14996v == 2) {
                k();
                int i4 = this.f14997w;
                int i8 = this.f14978b;
                if (i4 == 1) {
                    float x8 = motionEvent.getX();
                    int[] iArr = this.f14999y;
                    iArr[0] = i8;
                    int i9 = this.f14991q - i8;
                    iArr[1] = i9;
                    float max = Math.max(i8, Math.min(i9, x8));
                    if (Math.abs(this.f14989o - max) >= 2.0f) {
                        int i10 = i(this.f14990p, max, iArr, this.f14993s.computeHorizontalScrollRange(), this.f14993s.computeHorizontalScrollOffset(), this.f14991q);
                        if (i10 != 0) {
                            this.f14993s.scrollBy(i10, 0);
                        }
                        this.f14990p = max;
                    }
                }
                if (this.f14997w == 2) {
                    float y4 = motionEvent.getY();
                    int[] iArr2 = this.f14998x;
                    iArr2[0] = i8;
                    int i11 = this.f14992r - i8;
                    iArr2[1] = i11;
                    float max2 = Math.max(i8, Math.min(i11, y4));
                    if (Math.abs(this.f14986l - max2) >= 2.0f) {
                        int i12 = i(this.f14987m, max2, iArr2, this.f14993s.computeVerticalScrollRange(), this.f14993s.computeVerticalScrollOffset(), this.f14992r);
                        if (i12 != 0) {
                            this.f14993s.scrollBy(0, i12);
                        }
                        this.f14987m = max2;
                    }
                }
            }
        }
    }

    @Override // t0.f0
    public final boolean b(MotionEvent motionEvent) {
        int i4 = this.f14996v;
        if (i4 == 1) {
            boolean h8 = h(motionEvent.getX(), motionEvent.getY());
            boolean g8 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (h8 || g8) {
                    if (g8) {
                        this.f14997w = 1;
                        this.f14990p = (int) motionEvent.getX();
                    } else if (h8) {
                        this.f14997w = 2;
                        this.f14987m = (int) motionEvent.getY();
                    }
                    j(2);
                    return true;
                }
                return false;
            }
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        return false;
    }

    @Override // t0.AbstractC1533a0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.f14991q == this.f14993s.getWidth() && this.f14992r == this.f14993s.getHeight()) {
            if (this.f14975A != 0) {
                if (this.f14994t) {
                    int i4 = this.f14991q;
                    int i8 = this.f14981e;
                    int i9 = i4 - i8;
                    int i10 = this.f14986l;
                    int i11 = this.k;
                    int i12 = i10 - (i11 / 2);
                    StateListDrawable stateListDrawable = this.f14979c;
                    stateListDrawable.setBounds(0, 0, i8, i11);
                    int i13 = this.f14982f;
                    int i14 = this.f14992r;
                    Drawable drawable = this.f14980d;
                    drawable.setBounds(0, 0, i13, i14);
                    if (this.f14993s.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i8, i12);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i8, -i12);
                    } else {
                        canvas.translate(i9, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i12);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i9, -i12);
                    }
                }
                if (this.f14995u) {
                    int i15 = this.f14992r;
                    int i16 = this.f14985i;
                    int i17 = i15 - i16;
                    int i18 = this.f14989o;
                    int i19 = this.f14988n;
                    int i20 = i18 - (i19 / 2);
                    StateListDrawable stateListDrawable2 = this.f14983g;
                    stateListDrawable2.setBounds(0, 0, i19, i16);
                    int i21 = this.f14991q;
                    int i22 = this.j;
                    Drawable drawable2 = this.f14984h;
                    drawable2.setBounds(0, 0, i21, i22);
                    canvas.translate(0.0f, i17);
                    drawable2.draw(canvas);
                    canvas.translate(i20, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i20, -i17);
                    return;
                }
                return;
            }
            return;
        }
        this.f14991q = this.f14993s.getWidth();
        this.f14992r = this.f14993s.getHeight();
        j(0);
    }

    public final boolean g(float f8, float f9) {
        if (f9 >= this.f14992r - this.f14985i) {
            int i4 = this.f14989o;
            int i8 = this.f14988n;
            if (f8 >= i4 - (i8 / 2) && f8 <= (i8 / 2) + i4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h(float f8, float f9) {
        int layoutDirection = this.f14993s.getLayoutDirection();
        int i4 = this.f14981e;
        if (layoutDirection == 1) {
            if (f8 > i4) {
                return false;
            }
        } else if (f8 < this.f14991q - i4) {
            return false;
        }
        int i8 = this.f14986l;
        int i9 = this.k / 2;
        if (f9 >= i8 - i9 && f9 <= i9 + i8) {
            return true;
        }
        return false;
    }

    public final void j(int i4) {
        L5.x xVar = this.f14976B;
        StateListDrawable stateListDrawable = this.f14979c;
        if (i4 == 2 && this.f14996v != 2) {
            stateListDrawable.setState(f14973C);
            this.f14993s.removeCallbacks(xVar);
        }
        if (i4 == 0) {
            this.f14993s.invalidate();
        } else {
            k();
        }
        if (this.f14996v == 2 && i4 != 2) {
            stateListDrawable.setState(f14974D);
            this.f14993s.removeCallbacks(xVar);
            this.f14993s.postDelayed(xVar, 1200);
        } else if (i4 == 1) {
            this.f14993s.removeCallbacks(xVar);
            this.f14993s.postDelayed(xVar, 1500);
        }
        this.f14996v = i4;
    }

    public final void k() {
        int i4 = this.f14975A;
        ValueAnimator valueAnimator = this.f15000z;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f14975A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // t0.f0
    public final void c(boolean z8) {
    }
}
