package u0;

import android.database.SQLException;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Set;
import n6.InterfaceC1164c;

/* renamed from: u0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602G extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15162h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15163i;
    public final /* synthetic */ C1609N j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602G(C1609N c1609n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c1609n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1602G) p((InterfaceC0617c) obj2, (z) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1602G c1602g = new C1602G(this.j, interfaceC0617c);
        c1602g.f15163i = obj;
        return c1602g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r7 == r3) goto L19;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        z zVar;
        int i4 = this.f15162h;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        Z5.a.d(obj);
                        return (Set) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = (z) this.f15163i;
                Z5.a.d(obj);
            } else {
                Z5.a.d(obj);
                zVar = (z) this.f15163i;
                this.f15163i = zVar;
                this.f15162h = 1;
                obj = zVar.b(this);
            }
            if (!((Boolean) obj).booleanValue()) {
                y yVar = y.f15293e;
                C1601F c1601f = new C1601F(this.j, null);
                this.f15163i = null;
                this.f15162h = 2;
                obj = zVar.d(yVar, c1601f, this);
            }
        } catch (SQLException unused) {
        }
        return a6.u.f7768d;
    }
}
