package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public t0 f4207a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0268p f4209c;

    public E(View view, InterfaceC0268p interfaceC0268p) {
        this.f4208b = view;
        this.f4209c = interfaceC0268p;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 g8 = t0.g(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        InterfaceC0268p interfaceC0268p = this.f4209c;
        if (i4 < 30) {
            F.a(windowInsets, this.f4208b);
            if (g8.equals(this.f4207a)) {
                return interfaceC0268p.y(view, g8).f();
            }
        }
        this.f4207a = g8;
        t0 y4 = interfaceC0268p.y(view, g8);
        if (i4 >= 30) {
            return y4.f();
        }
        WeakHashMap weakHashMap = O.f4214a;
        D.c(view);
        return y4.f();
    }
}
