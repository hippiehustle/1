package S1;

import k2.AbstractC0951a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5240e;

    public /* synthetic */ K(int i4, int i8) {
        this.f5239d = i8;
        this.f5240e = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f5239d) {
            case 0:
                int i4 = this.f5240e;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                D0.c L8 = aVar.L("SELECT scenario_id FROM tutorial_success_table WHERE tutorial_index=?");
                try {
                    L8.c(1, i4);
                    Long l6 = null;
                    if (L8.H() && !L8.isNull(0)) {
                        l6 = Long.valueOf(L8.getLong(0));
                    }
                    return l6;
                } finally {
                    L8.close();
                }
            default:
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a, "oldValue");
                return AbstractC0951a.f(abstractC0951a, null, this.f5240e, false, 119);
        }
    }
}
