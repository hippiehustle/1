package q2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1164c;
import o2.C1229a;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1358d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1365k f13948i;
    public final /* synthetic */ p2.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358d(InterfaceC0617c interfaceC0617c, p2.e eVar, C1365k c1365k) {
        super(2, interfaceC0617c);
        this.f13948i = c1365k;
        this.j = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1358d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1358d(interfaceC0617c, this.j, this.f13948i);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13947h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        C1229a c1229a = this.f13948i.f13962a;
        C0999a c0999a = this.j.f13699a;
        this.f13947h = 1;
        Object e9 = c1229a.f13440a.e(c0999a.f12187a, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (e9 != enumC0646a) {
            e9 = yVar;
        }
        if (e9 == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
