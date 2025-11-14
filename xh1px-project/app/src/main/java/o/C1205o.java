package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1205o extends AutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13324g = {R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13325d;

    /* renamed from: e, reason: collision with root package name */
    public final W f13326e;

    /* renamed from: f, reason: collision with root package name */
    public final C1174B f13327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.autoCompleteTextViewStyle);
        b1.a(context);
        a1.a(this, getContext());
        R.g J6 = R.g.J(getContext(), attributeSet, f13324g, com.buzbuz.smartautoclicker.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) J6.f4988f).hasValue(0)) {
            setDropDownBackgroundDrawable(J6.A(0));
        }
        J6.L();
        C1207p c1207p = new C1207p(this);
        this.f13325d = c1207p;
        c1207p.k(attributeSet, com.buzbuz.smartautoclicker.R.attr.autoCompleteTextViewStyle);
        W w8 = new W(this);
        this.f13326e = w8;
        w8.f(attributeSet, com.buzbuz.smartautoclicker.R.attr.autoCompleteTextViewStyle);
        w8.b();
        C1174B c1174b = new C1174B(this);
        this.f13327f = c1174b;
        c1174b.b(attributeSet, com.buzbuz.smartautoclicker.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a3 = c1174b.a(keyListener);
            if (a3 != keyListener) {
                super.setKeyListener(a3);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13326e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13326e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13326e.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h7.u.h(editorInfo, onCreateInputConnection, this);
        return this.f13327f.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13326e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13326e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.c.H0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(h4.g.k(getContext(), i4));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f13327f.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f13327f.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13325d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13326e;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13326e;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        W w8 = this.f13326e;
        if (w8 != null) {
            w8.g(context, i4);
        }
    }
}
