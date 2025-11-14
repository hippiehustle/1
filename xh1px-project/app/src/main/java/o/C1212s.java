package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;

/* renamed from: o.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212s extends CheckedTextView {

    /* renamed from: d, reason: collision with root package name */
    public final C1214t f13365d;

    /* renamed from: e, reason: collision with root package name */
    public final C1207p f13366e;

    /* renamed from: f, reason: collision with root package name */
    public final W f13367f;

    /* renamed from: g, reason: collision with root package name */
    public C1222x f13368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1212s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        b1.a(context);
        a1.a(this, getContext());
        W w8 = new W(this);
        this.f13367f = w8;
        w8.f(attributeSet, R.attr.checkedTextViewStyle);
        w8.b();
        C1207p c1207p = new C1207p(this);
        this.f13366e = c1207p;
        c1207p.k(attributeSet, R.attr.checkedTextViewStyle);
        this.f13365d = new C1214t(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0805a.f11284l;
        R.g J6 = R.g.J(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        P.O.l(this, getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(h4.g.k(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(J6.z(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC1202m0.c(typedArray.getInt(3, -1), null));
                }
                J6.L();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(h4.g.k(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            J6.L();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            J6.L();
            throw th;
        }
    }

    private C1222x getEmojiTextViewHelper() {
        if (this.f13368g == null) {
            this.f13368g = new C1222x(this);
        }
        return this.f13368g;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w8 = this.f13367f;
        if (w8 != null) {
            w8.b();
        }
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            c1207p.a();
        }
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            c1214t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E2.c.F0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            return c1214t.f13379a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            return c1214t.f13380b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13367f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13367f.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h7.u.h(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            if (c1214t.f13383e) {
                c1214t.f13383e = false;
            } else {
                c1214t.f13383e = true;
                c1214t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13367f;
        if (w8 != null) {
            w8.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w8 = this.f13367f;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13366e;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            c1214t.f13379a = colorStateList;
            c1214t.f13381c = true;
            c1214t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1214t c1214t = this.f13365d;
        if (c1214t != null) {
            c1214t.f13380b = mode;
            c1214t.f13382d = true;
            c1214t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w8 = this.f13367f;
        w8.l(colorStateList);
        w8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w8 = this.f13367f;
        w8.m(mode);
        w8.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        W w8 = this.f13367f;
        if (w8 != null) {
            w8.g(context, i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(h4.g.k(getContext(), i4));
    }
}
