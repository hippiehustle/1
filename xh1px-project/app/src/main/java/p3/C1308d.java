package p3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1309e f13715e;

    public /* synthetic */ C1308d(C1309e c1309e, int i4) {
        this.f13714d = i4;
        this.f13715e = c1309e;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13714d) {
            case 0:
                return this.f13715e.n();
            default:
                return new C0932r(this.f13715e.m(), 13);
        }
    }
}
