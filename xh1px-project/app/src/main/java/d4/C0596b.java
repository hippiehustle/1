package d4;

import D4.t;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f10370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0600f f10371i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596b(C0600f c0600f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10371i = c0600f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0596b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0596b(this.f10371i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f10370h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0600f c0600f = this.f10371i;
            A4.c cVar = ((C0604j) c0600f.f10381x.getValue()).f10393f;
            C0595a c0595a = c0600f.f10382y;
            if (c0595a != null) {
                t tVar = new t(16, c0595a);
                this.f10370h = 1;
                Object x8 = cVar.x(tVar, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("actionsAdapter");
                throw null;
            }
        }
        return y.f7506a;
    }
}
