package y3;

import L7.InterfaceC0163v;
import T4.k;
import T4.l;
import Z5.y;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o2.C1229a;
import x3.C1787d;

/* renamed from: y3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1836e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1838g f16500i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836e(C1838g c1838g, long j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16500i = c1838g;
        this.j = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1836e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1836e(this.f16500i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f16499h;
        C1838g c1838g = this.f16500i;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1229a c1229a = c1838g.f16508f;
            this.f16499h = 1;
            obj = c1229a.f13440a.d(this.j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        p2.e eVar = (p2.e) obj;
        y yVar = y.f7506a;
        if (eVar != null) {
            C1787d c1787d = c1838g.f16505c;
            c1787d.getClass();
            W5.a aVar = c1787d.f16126g;
            if (aVar != null) {
                ((SmartAutoClickerService) aVar.f6634e).f9747g.getClass();
                k kVar = l.f5788b;
                if (kVar != null) {
                    kVar.a(eVar);
                }
            }
        }
        return yVar;
    }
}
