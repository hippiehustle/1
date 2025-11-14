package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: o.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190g0 extends ToggleButton {

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13255d;

    /* renamed from: e, reason: collision with root package name */
    public final W f13256e;

    /* renamed from: f, reason: collision with root package name */
    public C1222x f13257f;

    public C1190g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        a1.a(this, getContext());
        C1207p c1207p = new C1207p(this);
        this.f13255d = c1207p;
        c1207p.k(attributeSet, R.attr.buttonStyleToggle);
        W w8 = new W(this);
        this.f13256e = w8;
        w8.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13257f == null) {
            this.f13257f = new C1222x(this);
        }
        return this.f13257f;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13256e;
        if (w8 != null) {
            w8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13256e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13256e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13256e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13256e;
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
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13255d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13256e;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13256e;
        w8.m(mode);
        w8.b();
    }
}
