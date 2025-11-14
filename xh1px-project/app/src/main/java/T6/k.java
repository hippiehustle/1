package T6;

import I6.C0064c;
import a6.AbstractC0425A;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class k implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5855d;

    /* renamed from: e, reason: collision with root package name */
    public final o f5856e;

    public /* synthetic */ k(o oVar, int i4) {
        this.f5855d = i4;
        this.f5856e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5855d) {
            case 0:
                Class<?>[] declaredClasses = this.f5856e.f5870o.f2208a.getDeclaredClasses();
                o6.j.d(declaredClasses, "getDeclaredClasses(...)");
                return AbstractC0436k.V0(H7.m.Y(H7.m.X(new H7.g(AbstractC0434i.L0(declaredClasses), false, C0064c.f2189g), C0064c.f2190h)));
            case 1:
                List b4 = this.f5856e.f5870o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : b4) {
                    if (((I6.u) obj).f2214a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int N02 = a6.x.N0(AbstractC0438m.d0(arrayList, 10));
                if (N02 < 16) {
                    N02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((I6.u) next).c(), next);
                }
                return linkedHashMap;
            default:
                o oVar = this.f5856e;
                return AbstractC0425A.g0(oVar.b(), oVar.c());
        }
    }
}
