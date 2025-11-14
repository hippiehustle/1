package c;

import android.window.OnBackInvokedCallback;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f9366a = new Object();

    public final OnBackInvokedCallback a(InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2, InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        o6.j.e(interfaceC1163b, "onBackStarted");
        o6.j.e(interfaceC1163b2, "onBackProgressed");
        o6.j.e(interfaceC1162a, "onBackInvoked");
        o6.j.e(interfaceC1162a2, "onBackCancelled");
        return new w(interfaceC1163b, interfaceC1163b2, interfaceC1162a, interfaceC1162a2);
    }
}
