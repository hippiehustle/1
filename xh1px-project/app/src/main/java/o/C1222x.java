package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC0805a;
import u6.AbstractC1638C;

/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13407a;

    /* renamed from: b, reason: collision with root package name */
    public final W5.a f13408b;

    public C1222x(TextView textView) {
        this.f13407a = textView;
        this.f13408b = new W5.a(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((AbstractC1638C) this.f13408b.f6634e).y(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f13407a.getContext().obtainStyledAttributes(attributeSet, AbstractC0805a.f11283i, i4, 0);
        try {
            boolean z8 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z8 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z8) {
        ((AbstractC1638C) this.f13408b.f6634e).I(z8);
    }

    public final void d(boolean z8) {
        ((AbstractC1638C) this.f13408b.f6634e).J(z8);
    }
}
