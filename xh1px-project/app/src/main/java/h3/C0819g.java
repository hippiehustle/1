package h3;

import D4.y;
import n6.InterfaceC1162a;

/* renamed from: h3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819g implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0820h f11345e;

    public /* synthetic */ C0819g(C0820h c0820h, int i4) {
        this.f11344d = i4;
        this.f11345e = c0820h;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11344d) {
            case 0:
                return this.f11345e.n();
            default:
                return new y(this.f11345e.m(), 29);
        }
    }
}
