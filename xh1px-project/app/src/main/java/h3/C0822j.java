package h3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;

/* renamed from: h3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f11353h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0822j(InterfaceC1162a interfaceC1162a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11353h = interfaceC1162a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0822j c0822j = (C0822j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0822j.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0822j(this.f11353h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f11353h.a();
        return y.f7506a;
    }
}
