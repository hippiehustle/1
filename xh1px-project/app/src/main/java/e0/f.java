package e0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class f extends AbstractC1638C {

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10586i;
    public final C0636d j;
    public boolean k = true;

    public f(TextView textView) {
        this.f10586i = textView;
        this.j = new C0636d(textView);
    }

    @Override // u6.AbstractC1638C
    public final boolean C() {
        return this.k;
    }

    @Override // u6.AbstractC1638C
    public final void I(boolean z8) {
        if (z8) {
            TextView textView = this.f10586i;
            textView.setTransformationMethod(U(textView.getTransformationMethod()));
        }
    }

    @Override // u6.AbstractC1638C
    public final void J(boolean z8) {
        this.k = z8;
        TextView textView = this.f10586i;
        textView.setTransformationMethod(U(textView.getTransformationMethod()));
        textView.setFilters(y(textView.getFilters()));
    }

    @Override // u6.AbstractC1638C
    public final TransformationMethod U(TransformationMethod transformationMethod) {
        if (this.k) {
            if (transformationMethod instanceof j) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new j(transformationMethod);
        }
        if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f10593d;
        }
        return transformationMethod;
    }

    @Override // u6.AbstractC1638C
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof C0636d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            C0636d c0636d = this.j;
            if (i10 < length2) {
                if (inputFilterArr[i10] == c0636d) {
                    return inputFilterArr;
                }
                i10++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0636d;
                return inputFilterArr3;
            }
        }
    }
}
