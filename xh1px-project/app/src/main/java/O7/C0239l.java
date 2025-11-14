package O7;

import P7.AbstractC0285b;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public o6.u f4157h;

    /* renamed from: i, reason: collision with root package name */
    public int f4158i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o6.u k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f4159l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239l(o6.u uVar, InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = uVar;
        this.f4159l = interfaceC0234g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0239l) p((InterfaceC0617c) obj2, new N7.o(((N7.o) obj).f3841a))).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0239l c0239l = new C0239l(this.k, this.f4159l, interfaceC0617c);
        c0239l.j = obj;
        return c0239l;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        o6.u uVar;
        N7.m mVar;
        Throwable th;
        o6.u uVar2;
        int i4 = this.f4158i;
        if (i4 != 0) {
            if (i4 == 1) {
                uVar2 = this.f4157h;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            Object obj2 = ((N7.o) this.j).f3841a;
            boolean z8 = obj2 instanceof N7.n;
            uVar = this.k;
            if (!z8) {
                uVar.f13642d = obj2;
            }
            if (z8) {
                Object obj3 = null;
                if (obj2 instanceof N7.m) {
                    mVar = (N7.m) obj2;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    th = mVar.f3839a;
                } else {
                    th = null;
                }
                if (th == null) {
                    Object obj4 = uVar.f13642d;
                    if (obj4 != null) {
                        if (obj4 != AbstractC0285b.f4640b) {
                            obj3 = obj4;
                        }
                        this.j = obj2;
                        this.f4157h = uVar;
                        this.f4158i = 1;
                        Object n3 = this.f4159l.n(obj3, this);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (n3 == enumC0646a) {
                            return enumC0646a;
                        }
                        uVar2 = uVar;
                    }
                    uVar.f13642d = AbstractC0285b.f4642d;
                } else {
                    throw th;
                }
            }
            return Z5.y.f7506a;
        }
        uVar = uVar2;
        uVar.f13642d = AbstractC0285b.f4642d;
        return Z5.y.f7506a;
    }
}
