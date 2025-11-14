package D4;

import L7.AbstractC0166y;
import androidx.lifecycle.U;
import com.google.android.material.textview.MaterialTextView;
import t4.C1583k;

/* loaded from: classes.dex */
public final /* synthetic */ class B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f900b;

    public /* synthetic */ B(int i4, Object obj) {
        this.f899a = i4;
        this.f900b = obj;
    }

    public final void a(I5.e eVar, float f8, boolean z8) {
        int i4 = this.f899a;
        Object obj = this.f900b;
        switch (i4) {
            case 0:
                H h8 = (H) obj;
                if (z8) {
                    P S8 = h8.S();
                    AbstractC0166y.q(U.g(S8), null, null, new K(S8, (int) f8, null), 3);
                    return;
                }
                return;
            case 1:
                MaterialTextView materialTextView = (MaterialTextView) ((A4.c) obj).f292f;
                int i8 = (int) f8;
                String str = i8 + " %";
                if (str == null) {
                    str = String.valueOf(i8);
                }
                E2.c.z0(materialTextView, str);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                k4.r rVar = (k4.r) obj;
                if (z8) {
                    rVar.m(Float.valueOf(f8));
                    return;
                }
                return;
            default:
                C1583k c1583k = (C1583k) obj;
                if (z8) {
                    c1583k.t().e(h2.a.x(f8));
                    return;
                }
                return;
        }
    }
}
