package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1164c;
import u6.AbstractC1638C;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6716h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6717i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335c(List list, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = list;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0335c) p((InterfaceC0617c) obj2, (C0342j) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0335c c0335c = new C0335c(this.j, interfaceC0617c);
        c0335c.f6717i = obj;
        return c0335c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6716h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0342j c0342j = (C0342j) this.f6717i;
            this.f6716h = 1;
            Object e9 = AbstractC1638C.e(this.j, c0342j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (e9 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
