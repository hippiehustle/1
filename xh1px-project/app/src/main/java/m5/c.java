package m5;

import G5.h;
import G5.l;
import G5.w;
import P.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import h4.AbstractC0832f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f12526a;

    /* renamed from: b, reason: collision with root package name */
    public l f12527b;

    /* renamed from: c, reason: collision with root package name */
    public int f12528c;

    /* renamed from: d, reason: collision with root package name */
    public int f12529d;

    /* renamed from: e, reason: collision with root package name */
    public int f12530e;

    /* renamed from: f, reason: collision with root package name */
    public int f12531f;

    /* renamed from: g, reason: collision with root package name */
    public int f12532g;

    /* renamed from: h, reason: collision with root package name */
    public int f12533h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f12534i;
    public ColorStateList j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f12535l;

    /* renamed from: m, reason: collision with root package name */
    public h f12536m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12540q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f12542s;

    /* renamed from: t, reason: collision with root package name */
    public int f12543t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12537n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12538o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12539p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12541r = true;

    public c(MaterialButton materialButton, l lVar) {
        this.f12526a = materialButton;
        this.f12527b = lVar;
    }

    public final w a() {
        RippleDrawable rippleDrawable = this.f12542s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f12542s.getNumberOfLayers() > 2) {
                return (w) this.f12542s.getDrawable(2);
            }
            return (w) this.f12542s.getDrawable(1);
        }
        return null;
    }

    public final h b(boolean z8) {
        RippleDrawable rippleDrawable = this.f12542s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (h) ((LayerDrawable) ((InsetDrawable) this.f12542s.getDrawable(0)).getDrawable()).getDrawable(!z8 ? 1 : 0);
        }
        return null;
    }

    public final void c(l lVar) {
        this.f12527b = lVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lVar);
        }
    }

    public final void d(int i4, int i8) {
        WeakHashMap weakHashMap = O.f4214a;
        MaterialButton materialButton = this.f12526a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f12530e;
        int i10 = this.f12531f;
        this.f12531f = i8;
        this.f12530e = i4;
        if (!this.f12538o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i4) - i9, paddingEnd, (paddingBottom + i8) - i10);
    }

    public final void e() {
        int i4;
        h hVar = new h(this.f12527b);
        MaterialButton materialButton = this.f12526a;
        hVar.k(materialButton.getContext());
        hVar.setTintList(this.j);
        PorterDuff.Mode mode = this.f12534i;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        float f8 = this.f12533h;
        ColorStateList colorStateList = this.k;
        hVar.f1769d.j = f8;
        hVar.invalidateSelf();
        hVar.q(colorStateList);
        h hVar2 = new h(this.f12527b);
        hVar2.setTint(0);
        float f9 = this.f12533h;
        if (this.f12537n) {
            i4 = AbstractC0832f.o(materialButton, R.attr.colorSurface);
        } else {
            i4 = 0;
        }
        hVar2.f1769d.j = f9;
        hVar2.invalidateSelf();
        hVar2.q(ColorStateList.valueOf(i4));
        h hVar3 = new h(this.f12527b);
        this.f12536m = hVar3;
        hVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(E5.a.b(this.f12535l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f12528c, this.f12530e, this.f12529d, this.f12531f), this.f12536m);
        this.f12542s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b4 = b(false);
        if (b4 != null) {
            b4.l(this.f12543t);
            b4.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i4 = 0;
        h b4 = b(false);
        h b9 = b(true);
        if (b4 != null) {
            float f8 = this.f12533h;
            ColorStateList colorStateList = this.k;
            b4.f1769d.j = f8;
            b4.invalidateSelf();
            b4.q(colorStateList);
            if (b9 != null) {
                float f9 = this.f12533h;
                if (this.f12537n) {
                    i4 = AbstractC0832f.o(this.f12526a, R.attr.colorSurface);
                }
                b9.f1769d.j = f9;
                b9.invalidateSelf();
                b9.q(ColorStateList.valueOf(i4));
            }
        }
    }
}
