package T4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import L7.k0;
import O7.i0;
import Z5.y;
import a6.C0433h;
import android.util.Log;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Objects;
import n6.InterfaceC1164c;
import q2.C1365k;
import s3.C1491b;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5772h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f5773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5773i = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new j(this.f5773i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f5772h;
        k kVar = this.f5773i;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            k0 k0Var = kVar.f5783l;
            if (k0Var != null) {
                this.f5772h = 1;
                Object v8 = k0Var.v(this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (v8 == enumC0646a) {
                    return enumC0646a;
                }
            }
        }
        kVar.f5783l = null;
        C1365k c1365k = kVar.f5779f;
        if (((Boolean) c1365k.k.f()).booleanValue()) {
            c1365k.c();
        }
        c1365k.f13969h.g(null);
        Q7.d dVar = c1365k.f13965d;
        if (dVar != null) {
            AbstractC0166y.e(dVar);
        }
        c1365k.f13965d = null;
        C1.g gVar = kVar.f5775b;
        SmartAutoClickerService smartAutoClickerService = kVar.f5774a;
        D1.d dVar2 = gVar.f576e;
        i0 i0Var = gVar.f578g;
        A4.c cVar = gVar.f575d;
        if (gVar.f579h != null || !((C0433h) cVar.f291e).isEmpty()) {
            ((C0433h) cVar.f291e).getClass();
            Objects.toString(i0Var.f());
            ((C0433h) dVar2.f291e).clear();
            ((i0) dVar2.f292f).g(null);
            gVar.f577f.f561a.clear();
            S4.h hVar = gVar.f579h;
            if (hVar != null) {
                hVar.i();
            }
            int i8 = ((C0433h) cVar.f291e).f7763f;
            for (int i9 = 0; i9 < i8; i9++) {
                dVar2.n(D1.b.f857a);
            }
            if (i0Var.f() == null) {
                gVar.a(smartAutoClickerService);
            }
        }
        v2.h hVar2 = kVar.f5778e;
        hVar2.f15506f = null;
        r2.j jVar = hVar2.f15502b;
        jVar.e();
        i0 i0Var2 = jVar.f14305o;
        if (i0Var2.f() != r2.k.f14308d) {
            Log.w("DetectorEngine", "Clearing the detector but it was still started.");
            jVar.e();
        }
        Log.i("DetectorEngine", "clear");
        i0Var2.f();
        hVar2.f15508h.g(null);
        kVar.j.a();
        C1491b c1491b = (C1491b) kVar.f5785n.getValue();
        c1491b.f14516e.d();
        c1491b.f14515d.d();
        c1491b.f14518g = null;
        Log.i("ServiceNotificationManager", "Notification destroyed");
        return y.f7506a;
    }
}
