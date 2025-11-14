package u1;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import android.app.Notification;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.LinkedHashMap;
import n6.InterfaceC1164c;
import t1.C1560a;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15302h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1629d f15303i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Notification k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1560a f15304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1628c(C1629d c1629d, int i4, Notification notification, C1560a c1560a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15303i = c1629d;
        this.j = i4;
        this.k = notification;
        this.f15304l = c1560a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1628c c1628c = (C1628c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1628c.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1628c c1628c = new C1628c(this.f15303i, this.j, this.k, this.f15304l, interfaceC0617c);
        c1628c.f15302h = obj;
        return c1628c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f15302h;
        Z5.a.d(obj);
        C1629d c1629d = this.f15303i;
        c1629d.f15307c.put(new Integer(this.j), this.k);
        LinkedHashMap linkedHashMap = c1629d.f15307c;
        C1560a c1560a = this.f15304l;
        linkedHashMap.put(new Integer(c1560a.f15040b), c1560a.f15041c.a());
        long currentTimeMillis = System.currentTimeMillis();
        long j = c1629d.f15309e + 1250;
        y yVar = y.f7506a;
        if (currentTimeMillis > j) {
            C1629d.a(c1629d);
            return yVar;
        }
        if (c1629d.f15308d != null) {
            return yVar;
        }
        c1629d.f15308d = AbstractC0166y.q(interfaceC0163v, null, null, new C1627b(c1629d, null), 3);
        return yVar;
    }
}
