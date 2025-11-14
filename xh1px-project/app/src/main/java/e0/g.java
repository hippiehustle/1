package e0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import c0.k;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class g extends AbstractC1638C {

    /* renamed from: i, reason: collision with root package name */
    public final f f10587i;

    public g(TextView textView) {
        this.f10587i = new f(textView);
    }

    @Override // u6.AbstractC1638C
    public final boolean C() {
        return this.f10587i.k;
    }

    @Override // u6.AbstractC1638C
    public final void I(boolean z8) {
        boolean z9;
        if (k.k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        this.f10587i.I(z8);
    }

    @Override // u6.AbstractC1638C
    public final void J(boolean z8) {
        boolean z9;
        f fVar = this.f10587i;
        if (k.k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            fVar.k = z8;
        } else {
            fVar.J(z8);
        }
    }

    @Override // u6.AbstractC1638C
    public final TransformationMethod U(TransformationMethod transformationMethod) {
        boolean z8;
        if (k.k != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return transformationMethod;
        }
        return this.f10587i.U(transformationMethod);
    }

    @Override // u6.AbstractC1638C
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        boolean z8;
        if (k.k != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return inputFilterArr;
        }
        return this.f10587i.y(inputFilterArr);
    }
}
