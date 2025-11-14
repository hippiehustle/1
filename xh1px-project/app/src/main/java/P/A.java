package P;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4201h;

    public A(int i4, Class cls, int i8, int i9, int i10) {
        this.f4201h = i10;
        this.f4203d = i4;
        this.f4206g = cls;
        this.f4205f = i8;
        this.f4204e = i9;
    }

    @Override // P.C
    public final Object d(View view) {
        switch (this.f4201h) {
            case 0:
                return Boolean.valueOf(J.c(view));
            case 1:
                return J.a(view);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return L.b(view);
            default:
                return Boolean.valueOf(J.b(view));
        }
    }

    @Override // P.C
    public final void f(View view, Object obj) {
        switch (this.f4201h) {
            case 0:
                J.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                J.e(view, (CharSequence) obj);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                L.c(view, (CharSequence) obj);
                return;
            default:
                J.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // P.C
    public final boolean i(Object obj, Object obj2) {
        boolean z8;
        boolean z9;
        boolean equals;
        boolean z10;
        boolean z11;
        switch (this.f4201h) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z12 = false;
                if (bool != null && bool.booleanValue()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z8 == z9) {
                    z12 = true;
                }
                return !z12;
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z13 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    z13 = true;
                }
                return !z13;
        }
        return !equals;
    }
}
