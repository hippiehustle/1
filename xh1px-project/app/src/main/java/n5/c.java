package n5;

import F3.f;
import G5.d;
import G5.h;
import G5.k;
import G5.l;
import P.O;
import R3.r;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.WeakHashMap;
import s.AbstractC1476b;
import s.C1475a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f12995y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f12996z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f12997a;

    /* renamed from: c, reason: collision with root package name */
    public final h f12999c;

    /* renamed from: d, reason: collision with root package name */
    public final h f13000d;

    /* renamed from: e, reason: collision with root package name */
    public int f13001e;

    /* renamed from: f, reason: collision with root package name */
    public int f13002f;

    /* renamed from: g, reason: collision with root package name */
    public int f13003g;

    /* renamed from: h, reason: collision with root package name */
    public int f13004h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f13005i;
    public Drawable j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f13006l;

    /* renamed from: m, reason: collision with root package name */
    public l f13007m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f13008n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f13009o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f13010p;

    /* renamed from: q, reason: collision with root package name */
    public h f13011q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13013s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f13014t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f13015u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13016v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13017w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f12998b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f13012r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f13018x = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f12996z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f12997a = materialCardView;
        h hVar = new h(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f12999c = hVar;
        hVar.k(materialCardView.getContext());
        hVar.o();
        f e9 = hVar.f1769d.f1752a.e();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC0645a.f10638g, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            e9.c(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f13000d = new h();
        h(e9.a());
        this.f13015u = AbstractC0832f.y(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0710a.f10766a);
        this.f13016v = AbstractC0832f.x(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f13017w = AbstractC0832f.x(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(AbstractC1492c abstractC1492c, float f8) {
        if (abstractC1492c instanceof k) {
            return (float) ((1.0d - f12995y) * f8);
        }
        if (abstractC1492c instanceof d) {
            return f8 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        AbstractC1492c abstractC1492c = this.f13007m.f1794a;
        h hVar = this.f12999c;
        return Math.max(Math.max(b(abstractC1492c, hVar.i()), b(this.f13007m.f1795b, hVar.f1769d.f1752a.f1799f.a(hVar.h()))), Math.max(b(this.f13007m.f1796c, hVar.f1769d.f1752a.f1800g.a(hVar.h())), b(this.f13007m.f1797d, hVar.f1769d.f1752a.f1801h.a(hVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f13009o == null) {
            int[] iArr = E5.a.f1245a;
            this.f13011q = new h(this.f13007m);
            this.f13009o = new RippleDrawable(this.k, null, this.f13011q);
        }
        if (this.f13010p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f13009o, this.f13000d, this.j});
            this.f13010p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f13010p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.InsetDrawable, n5.b] */
    public final b d(Drawable drawable) {
        int i4;
        int i8;
        float f8;
        MaterialCardView materialCardView = this.f12997a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            float f9 = 0.0f;
            if (i()) {
                f8 = a();
            } else {
                f8 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f8);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f9 = a();
            }
            i4 = (int) Math.ceil(maxCardElevation2 + f9);
            i8 = ceil;
        } else {
            i4 = 0;
            i8 = 0;
        }
        return new InsetDrawable(drawable, i4, i8, i4, i8);
    }

    public final void e(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f8;
        if (this.f13010p != null) {
            MaterialCardView materialCardView = this.f12997a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                float f9 = 0.0f;
                if (i()) {
                    f8 = a();
                } else {
                    f8 = 0.0f;
                }
                i9 = (int) Math.ceil((maxCardElevation + f8) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f9 = a();
                }
                i10 = (int) Math.ceil((maxCardElevation2 + f9) * 2.0f);
            } else {
                i9 = 0;
                i10 = 0;
            }
            int i17 = this.f13003g;
            if ((i17 & 8388613) == 8388613) {
                i11 = ((i4 - this.f13001e) - this.f13002f) - i10;
            } else {
                i11 = this.f13001e;
            }
            if ((i17 & 80) == 80) {
                i12 = this.f13001e;
            } else {
                i12 = ((i8 - this.f13001e) - this.f13002f) - i9;
            }
            int i18 = i12;
            if ((i17 & 8388613) == 8388613) {
                i13 = this.f13001e;
            } else {
                i13 = ((i4 - this.f13001e) - this.f13002f) - i10;
            }
            if ((i17 & 80) == 80) {
                i14 = ((i8 - this.f13001e) - this.f13002f) - i9;
            } else {
                i14 = this.f13001e;
            }
            int i19 = i14;
            WeakHashMap weakHashMap = O.f4214a;
            if (materialCardView.getLayoutDirection() == 1) {
                i16 = i13;
                i15 = i11;
            } else {
                i15 = i13;
                i16 = i11;
            }
            this.f13010p.setLayerInset(2, i16, i19, i15, i18);
        }
    }

    public final void f(boolean z8, boolean z9) {
        float f8;
        int i4;
        Drawable drawable = this.j;
        if (drawable != null) {
            int i8 = 0;
            float f9 = 0.0f;
            if (z9) {
                if (z8) {
                    f9 = 1.0f;
                }
                if (z8) {
                    f8 = 1.0f - this.f13018x;
                } else {
                    f8 = this.f13018x;
                }
                ValueAnimator valueAnimator = this.f13014t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f13014t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13018x, f9);
                this.f13014t = ofFloat;
                ofFloat.addUpdateListener(new I1.a(7, this));
                this.f13014t.setInterpolator(this.f13015u);
                ValueAnimator valueAnimator2 = this.f13014t;
                if (z8) {
                    i4 = this.f13016v;
                } else {
                    i4 = this.f13017w;
                }
                valueAnimator2.setDuration(i4 * f8);
                this.f13014t.start();
                return;
            }
            if (z8) {
                i8 = 255;
            }
            drawable.setAlpha(i8);
            if (z8) {
                f9 = 1.0f;
            }
            this.f13018x = f9;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.f13006l);
            f(this.f12997a.f10016m, false);
        } else {
            this.j = f12996z;
        }
        LayerDrawable layerDrawable = this.f13010p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(l lVar) {
        this.f13007m = lVar;
        h hVar = this.f12999c;
        hVar.setShapeAppearanceModel(lVar);
        hVar.f1789z = !hVar.f1769d.f1752a.d(hVar.h());
        h hVar2 = this.f13000d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(lVar);
        }
        h hVar3 = this.f13011q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(lVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f12997a;
        if (materialCardView.getPreventCornerOverlap()) {
            h hVar = this.f12999c;
            if (hVar.f1769d.f1752a.d(hVar.h()) && materialCardView.getUseCompatPadding()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        View view = this.f12997a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable;
        Drawable drawable2 = this.f13005i;
        if (j()) {
            drawable = c();
        } else {
            drawable = this.f13000d;
        }
        this.f13005i = drawable;
        if (drawable2 != drawable) {
            MaterialCardView materialCardView = this.f12997a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
            } else {
                materialCardView.setForeground(d(drawable));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1.f1769d.f1752a.d(r1.h()) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f8;
        r rVar;
        MaterialCardView materialCardView = this.f12997a;
        float f9 = 0.0f;
        if (materialCardView.getPreventCornerOverlap()) {
            h hVar = this.f12999c;
        }
        if (!i()) {
            f8 = 0.0f;
            if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
                f9 = (float) ((1.0d - f12995y) * materialCardView.getCardViewRadius());
            }
            int i4 = (int) (f8 - f9);
            Rect rect = this.f12998b;
            materialCardView.f8511f.set(rect.left + i4, rect.top + i4, rect.right + i4, rect.bottom + i4);
            rVar = materialCardView.f8513h;
            if (((CardView) rVar.f5083f).getUseCompatPadding()) {
                rVar.a0(0, 0, 0, 0);
                return;
            }
            C1475a c1475a = (C1475a) ((Drawable) rVar.f5082e);
            float f10 = c1475a.f14437e;
            float f11 = c1475a.f14433a;
            int ceil = (int) Math.ceil(AbstractC1476b.a(f10, f11, r1.getPreventCornerOverlap()));
            int ceil2 = (int) Math.ceil(AbstractC1476b.b(f10, f11, r1.getPreventCornerOverlap()));
            rVar.a0(ceil, ceil2, ceil, ceil2);
            return;
        }
        f8 = a();
        if (materialCardView.getPreventCornerOverlap()) {
            f9 = (float) ((1.0d - f12995y) * materialCardView.getCardViewRadius());
        }
        int i42 = (int) (f8 - f9);
        Rect rect2 = this.f12998b;
        materialCardView.f8511f.set(rect2.left + i42, rect2.top + i42, rect2.right + i42, rect2.bottom + i42);
        rVar = materialCardView.f8513h;
        if (((CardView) rVar.f5083f).getUseCompatPadding()) {
        }
    }

    public final void m() {
        boolean z8 = this.f13012r;
        MaterialCardView materialCardView = this.f12997a;
        if (!z8) {
            materialCardView.setBackgroundInternal(d(this.f12999c));
        }
        materialCardView.setForeground(d(this.f13005i));
    }
}
