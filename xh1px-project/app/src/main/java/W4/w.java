package W4;

import L7.InterfaceC0163v;
import Z5.y;
import a5.C0422f;
import a5.C0423g;
import a5.EnumC0424h;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f6624i;
    public final /* synthetic */ EnumC0424h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, EnumC0424h enumC0424h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6624i = xVar;
        this.j = enumC0424h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new w(this.f6624i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6623h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0423g c0423g = this.f6624i.f6626c;
            this.f6623h = 1;
            Object P4 = c0423g.f7749a.P(new C0422f(this.j, null), this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (P4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
