package b5;

import L7.InterfaceC0163v;
import O7.i0;
import P7.AbstractC0285b;
import Q7.t;
import Z5.y;
import b2.r;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f9196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f9197i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9197i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f9197i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Object f8;
        Object f9;
        i iVar;
        t tVar = AbstractC0285b.f4640b;
        h hVar = this.f9197i;
        i0 i0Var = hVar.f9200d;
        int i4 = this.f9196h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            do {
                f8 = i0Var.f();
                if (f8 == null) {
                    f8 = tVar;
                }
            } while (!i0Var.h(f8, i.f9203e));
            r rVar = hVar.f9199c;
            this.f9196h = 1;
            obj = rVar.i(this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        do {
            f9 = i0Var.f();
            if (booleanValue) {
                iVar = i.f9204f;
            } else {
                iVar = i.f9205g;
            }
            if (f9 == null) {
                f9 = tVar;
            }
        } while (!i0Var.h(f9, iVar));
        return y.f7506a;
    }
}
