package X6;

import Z5.y;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class k implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7012d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7013e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7014f;

    public /* synthetic */ k(int i4, String str, String str2) {
        this.f7012d = i4;
        this.f7013e = str;
        this.f7014f = str2;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        p pVar = (p) obj;
        switch (this.f7012d) {
            case 0:
                o6.j.e(pVar, "$this$function");
                e eVar = m.f7018b;
                String str = this.f7013e;
                pVar.a(str, eVar);
                e eVar2 = m.f7017a;
                pVar.a(this.f7014f, eVar, eVar, eVar2, eVar2);
                pVar.b(str, eVar2);
                return y.f7506a;
            case 1:
                o6.j.e(pVar, "$this$function");
                e eVar3 = m.f7018b;
                String str2 = this.f7013e;
                pVar.a(str2, eVar3);
                pVar.a(this.f7014f, eVar3, eVar3, eVar3);
                pVar.b(str2, eVar3);
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(pVar, "$this$function");
                e eVar4 = m.f7018b;
                String str3 = this.f7013e;
                pVar.a(str3, eVar4);
                e eVar5 = m.f7019c;
                e eVar6 = m.f7017a;
                pVar.a(this.f7014f, eVar4, eVar4, eVar5, eVar6);
                pVar.b(str3, eVar6);
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(pVar, "$this$function");
                e eVar7 = m.f7018b;
                String str4 = this.f7013e;
                pVar.a(str4, eVar7);
                e eVar8 = m.f7019c;
                pVar.a(str4, eVar8);
                e eVar9 = m.f7017a;
                pVar.a(this.f7014f, eVar7, eVar8, eVar8, eVar9);
                pVar.b(str4, eVar9);
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(pVar, "$this$function");
                e eVar10 = m.f7019c;
                pVar.a(this.f7013e, eVar10);
                pVar.b(this.f7014f, m.f7018b, eVar10);
                return y.f7506a;
            default:
                o6.j.e(pVar, "$this$function");
                pVar.a(this.f7013e, m.f7017a);
                pVar.b(this.f7014f, m.f7018b, m.f7019c);
                return y.f7506a;
        }
    }
}
