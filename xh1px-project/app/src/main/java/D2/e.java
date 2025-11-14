package D2;

import Z5.y;
import android.view.View;
import java.util.LinkedHashMap;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1165d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f868e;

    public /* synthetic */ e(int i4, Object obj) {
        this.f867d = i4;
        this.f868e = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        View view;
        switch (this.f867d) {
            case 0:
                LinkedHashMap linkedHashMap = ((C1.a) this.f868e).f561a;
                d dVar = (d) obj;
                View view2 = (View) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                o6.j.e(dVar, "item");
                o6.j.e(view2, "view");
                if (booleanValue && !linkedHashMap.containsKey(dVar)) {
                    linkedHashMap.put(dVar, view2);
                } else if (!booleanValue && (view = (View) linkedHashMap.get(dVar)) != null && view.equals(view2)) {
                    linkedHashMap.remove(dVar);
                }
                return y.f7506a;
            case 1:
                ((A1.h) this.f868e).m((Throwable) obj);
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                U7.c cVar = (U7.c) this.f868e;
                U7.c.k.set(cVar, null);
                cVar.a(null);
                return y.f7506a;
            default:
                ((U7.g) this.f868e).c();
                return y.f7506a;
        }
    }

    public /* synthetic */ e(U7.c cVar, U7.b bVar) {
        this.f867d = 2;
        this.f868e = cVar;
    }
}
