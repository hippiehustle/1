package c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import i.AbstractActivityC0870i;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9353a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9354b = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7, types: [c.r] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static void a(AbstractActivityC0870i abstractActivityC0870i) {
        ?? r02;
        C0545B c0545b = C0545B.f9303e;
        C0546C c0546c = new C0546C(0, 0, c0545b);
        C0546C c0546c2 = new C0546C(f9353a, f9354b, c0545b);
        View decorView = abstractActivityC0870i.getWindow().getDecorView();
        o6.j.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        o6.j.d(resources, "view.resources");
        boolean booleanValue = ((Boolean) c0545b.m(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        o6.j.d(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) c0545b.m(resources2)).booleanValue();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            r02 = new Object();
        } else if (i4 >= 26) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        Window window = abstractActivityC0870i.getWindow();
        o6.j.d(window, "window");
        r02.a(c0546c, c0546c2, window, decorView, booleanValue, booleanValue2);
    }
}
