package y3;

import L7.InterfaceC0163v;
import T4.k;
import T4.l;
import Z5.y;
import android.content.Intent;
import b2.r;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l2.C1001a;
import n6.InterfaceC1164c;
import o6.j;
import x3.C1787d;

/* renamed from: y3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16501h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1838g f16502i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Intent f16503l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837f(C1838g c1838g, long j, int i4, Intent intent, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16502i = c1838g;
        this.j = j;
        this.k = i4;
        this.f16503l = intent;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1837f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1837f(this.f16502i, this.j, this.k, this.f16503l, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f16501h;
        C1838g c1838g = this.f16502i;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            r rVar = c1838g.f16507e;
            this.f16501h = 1;
            obj = rVar.f(this.j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        C1001a c1001a = (C1001a) obj;
        y yVar = y.f7506a;
        if (c1001a != null) {
            C1787d c1787d = c1838g.f16505c;
            c1787d.getClass();
            Intent intent = this.f16503l;
            j.e(intent, "data");
            W5.a aVar = c1787d.f16126g;
            if (aVar != null) {
                ((SmartAutoClickerService) aVar.f6634e).f9747g.getClass();
                k kVar = l.f5788b;
                if (kVar != null) {
                    kVar.b(this.k, intent, c1001a);
                }
            }
        }
        return yVar;
    }
}
