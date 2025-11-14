package J0;

import a.AbstractC0405a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class E extends AbstractC0405a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2248f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2249g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2250h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2251i = true;

    public void M0(View view, int i4, int i8, int i9, int i10) {
        if (f2250h) {
            try {
                C.a(view, i4, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f2250h = false;
            }
        }
    }

    public void N0(View view, Matrix matrix) {
        if (f2248f) {
            try {
                B.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2248f = false;
            }
        }
    }

    public void O0(View view, Matrix matrix) {
        if (f2249g) {
            try {
                B.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2249g = false;
            }
        }
    }

    @Override // a.AbstractC0405a
    public void u0(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.u0(view, i4);
        } else if (f2251i) {
            try {
                D.a(view, i4);
            } catch (NoSuchMethodError unused) {
                f2251i = false;
            }
        }
    }
}
