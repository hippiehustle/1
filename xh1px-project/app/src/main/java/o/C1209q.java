package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1209q extends Button {

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13354d;

    /* renamed from: e, reason: collision with root package name */
    public final W f13355e;

    /* renamed from: f, reason: collision with root package name */
    public C1222x f13356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209q(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b1.a(context);
        a1.a(this, getContext());
        C1207p c1207p = new C1207p(this);
        this.f13354d = c1207p;
        c1207p.k(attributeSet, i4);
        W w8 = new W(this);
        this.f13355e = w8;
        w8.f(attributeSet, i4);
        w8.b();
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13356f == null) {
            this.f13356f = new C1222x(this);
        }
        return this.f13356f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (t1.f13387c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            return Math.round(w8.f13144i.f13249e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (t1.f13387c) {
            return super.getAutoSizeMinTextSize();
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            return Math.round(w8.f13144i.f13248d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (t1.f13387c) {
            return super.getAutoSizeStepGranularity();
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            return Math.round(w8.f13144i.f13247c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (t1.f13387c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            return w8.f13144i.f13250f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (t1.f13387c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        W w8 = this.f13355e;
        if (w8 == null) {
            return 0;
        }
        return w8.f13144i.f13245a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13355e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13355e.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        W w8 = this.f13355e;
        if (w8 != null && !t1.f13387c) {
            w8.f13144i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        super.onTextChanged(charSequence, i4, i8, i9);
        W w8 = this.f13355e;
        if (w8 != null) {
            C1188f0 c1188f0 = w8.f13144i;
            if (!t1.f13387c && c1188f0.f()) {
                c1188f0.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i8, int i9, int i10) {
        if (t1.f13387c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i8, i9, i10);
            return;
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.i(i4, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (t1.f13387c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.j(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (t1.f13387c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.c.H0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z8) {
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.f13136a.setAllCaps(z8);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13354d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13355e;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13355e;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        W w8 = this.f13355e;
        if (w8 != null) {
            w8.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f8) {
        boolean z8 = t1.f13387c;
        if (z8) {
            super.setTextSize(i4, f8);
            return;
        }
        W w8 = this.f13355e;
        if (w8 != null) {
            C1188f0 c1188f0 = w8.f13144i;
            if (!z8 && !c1188f0.f()) {
                c1188f0.g(i4, f8);
            }
        }
    }
}
