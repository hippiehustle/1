package c;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9361a = new Object();

    public final OnBackInvokedCallback a(InterfaceC1162a interfaceC1162a) {
        o6.j.e(interfaceC1162a, "onBackInvoked");
        return new u(0, interfaceC1162a);
    }

    public final void b(Object obj, int i4, Object obj2) {
        o6.j.e(obj, "dispatcher");
        o6.j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        o6.j.e(obj, "dispatcher");
        o6.j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
