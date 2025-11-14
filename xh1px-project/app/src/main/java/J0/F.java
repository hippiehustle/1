package J0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends E {
    @Override // J0.E
    public final void M0(View view, int i4, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i4, i8, i9, i10);
    }

    @Override // J0.E
    public final void N0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // J0.E
    public final void O0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a.AbstractC0405a
    public final float S(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // a.AbstractC0405a
    public final void t0(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    @Override // J0.E, a.AbstractC0405a
    public final void u0(View view, int i4) {
        view.setTransitionVisibility(i4);
    }
}
