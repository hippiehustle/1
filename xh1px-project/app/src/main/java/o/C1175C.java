package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.buzbuz.smartautoclicker.R;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1175C extends RadioButton implements S.k {

    /* renamed from: d, reason: collision with root package name */
    public final C1214t f13045d;

    /* renamed from: e, reason: collision with root package name */
    public final C1207p f13046e;

    /* renamed from: f, reason: collision with root package name */
    public final W f13047f;

    /* renamed from: g, reason: collision with root package name */
    public C1222x f13048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        b1.a(context);
        a1.a(this, getContext());
        C1214t c1214t = new C1214t(this);
        this.f13045d = c1214t;
        c1214t.c(attributeSet, R.attr.radioButtonStyle);
        C1207p c1207p = new C1207p(this);
        this.f13046e = c1207p;
        c1207p.k(attributeSet, R.attr.radioButtonStyle);
        W w8 = new W(this);
        this.f13047f = w8;
        w8.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13048g == null) {
            this.f13048g = new C1222x(this);
        }
        return this.f13048g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13047f;
        if (w8 != null) {
            w8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    @Override // S.k
    public ColorStateList getSupportButtonTintList() {
        C1214t c1214t = this.f13045d;
        if (c1214t != null) {
            return c1214t.f13379a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1214t c1214t = this.f13045d;
        if (c1214t != null) {
            return c1214t.f13380b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13047f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13047f.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1214t c1214t = this.f13045d;
        if (c1214t != null) {
            if (c1214t.f13383e) {
                c1214t.f13383e = false;
            } else {
                c1214t.f13383e = true;
                c1214t.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13047f;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13047f;
        if (w8 != null) {
            w8.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13046e;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    @Override // S.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1214t c1214t = this.f13045d;
        if (c1214t != null) {
            c1214t.f13379a = colorStateList;
            c1214t.f13381c = true;
            c1214t.a();
        }
    }

    @Override // S.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1214t c1214t = this.f13045d;
        if (c1214t != null) {
            c1214t.f13380b = mode;
            c1214t.f13382d = true;
            c1214t.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13047f;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13047f;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(h4.g.k(getContext(), i4));
    }
}
