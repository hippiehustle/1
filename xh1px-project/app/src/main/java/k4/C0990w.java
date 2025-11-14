package k4;

import L7.InterfaceC0163v;
import androidx.lifecycle.EnumC0504o;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f12128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990w(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12128i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0990w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0990w(this.f12128i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12127h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            H h8 = this.f12128i;
            C0989v c0989v = new C0989v(h8, null);
            this.f12127h = 1;
            Object h9 = androidx.lifecycle.U.h(h8, EnumC0504o.f8848f, c0989v, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h9 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
