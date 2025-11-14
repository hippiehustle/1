package t0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class O extends J {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f14779q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p8, Context context) {
        super(context);
        this.f14779q = p8;
    }

    @Override // t0.J
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // t0.J
    public final int e(int i4) {
        return Math.min(100, super.e(i4));
    }

    @Override // t0.J
    public final void h(View view, m0 m0Var) {
        P p8 = this.f14779q;
        int[] b4 = p8.b(p8.f14780a.getLayoutManager(), view);
        int i4 = b4[0];
        int i8 = b4[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i4), Math.abs(i8))) / 0.3356d);
        if (ceil > 0) {
            m0Var.f14891a = i4;
            m0Var.f14892b = i8;
            m0Var.f14893c = ceil;
            m0Var.f14895e = this.j;
            m0Var.f14896f = true;
        }
    }
}
