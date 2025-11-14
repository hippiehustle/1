package w1;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162a f15659i;
    public final /* synthetic */ e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689c(InterfaceC1162a interfaceC1162a, e eVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15659i = interfaceC1162a;
        this.j = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1689c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1689c(this.f15659i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15658h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f15659i.a();
            this.f15658h = 1;
            Object g8 = AbstractC0166y.g(500L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        this.j.f15669m = null;
        return y.f7506a;
    }
}
