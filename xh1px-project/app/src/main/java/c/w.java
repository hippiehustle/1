package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class w implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f9362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f9363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f9364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f9365d;

    public w(InterfaceC1163b interfaceC1163b, InterfaceC1163b interfaceC1163b2, InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        this.f9362a = interfaceC1163b;
        this.f9363b = interfaceC1163b2;
        this.f9364c = interfaceC1162a;
        this.f9365d = interfaceC1162a2;
    }

    public final void onBackCancelled() {
        this.f9365d.a();
    }

    public final void onBackInvoked() {
        this.f9364c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        this.f9363b.m(new C0548b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        this.f9362a.m(new C0548b(backEvent));
    }
}
