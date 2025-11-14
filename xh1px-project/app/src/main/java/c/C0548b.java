package c;

import android.window.BackEvent;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548b {

    /* renamed from: a, reason: collision with root package name */
    public final float f9307a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9308b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9309c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9310d;

    public C0548b(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        C0547a c0547a = C0547a.f9306a;
        float d2 = c0547a.d(backEvent);
        float e9 = c0547a.e(backEvent);
        float b4 = c0547a.b(backEvent);
        int c6 = c0547a.c(backEvent);
        this.f9307a = d2;
        this.f9308b = e9;
        this.f9309c = b4;
        this.f9310d = c6;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f9307a + ", touchY=" + this.f9308b + ", progress=" + this.f9309c + ", swipeEdge=" + this.f9310d + '}';
    }
}
