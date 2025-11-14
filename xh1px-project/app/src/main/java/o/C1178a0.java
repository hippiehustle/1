package o;

import P.AbstractC0274w;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: o.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1178a0 extends TextView {

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13219d;

    /* renamed from: e, reason: collision with root package name */
    public final W f13220e;

    /* renamed from: f, reason: collision with root package name */
    public final C1174B f13221f;

    /* renamed from: g, reason: collision with root package name */
    public C1222x f13222g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13223h;

    /* renamed from: i, reason: collision with root package name */
    public W5.a f13224i;
    public Future j;

    public C1178a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13222g == null) {
            this.f13222g = new C1222x(this);
        }
        return this.f13222g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            c1207p.a();
        }
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (t1.f13387c) {
            return super.getAutoSizeMaxTextSize();
        }
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
        if (w8 != null) {
            return w8.f13144i.f13250f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (t1.f13387c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        W w8 = this.f13220e;
        if (w8 != null) {
            return w8.f13144i.f13245a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public X getSuperCaller() {
        if (this.f13224i == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.f13224i = new Z(this);
            } else if (i4 >= 28) {
                this.f13224i = new Y(this);
            } else if (i4 >= 26) {
                this.f13224i = new W5.a(21, this);
            }
        }
        return this.f13224i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13220e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13220e.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.j;
        if (future != null) {
            try {
                this.j = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    E2.c.Z(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1174B c1174b;
        if (Build.VERSION.SDK_INT < 28 && (c1174b = this.f13221f) != null) {
            TextClassifier textClassifier = (TextClassifier) c1174b.f13042c;
            if (textClassifier == null) {
                return Q.a((TextView) c1174b.f13041b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public N.c getTextMetricsParamsCompat() {
        return E2.c.Z(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13220e.getClass();
        W.h(editorInfo, onCreateInputConnection, this);
        h7.u.h(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 && i4 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        W w8 = this.f13220e;
        if (w8 != null && !t1.f13387c) {
            w8.f13144i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i8) {
        Future future = this.j;
        if (future != null) {
            try {
                this.j = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    E2.c.Z(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i8, int i9) {
        super.onTextChanged(charSequence, i4, i8, i9);
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
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
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.k(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i4);
        } else {
            E2.c.s0(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i4);
        } else {
            E2.c.t0(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        E2.c.u0(this, i4);
    }

    public void setPrecomputedText(N.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        E2.c.Z(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13219d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13220e;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13220e;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1174B c1174b;
        if (Build.VERSION.SDK_INT < 28 && (c1174b = this.f13221f) != null) {
            c1174b.f13042c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<N.d> future) {
        this.j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(N.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f3519b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(cVar.f3518a);
        setBreakStrategy(cVar.f3520c);
        setHyphenationFrequency(cVar.f3521d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f8) {
        boolean z8 = t1.f13387c;
        if (z8) {
            super.setTextSize(i4, f8);
            return;
        }
        W w8 = this.f13220e;
        if (w8 != null) {
            C1188f0 c1188f0 = w8.f13144i;
            if (!z8 && !c1188f0.f()) {
                c1188f0.g(i4, f8);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (this.f13223h) {
            return;
        }
        if (typeface != null && i4 > 0) {
            Context context = getContext();
            E2.b bVar = H.f.f1855a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i4);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f13223h = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f13223h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178a0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b1.a(context);
        this.f13223h = false;
        this.f13224i = null;
        a1.a(this, getContext());
        C1207p c1207p = new C1207p(this);
        this.f13219d = c1207p;
        c1207p.k(attributeSet, i4);
        W w8 = new W(this);
        this.f13220e = w8;
        w8.f(attributeSet, i4);
        w8.b();
        C1174B c1174b = new C1174B();
        c1174b.f13041b = this;
        this.f13221f = c1174b;
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i4, float f8) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            getSuperCaller().j(i4, f8);
        } else if (i8 >= 34) {
            AbstractC0274w.h(this, i4, f8);
        } else {
            E2.c.u0(this, Math.round(TypedValue.applyDimension(i4, f8, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? h4.g.k(context, i4) : null, i8 != 0 ? h4.g.k(context, i8) : null, i9 != 0 ? h4.g.k(context, i9) : null, i10 != 0 ? h4.g.k(context, i10) : null);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? h4.g.k(context, i4) : null, i8 != 0 ? h4.g.k(context, i8) : null, i9 != 0 ? h4.g.k(context, i9) : null, i10 != 0 ? h4.g.k(context, i10) : null);
        W w8 = this.f13220e;
        if (w8 != null) {
            w8.b();
        }
    }
}
