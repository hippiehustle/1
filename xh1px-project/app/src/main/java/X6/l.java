package X6;

import Z5.y;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class l implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7015d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7016e;

    public /* synthetic */ l(String str, int i4) {
        this.f7015d = i4;
        this.f7016e = str;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        p pVar = (p) obj;
        switch (this.f7015d) {
            case 0:
                o6.j.e(pVar, "$this$function");
                pVar.b(this.f7016e, m.f7018b);
                return y.f7506a;
            case 1:
                o6.j.e(pVar, "$this$function");
                e eVar = m.f7018b;
                pVar.b(this.f7016e, eVar, eVar);
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(pVar, "$this$function");
                e eVar2 = m.f7018b;
                pVar.a(this.f7016e, eVar2, eVar2);
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(pVar, "$this$function");
                pVar.a(this.f7016e, m.f7018b);
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(pVar, "$this$function");
                pVar.a(this.f7016e, m.f7018b);
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(pVar, "$this$function");
                pVar.b(this.f7016e, m.f7018b);
                return y.f7506a;
            default:
                o6.j.e(pVar, "$this$function");
                pVar.b(this.f7016e, m.f7018b);
                return y.f7506a;
        }
    }
}
