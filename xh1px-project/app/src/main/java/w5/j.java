package w5;

import G5.w;
import a.AbstractC0405a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import i0.C0878a;
import java.util.ArrayList;
import t2.C1562a;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public G5.l f15760a;

    /* renamed from: b, reason: collision with root package name */
    public G5.h f15761b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f15762c;

    /* renamed from: d, reason: collision with root package name */
    public C1708a f15763d;

    /* renamed from: e, reason: collision with root package name */
    public LayerDrawable f15764e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15765f;

    /* renamed from: h, reason: collision with root package name */
    public float f15767h;

    /* renamed from: i, reason: collision with root package name */
    public float f15768i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f15769l;

    /* renamed from: m, reason: collision with root package name */
    public f5.e f15770m;

    /* renamed from: n, reason: collision with root package name */
    public f5.e f15771n;

    /* renamed from: o, reason: collision with root package name */
    public float f15772o;

    /* renamed from: q, reason: collision with root package name */
    public int f15774q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f15776s;

    /* renamed from: t, reason: collision with root package name */
    public final C1562a f15777t;

    /* renamed from: y, reason: collision with root package name */
    public C.g f15782y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0878a f15759z = AbstractC0710a.f10768c;

    /* renamed from: A, reason: collision with root package name */
    public static final int f15749A = R.attr.motionDurationLong2;

    /* renamed from: B, reason: collision with root package name */
    public static final int f15750B = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: C, reason: collision with root package name */
    public static final int f15751C = R.attr.motionDurationMedium1;

    /* renamed from: D, reason: collision with root package name */
    public static final int f15752D = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f15753E = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f15754F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f15755G = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f15756H = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f15757I = {android.R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f15758J = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f15766g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f15773p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f15775r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f15778u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f15779v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f15780w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f15781x = new Matrix();

    public j(FloatingActionButton floatingActionButton, C1562a c1562a) {
        this.f15776s = floatingActionButton;
        this.f15777t = c1562a;
        R.g gVar = new R.g(21);
        l lVar = (l) this;
        gVar.f(f15753E, d(new h(lVar, 1)));
        gVar.f(f15754F, d(new h(lVar, 0)));
        gVar.f(f15755G, d(new h(lVar, 0)));
        gVar.f(f15756H, d(new h(lVar, 0)));
        gVar.f(f15757I, d(new h(lVar, 2)));
        gVar.f(f15758J, d(new i(lVar)));
        this.f15772o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f15759z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f8, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f15776s.getDrawable();
        if (drawable != null && this.f15774q != 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            RectF rectF = this.f15779v;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float f9 = this.f15774q;
            RectF rectF2 = this.f15780w;
            rectF2.set(0.0f, 0.0f, f9, f9);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f10 = this.f15774q / 2.0f;
            matrix.postScale(f8, f8, f10, f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [w5.f, android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [w5.f, android.animation.TypeEvaluator, java.lang.Object] */
    public final AnimatorSet b(f5.e eVar, float f8, float f9, float f10) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f8};
        FloatingActionButton floatingActionButton = this.f15776s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f9);
        eVar.d("scale").a(ofFloat2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 26) {
            ?? obj = new Object();
            obj.f15742a = new FloatEvaluator();
            ofFloat2.setEvaluator(obj);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f9);
        eVar.d("scale").a(ofFloat3);
        if (i4 == 26) {
            ?? obj2 = new Object();
            obj2.f15742a = new FloatEvaluator();
            ofFloat3.setEvaluator(obj2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f15781x;
        a(f10, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new f5.d(), new d(this), new Matrix(matrix));
        eVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        E2.b.E(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f8, float f9, float f10, int i4, int i8) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f15776s;
        ofFloat.addUpdateListener(new e(this, floatingActionButton.getAlpha(), f8, floatingActionButton.getScaleX(), f9, floatingActionButton.getScaleY(), this.f15773p, f10, new Matrix(this.f15781x)));
        arrayList.add(ofFloat);
        E2.b.E(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC0832f.x(floatingActionButton.getContext(), i4, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(AbstractC0832f.y(floatingActionButton.getContext(), i8, AbstractC0710a.f10767b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        float f8;
        int i4 = 0;
        if (this.f15765f) {
            i4 = Math.max((this.k - this.f15776s.getSizeDimension()) / 2, 0);
        }
        if (this.f15766g) {
            f8 = e() + this.j;
        } else {
            f8 = 0.0f;
        }
        int max = Math.max(i4, (int) Math.ceil(f8));
        int max2 = Math.max(i4, (int) Math.ceil(f8 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i4);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f8, float f9, float f10);

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f15762c;
        if (drawable != null) {
            drawable.setTintList(E5.a.b(colorStateList));
        }
    }

    public final void n(G5.l lVar) {
        this.f15760a = lVar;
        G5.h hVar = this.f15761b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        Object obj = this.f15762c;
        if (obj instanceof w) {
            ((w) obj).setShapeAppearanceModel(lVar);
        }
        C1708a c1708a = this.f15763d;
        if (c1708a != null) {
            c1708a.f15724o = lVar;
            c1708a.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect = this.f15778u;
        f(rect);
        AbstractC0405a.l(this.f15764e, "Didn't initialize content background");
        boolean o7 = o();
        C1562a c1562a = this.f15777t;
        if (o7) {
            FloatingActionButton.b((FloatingActionButton) c1562a.f15048d, new InsetDrawable((Drawable) this.f15764e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f15764e;
            if (layerDrawable != null) {
                FloatingActionButton.b((FloatingActionButton) c1562a.f15048d, layerDrawable);
            } else {
                c1562a.getClass();
            }
        }
        int i4 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) c1562a.f15048d;
        floatingActionButton.f10165o.set(i4, i8, i9, i10);
        int i11 = floatingActionButton.f10162l;
        floatingActionButton.setPadding(i4 + i11, i8 + i11, i9 + i11, i10 + i11);
    }

    public final void l() {
    }
}
