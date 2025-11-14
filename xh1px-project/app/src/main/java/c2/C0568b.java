package c2;

import S1.F;
import T1.K;
import com.buzbuz.smartautoclicker.core.database.ScenarioDatabase;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568b extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public C0999a f9511h;

    /* renamed from: i, reason: collision with root package name */
    public int f9512i;
    public final /* synthetic */ z j;
    public final /* synthetic */ C1001a k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f9513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1164c f9514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568b(z zVar, C1001a c1001a, List list, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.j = zVar;
        this.k = c1001a;
        this.f9513l = list;
        this.f9514m = interfaceC1164c;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        List list = this.f9513l;
        InterfaceC1164c interfaceC1164c = this.f9514m;
        return new C0568b(this.j, this.k, list, interfaceC1164c, (InterfaceC0617c) obj).v(Z5.y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (c2.z.b(r1, r3, r8.f9513l, r8.f9514m, r8) == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r9 == r7) goto L15;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        C0999a c0999a;
        int i4 = this.f9512i;
        z zVar = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    c0999a = this.f9511h;
                    Z5.a.d(obj);
                    return new Long(c0999a.f12187a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            F r8 = ((ScenarioDatabase) zVar.f9602c.f()).r();
            K w8 = h4.g.w(this.k);
            this.f9512i = 1;
            obj = r8.G(w8, this);
        }
        long longValue = ((Number) obj).longValue();
        c0999a = new C0999a(longValue, (Long) null);
        this.f9511h = c0999a;
        this.f9512i = 2;
    }
}
