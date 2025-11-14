package e0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import c0.k;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final TransformationMethod f10593d;

    public j(TransformationMethod transformationMethod) {
        this.f10593d = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f10593d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && k.a().b() == 1) {
            k a3 = k.a();
            a3.getClass();
            return a3.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z8, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f10593d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z8, i4, rect);
        }
    }
}
