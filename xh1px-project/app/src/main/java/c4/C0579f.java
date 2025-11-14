package c4;

import D4.y;
import n6.InterfaceC1162a;

/* renamed from: c4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0580g f9659e;

    public /* synthetic */ C0579f(C0580g c0580g, int i4) {
        this.f9658d = i4;
        this.f9659e = c0580g;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f9658d) {
            case 0:
                return this.f9659e.n();
            default:
                return new y(this.f9659e.m(), 27);
        }
    }
}
